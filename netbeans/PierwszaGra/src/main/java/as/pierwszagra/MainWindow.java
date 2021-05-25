package as.pierwszagra;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author adams
 */
public class MainWindow extends JFrame{
    private final int WIDTH = 800, HEIGHT = 600;
    public MainWindow(){
        initUI();
        
        
        Board board = new Board();
        board.setBounds(0, 40, WIDTH, HEIGHT-40);
        OptionPanel op = new OptionPanel(board);
        op.setBounds(0, 0, WIDTH, 40);
        add(op);
        add(board);
    }
    
    private void initUI(){
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String [] args){
        
        EventQueue.invokeLater(() -> {
            MainWindow mw = new MainWindow();
            mw.setVisible(true);
        });
    }
}
