package as.kolkokrzyzyk.gameutils;

import java.util.Random;

public class DrawPlayer {
    /**
     * Draw player to start game
     * @return true means first player start
     */
    public static boolean randomPlayer(){
        Random r = new Random();
        boolean b = r.nextBoolean();
        return b;
    }
    /**
     * Draw circle or cross
     * @return true means circle
     */
    public static boolean randomSign(){
        Random r = new Random();
        boolean b = r.nextBoolean();
        return b;
    }
}
