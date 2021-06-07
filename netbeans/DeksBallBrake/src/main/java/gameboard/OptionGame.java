package gameboard;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author adams
 */
public class OptionGame extends JPanel{
    private int WIDTH, HEIGHT;
    private JLabel playersNumber;
    private JLabel gameTime;
    public OptionGame(int WIDTH, int HEIGHT) {
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        setBackground(Color.WHITE);
        init();
    }
    
    private void init(){
        setLayout(null);
        playersNumber = new JLabel("LICZBA GRACZY");
        playersNumber.setBounds(10,10,120,20);
        add(playersNumber);
        
        gameTime = new JLabel("Czas gry: ");
        gameTime.setBounds(250,10,120,20);
        add(gameTime);
    }
    
    public JLabel getPlayersNumber(){
        return playersNumber;
    }
    
    public void setPlayersNumber(int nr){
        playersNumber.setText(""+nr);
    }
    
    public JLabel getGameTime(){
        return gameTime;
    }
    
    public void setGameTime(int nr){
        gameTime.setText("Czas gry: "+nr);
    }
}
