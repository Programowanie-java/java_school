package actors;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author adams
 */
public class Player{
    private int x,y = 500 ,board_width,board_height, width = 120 ,height = 20 ;
    private int speed = 2;
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

    public Player(int x, int y, int board_width, int board_height, int width, int height, int speed, Color color) {
        this.x = x;
        this.y = y;
        this.board_width = board_width;
        this.board_height = board_height;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.color = color;
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

    
       
    public void move(boolean left_right){
        if(x<=0 || x>=board_width-width-4){
            speed = -speed;
        }
        if(left_right){
            x+=speed;
        } else{
            x-=speed;
        }
    }
    
}
