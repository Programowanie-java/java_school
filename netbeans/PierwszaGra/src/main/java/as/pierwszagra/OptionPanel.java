/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as.pierwszagra;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author adams
 */
public class OptionPanel extends JPanel{
    private final int WIDTH = 795, HEIGHT = 40;
    private Board board;
    public OptionPanel(Board board){
        this.board = board;
        setBackground(Color.red);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setLayout(new GridLayout(1,6));
        initUI();
    }
    
    private void initUI(){
        JButton stopButton = new JButton("START");
        stopButton.addActionListener((e) -> {
            System.out.println("STOP/START: "+board.isFlagThread());
            if(stopButton.getText().equals("START")){
                board.startThreadAnimation();
                stopButton.setText("STOP");
            } else {
                board.stopThreadAnimation();
                stopButton.setText("START");
            }
            
        });
        add(stopButton);
        JButton resetButton = new JButton("RESET");
        add(resetButton);
        JButton closeButton = new JButton("CLOSE");
        closeButton.addActionListener((e) -> {
            board.setFlagThread(false);
            System.exit(0);
        });
        add(closeButton);
        JSpinner jsBallsQuantity = new JSpinner();
        jsBallsQuantity.setValue(100);
        add(jsBallsQuantity);
    }
        
}
