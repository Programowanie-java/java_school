package gameboard;

import actors.Player;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author adams
 */
public class BoardGame extends JPanel{
    private int WIDTH, HEIGHT;
    private int DELAY = 10;
    public Player player;
    Thread thread;

    public BoardGame(int WIDTH, int HEIGHT) {
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        init();
        startGame();
        thread.start();
    }
    
    private void init(){
        //addKeyListener(new Key());
        player = new Player(400);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D)g;
        //WYPEŁNIENIE KOLOREM PLANSZY DO GRY!!!!
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, WIDTH, HEIGHT);
        
        
        g2.setColor(Color.BLACK);
        g2.fillRect(player.getX(), 500, 80, 10);
        g2.setColor(Color.YELLOW);
        g2.fillOval(150, 200, 20, 20);
        
    }
    
    private void startGame(){
        thread = new Thread(() -> {
            long beforeTime, timeDiff, sleep;
            while(true){
                beforeTime = System.currentTimeMillis(); //pobranie czasu przed animacją
                   
                repaint();
                //Aby animacja była stałą i nie rwała!!!
                timeDiff = System.currentTimeMillis() - beforeTime; //Czas po wykonaniu repaint()
                sleep = DELAY - timeDiff;
//                 sleep = DELAY;
                if(sleep < 0) sleep = 2;
                
                try {
                    Thread.sleep(sleep); //Odczekanie odpowiedniego czasu
                } catch (InterruptedException ex) {
                    System.out.println("Coś poszło nie tak");
                }
                //System.out.println(beforeTime+"  "+timeDiff+"   SLEEP = "+sleep);
            }
        });
    }
    private class Key extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e){
                System.out.println("Key => keyPressed");
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                        player.move(true);
                }
                if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                        player.move(false);
                }
        }
    }
}
