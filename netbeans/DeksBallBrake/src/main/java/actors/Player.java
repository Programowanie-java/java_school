package actors;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.Random;

/**
 * @author adams
 */
public class Player{
    private int x,y = 500 ,board_width,board_height, width = 120 ,height = 20 ;
    private int speed = 2;
    private int speed_x, speed_y;
    private Color color;
    
    public Player(int x) {
        this.x = x;
    }

    public Player(int x, int board_width, int board_height) {
        this.x = x;
        this.board_width = board_width;
        this.board_height = board_height;
    }

    public Player(int x, int y, int board_width, int board_height, int width, int height, int speed) {
        this.x = x;
        this.y = y;
        this.board_width = board_width;
        this.board_height = board_height;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    public Player(int x, int y, int board_width, int board_height, int width, int height, int speed_x, int speed_y, Color color) {
        this.x = x;
        this.y = y;
        this.board_width = board_width;
        this.board_height = board_height;
        this.width = width;
        this.height = height;
        this.color = color;
        Random r = new Random();
        if(r.nextBoolean()){
            this.speed_x = - speed_x;
        } else {
            this.speed_x = speed_x;
        }
        if(r.nextBoolean()){
            this.speed_y = - speed_y;
        } else {
             this.speed_y = speed_y;
        }
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

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }
 
    public Rectangle getBounds(){
        //System.out.println("x="+x+"  y="+y+"  w="+width+" h="+height);
        return new Rectangle(x,y,width,height);
    }
    
    public void move(){
        if(x<=0 || x>=board_width-width-4){
            speed_x = -speed_x;
        }
        if(y<=0 || y>=board_height-height-24){
            speed_y = -speed_y;
        }
        x+=speed_x;
        y+=speed_y;
    }
    
}
