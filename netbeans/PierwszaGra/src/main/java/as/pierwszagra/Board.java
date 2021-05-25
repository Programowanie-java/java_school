package as.pierwszagra;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author adams
 */
public class Board extends JPanel{
    private final int DELAY = 25;
    
    int x_oval, y_oval = 0;
    boolean x_oval_flag, y_oval_flag = true;
    
    int dim_x = 800, dim_y = 600;
    
    public Board(){
        
        setBackground(Color.white);
        setPreferredSize(new Dimension(800,600));
        startAnimation();
        
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
        g2d.setStroke(new BasicStroke(4));
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
        walkingOval(g2d);
        Toolkit.getDefaultToolkit().sync();
//        g2d.setColor(Color.BLACK);
    }
    
    private void walkingOval(Graphics2D g2d){
        g2d.setColor(Color.decode("#00A300"));
        g2d.fillOval(x_oval, y_oval, 150, 150);
        
        
        g2d.setColor(Color.decode("#00A3aa"));
        g2d.fillOval(500, 400, 50, 50);
    }
    
    private void startAnimation(){
        new Thread(() -> {
            long beforeTime, timeDiff, sleep;
            while(true){
                beforeTime = System.currentTimeMillis(); //pobranie czasu przed animacją
                ovalMove();
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
                System.out.println(beforeTime+"  "+timeDiff+"   SLEEP = "+sleep);
            }
        }).start();
    }
    
    private void ovalMove(){
        if(x_oval_flag){
            x_oval++;
        } else {
            x_oval--;
        }
        
        if(y_oval_flag){
            y_oval++;
        } else {
            y_oval--;
        }
        if(x_oval+150>=800){
             x_oval_flag = false;           
        }
        if(x_oval<=0){
             x_oval_flag = true;           
        }
        if(y_oval+180>=600){
            y_oval_flag = false;
        }
        if(y_oval <= 0){
            y_oval_flag = true;
        }
    }
}
