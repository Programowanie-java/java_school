package actors;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author adams
 */
public class Player{
    private int x,y;
    private int speed = 25;

    public Player(int x) {
        this.x = x;
        this.y = 500;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    public void move(boolean left_right){
        if(left_right){
            x+=speed;
        } else{
            x-=speed;
        }
        
    }
    
}
