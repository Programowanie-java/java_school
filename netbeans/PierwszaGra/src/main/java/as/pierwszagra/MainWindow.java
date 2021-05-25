package as.pierwszagra;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author adams
 */
public class MainWindow extends JFrame{
    
    public MainWindow(){
        initUI();
        add(new Board());
        //pack();
    }
    
    private void initUI(){
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
