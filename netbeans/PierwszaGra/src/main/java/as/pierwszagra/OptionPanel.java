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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

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
        //Aby ustawić 50 - wartość początkową 1 - 100 zakres   1 - o ile się zmienia
        //zawartość naszego spinera
        SpinnerNumberModel model = new SpinnerNumberModel(50.0, 1.0, 100.0, 1.0);  
        JSpinner jsBallsQuantity = new JSpinner(model);
        //Aby ustawić tekst w spinerze na środku!!!
        JSpinner.DefaultEditor se = (JSpinner.DefaultEditor)jsBallsQuantity.getEditor();
        se.getTextField().setHorizontalAlignment(JTextField.CENTER);
        add(jsBallsQuantity);
        
        JLabel label = new JLabel("v 0.2");
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);
    }
        
}
