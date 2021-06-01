package as.pierwszagra;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JPanel;
import object.Ball;

/**
 *
 * @author adams
 */
public class Board extends JPanel{
    private final int DELAY = 25;
    private final int WIDTH = 795, HEIGHT = 560;
    int x_oval, y_oval = 0;
    private boolean x_oval_flag, y_oval_flag = true, flagThread = true;
    private Thread thred;
    private final int QUANTITY = 50;
    ArrayList<Ball> ballsList;
    
    public Board(){
        setBackground(Color.white);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        createBalls();
        //startAnimation();
        //startThreadAnimation();
    }
    
    private void createBalls(){
        ballsList = new ArrayList<>();
        for (int i = 0; i<QUANTITY;i++){
            ballsList.add(new Ball(WIDTH,HEIGHT) );
        }
    }
    
    private void paintBalls(Graphics2D g2d){
        for (int i = 0; i<QUANTITY;i++){
            ballsList.get(i).paintBall(g2d);
        }
    }
    
    private void moveBalls() {
        for (int i = 0; i<QUANTITY;i++){
            ballsList.get(i).moveBall();
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g; //RYSOWANIE PO PŁUTNIE - g2d - myśl o tym jako ołówku
        //Dla lepszego poruszania się - bardziej płynnego!
        RenderingHints rh
        = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);
        paintBalls(g2d);
        Toolkit.getDefaultToolkit().sync();
//        g2d.setStroke(new BasicStroke(4));
//        g2d.setColor(Color.red);
//        g2d.drawLine(10, 10, 10, 210);          //PIONOWA LEWA LINIA
//        g2d.setColor(Color.blue);
//        g2d.drawLine(10, 10, 210, 10);          //POZIOMA GÓRNA LINIA
//        g2d.setColor(Color.DARK_GRAY);
//        g2d.drawLine(10, 210, 210, 210);          //POZIOMA DOLNA
//        g2d.setColor(Color.YELLOW);
//        g2d.drawLine(210, 210, 210, 10);          //PIONOWA LEWA LINIA
//        g2d.setColor(Color.BLACK);
//        g2d.drawOval(10, 10, 200, 200);  //10 + 210 = 220 kończy się tu koło
        //g2d.setColor(new Color(200,100,240)); //Kolor za pomocą RGB
//        g2d.setColor(Color.BLACK);
    }
    
    public void startThreadAnimation(){
        flagThread = true;
        startAnimation();
        thred.start();
    }
    
    public void stopThreadAnimation(){
        flagThread = false;
        thred = null;
    }
    
    private void startAnimation(){
        thred = new Thread(() -> {
            long beforeTime, timeDiff, sleep;
            while(flagThread){
                beforeTime = System.currentTimeMillis(); //pobranie czasu przed animacją
                moveBalls();    
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

    public boolean isFlagThread() {
        return flagThread;
    }

    public void setFlagThread(boolean flagThread) {
        this.flagThread = flagThread;
    }

}
