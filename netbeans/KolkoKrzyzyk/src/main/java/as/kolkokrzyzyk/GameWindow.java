/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as.kolkokrzyzyk;

import as.kolkokrzyzyk.gameutils.DrawPlayer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author adams
 */
public class GameWindow extends javax.swing.JFrame {

    /**
     * Creates new form GameWindow
     */
    public GameWindow() {
        initComponents();
        initGame();
        setCircleOrCrossToAllButtons();
    }
    
    private void initGame(){
        if(DrawPlayer.randomPlayer()){
            jLPlayer1.setBackground(Color.GREEN);
            jLPlayer2.setBackground(Color.GRAY);
        } else {
            jLPlayer1.setBackground(Color.GRAY);
            jLPlayer2.setBackground(Color.GREEN);
        }
        if(DrawPlayer.randomSign()){
            jLPlayer1Sign.setText("O");
            jLPlayer2Sign.setText("X");
        } else {
            jLPlayer1Sign.setText("X");
            jLPlayer2Sign.setText("O");
        }
    }
    /**
     * Set Listener to all buttons for circle or cross
     */
    private void setCircleOrCrossToAllButtons(){
        jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
        jButton12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
        jButton13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
         jButton21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
        jButton22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
        jButton23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
         jButton31.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
        jButton32.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
        jButton33.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setCircleOrCross(evt);
            }
        });
    }
    
    private void clearButtonText(){
        jButton11.setText("");
        jButton12.setText("");
        jButton13.setText("");
        jButton21.setText("");
        jButton22.setText("");
        jButton23.setText("");
        jButton31.setText("");
        jButton32.setText("");
        jButton33.setText("");
    }
    
    private void setCircleOrCross(ActionEvent evt) {                                        
        JButton b = (JButton) evt.getSource();
        b.setText("X");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRBPlayervsPlayer = new javax.swing.JRadioButton();
        jRBPlayervsComputer = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLPlayer1 = new javax.swing.JLabel();
        jLPlayer2 = new javax.swing.JLabel();
        jLPlayer1Sign = new javax.swing.JLabel();
        jLPlayer2Sign = new javax.swing.JLabel();
        jBReset = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 236, 255));

        buttonGroup.add(jRBPlayervsPlayer);
        jRBPlayervsPlayer.setSelected(true);
        jRBPlayervsPlayer.setText("2 Graczy");

        buttonGroup.add(jRBPlayervsComputer);
        jRBPlayervsComputer.setText("vs Komputer");

        jLPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPlayer1.setText("Gracz 1");
        jLPlayer1.setOpaque(true);

        jLPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPlayer2.setText("Gracz 2");
        jLPlayer2.setOpaque(true);

        jLPlayer1Sign.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLPlayer1Sign.setText("X");

        jLPlayer2Sign.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLPlayer2Sign.setText("O");

        jBReset.setText("RESET");
        jBReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResetActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton11.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton11.setMaximumSize(new java.awt.Dimension(60, 60));
        jButton11.setMinimumSize(new java.awt.Dimension(60, 60));
        jButton11.setPreferredSize(new java.awt.Dimension(60, 60));

        jButton21.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton21.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton21.setMaximumSize(new java.awt.Dimension(60, 60));
        jButton21.setMinimumSize(new java.awt.Dimension(60, 60));
        jButton21.setPreferredSize(new java.awt.Dimension(60, 60));

        jButton12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton12.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton12.setMaximumSize(new java.awt.Dimension(60, 60));
        jButton12.setMinimumSize(new java.awt.Dimension(60, 60));
        jButton12.setPreferredSize(new java.awt.Dimension(60, 60));

        jButton31.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton31.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton31.setMaximumSize(new java.awt.Dimension(60, 60));
        jButton31.setMinimumSize(new java.awt.Dimension(60, 60));
        jButton31.setPreferredSize(new java.awt.Dimension(60, 60));

        jButton22.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton22.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton22.setMaximumSize(new java.awt.Dimension(60, 60));
        jButton22.setMinimumSize(new java.awt.Dimension(60, 60));
        jButton22.setPreferredSize(new java.awt.Dimension(60, 60));

        jButton32.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton32.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton32.setMaximumSize(new java.awt.Dimension(60, 60));
        jButton32.setMinimumSize(new java.awt.Dimension(60, 60));
        jButton32.setPreferredSize(new java.awt.Dimension(60, 60));

        jButton13.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton13.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton13.setMaximumSize(new java.awt.Dimension(60, 60));
        jButton13.setMinimumSize(new java.awt.Dimension(60, 60));
        jButton13.setPreferredSize(new java.awt.Dimension(60, 60));

        jButton23.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton23.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton23.setMaximumSize(new java.awt.Dimension(60, 60));
        jButton23.setMinimumSize(new java.awt.Dimension(60, 60));
        jButton23.setPreferredSize(new java.awt.Dimension(60, 60));

        jButton33.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton33.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton33.setMaximumSize(new java.awt.Dimension(60, 60));
        jButton33.setMinimumSize(new java.awt.Dimension(60, 60));
        jButton33.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRBPlayervsPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jLPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLPlayer1Sign)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLPlayer2Sign))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRBPlayervsComputer)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addComponent(jBReset, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jLPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBPlayervsPlayer)
                    .addComponent(jRBPlayervsComputer)
                    .addComponent(jBReset))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPlayer1Sign)
                    .addComponent(jLPlayer2Sign))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPlayer1)
                    .addComponent(jLPlayer2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResetActionPerformed
        clearButtonText();
        initGame();
    }//GEN-LAST:event_jBResetActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jBReset;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JLabel jLPlayer1;
    private javax.swing.JLabel jLPlayer1Sign;
    private javax.swing.JLabel jLPlayer2;
    private javax.swing.JLabel jLPlayer2Sign;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBPlayervsComputer;
    private javax.swing.JRadioButton jRBPlayervsPlayer;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
