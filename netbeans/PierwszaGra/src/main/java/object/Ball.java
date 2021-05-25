package object;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

/**
 *
 * @author adams
 */
public class Ball {
    private int x,y,w,h;
    private int w_board, h_board;
    private Color color;
    private int move_x = 3, move_y = 3;

    public Ball(int x, int y, int w, int h, int w_board, int h_board, Color color) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.w_board = w_board;
        this.h_board = h_board;
        this.color = color;
    }
    
    public Ball(int w_board, int h_board){
        Random r = new Random();
        this.w_board = w_board;
        this.h_board = h_board;
        w = r.nextInt(50)+50;
        h = w;
        x = r.nextInt(w_board-w-2);
        y = r.nextInt(h_board-h-19);
        color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256));
        move_x = r.nextInt(10)-5;
        move_y = r.nextInt(10)-5;
        
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public void paintBall(Graphics2D g2d){
        g2d.setColor(color);
        g2d.fillOval(x, y, w, h);
    } 
    
    public void moveBall(){
        //System.out.print("x="+x+"  y="+y);
        if(x  >= w_board-w-3 || x <=0){
            move_x = -move_x;
        }
        if(y  >= h_board-h-20 || y <=0){
            move_y = -move_y;
        }
        x += move_x;
        y += move_y;
    }
    
}
