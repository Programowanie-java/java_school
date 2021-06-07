package as.deskballbreake;

import as.deskballbreake.interfaces.StaticData;
import gameboard.BoardGame;
import gameboard.OptionGame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author adams
 */
public class GameWindow extends JFrame implements StaticData{
    private BoardGame bg;
    
    public GameWindow(){
         initWindow();
         initUI();
    }
    
    private void initWindow(){
        setSize(StaticData.WIDTH, StaticData.HEIGHT);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        //addKeyListener(new Key());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void initUI(){
        int heightOptionGame = 40;
        bg = new BoardGame(StaticData.WIDTH, StaticData.HEIGHT-heightOptionGame);
        OptionGame og = new OptionGame(StaticData.WIDTH, StaticData.HEIGHT);
        
        og.setBounds(0, 0, StaticData.WIDTH, heightOptionGame);
        bg.setBounds(0, heightOptionGame, StaticData.WIDTH, StaticData.HEIGHT-heightOptionGame);
        
        //DODANIE NASZYCH JPANEL do JFRAME czyli okna aplikacji
        add(bg);
        add(og);
        
    }

    private class Key extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e){
                System.out.println("Key => keyPressed "+e.getKeyCode());
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                        System.out.println("Key => VK_LEFT");
                        //bg.player.move(false);
                }
                if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                        System.out.println("Key => VK_RIGHT");
                        //bg.player.move(true);
                }
        }
    }
    
}
