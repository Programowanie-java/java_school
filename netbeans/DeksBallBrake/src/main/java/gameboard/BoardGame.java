package gameboard;

import actors.Player;
import as.deskballbreake.interfaces.StaticData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author adams
 */
public class BoardGame extends JPanel implements StaticData{ 
    
    private int WIDTH, HEIGHT;
    private int DELAY = 10;
    private Player player;  //Nasz prostokąt na dole
    private ArrayList<Player> playersList = new ArrayList<>();
    Thread thread; //NASZ GŁÓWNY WĄTEK!!!

    public BoardGame(int WIDTH, int HEIGHT) {
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        init();
        startGame();
        thread.start();
    }
    
    private void init(){
        //addKeyListener(new Key());
        initPlayers(StaticData.PLAYERS_QUANTITY);
    }
    
    private void initPlayers(int quantity){
        Random r = new Random();
        int width = 0, height = 0;
        for (int i=0; i< quantity;i++){
            width = r.nextInt(100)+20;
            height = r.nextInt(10)+10;
            playersList.add(new Player(r.nextInt(WIDTH-width), r.nextInt(HEIGHT-height), 
                    WIDTH, HEIGHT, width, height, r.nextInt(4)+1, r.nextInt(4)+1,
                    new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256))));
        }
    }
    
    private void movePlayers(){
        for (int i=0; i< playersList.size();i++){
            playersList.get(i).move();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        //super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D)g;
        //Aby animacja była płynniejsza
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.setRenderingHints(rh);
                
        //WYPEŁNIENIE KOLOREM PLANSZY DO GRY!!!!
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, WIDTH, HEIGHT);
        
        for(int i =0;i<playersList.size();i++){
            g2.setColor(playersList.get(i).getColor());
            g2.fillRect(playersList.get(i).getX(), playersList.get(i).getY(), playersList.get(i).getWidth(), playersList.get(i).getHeight());
        }
        
        g2.setColor(Color.YELLOW);
        g2.fillOval(150, 200, 20, 20);
        
        Toolkit.getDefaultToolkit().sync();
    }
    
    private void startGame(){
        thread = new Thread(() -> {
            long beforeTime, timeDiff, sleep;
            while(true){
                beforeTime = System.currentTimeMillis(); //pobranie czasu przed animacją
                //===========================================================   
                movePlayers();
                repaint();
                collisionDetection();
                //Aby animacja była stała i nie rwała!!!
                timeDiff = System.currentTimeMillis() - beforeTime; //Czas po wykonaniu repaint()
                sleep = DELAY - timeDiff;
//                 sleep = DELAY;
                if(sleep < 0) sleep = 2;
                try {
                    Thread.sleep(sleep); //Odczekanie odpowiedniego czasu
                } catch (InterruptedException ex) {
                    System.out.println("Coś poszło nie tak");
                }
                System.out.println(" Czas: "+timeDiff+"   SLEEP = "+sleep);
            }
        });
    }
    
    private void collisionDetection(){
        Rectangle p1,p2;
        int i=0;
        if(playersList.size()>1){
            while( i<playersList.size()){
                for(int j=i+1;j<playersList.size();j++){
                    p1 = playersList.get(i).getBounds();
                    p2 = playersList.get(j).getBounds();
                    if(p1.intersects(p2)){
                        playersList.remove(j);
                        playersList.remove(i);
                        break;
                    } else {
                    }
                }
                i++;
            }
        }
    }
}
