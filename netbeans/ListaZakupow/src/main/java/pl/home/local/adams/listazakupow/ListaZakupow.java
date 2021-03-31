package pl.home.local.adams.listazakupow;



import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adams
 */
public class ListaZakupow extends javax.swing.JFrame{

    public ListaZakupow() {
        initComponents();

//        FileUtils fu = new FileUtils();
//        jTADzisiejszeZakupy.setText(fu.readFromFile());
        
        addKeyListenerTojTFCoKupiles();
        addKeyListenerTojTFWartosc();
        addKeyListenerTojTFData();
        addTooltipToElements();
        filljCBProducts();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPWprowadzZakupy = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFCoKupiles = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFWartosc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADzisiejszeZakupy = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCBProducts = new javax.swing.JComboBox<>();
        jBSave = new javax.swing.JButton();
        jPListaZakupow = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Wpisz co kupiłeś");

        jLabel2.setText("Podaj wartość");

        jLabel3.setText("Data zakupu");

        jLabel4.setText("Dzisiejsze zakupy");

        jTADzisiejszeZakupy.setColumns(20);
        jTADzisiejszeZakupy.setRows(5);
        jScrollPane1.setViewportView(jTADzisiejszeZakupy);

        jLabel5.setText("Wydatki z dzisiaj:");

        jLabel6.setText("Wydatki z tygodnia:");

        jLabel7.setText("Typ zakupionego towaru");

        jCBProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBSave.setText("ZAPISZ");
        jBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPWprowadzZakupyLayout = new javax.swing.GroupLayout(jPWprowadzZakupy);
        jPWprowadzZakupy.setLayout(jPWprowadzZakupyLayout);
        jPWprowadzZakupyLayout.setHorizontalGroup(
            jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPWprowadzZakupyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPWprowadzZakupyLayout.createSequentialGroup()
                        .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPWprowadzZakupyLayout.createSequentialGroup()
                                .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFCoKupiles)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTFWartosc)))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBProducts, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPWprowadzZakupyLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jBSave, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addContainerGap())
        );
        jPWprowadzZakupyLayout.setVerticalGroup(
            jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPWprowadzZakupyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCoKupiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFWartosc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jBSave))
                .addGap(18, 18, 18)
                .addGroup(jPWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPWprowadzZakupyLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Wprowadź zakupy", jPWprowadzZakupy);

        javax.swing.GroupLayout jPListaZakupowLayout = new javax.swing.GroupLayout(jPListaZakupow);
        jPListaZakupow.setLayout(jPListaZakupowLayout);
        jPListaZakupowLayout.setHorizontalGroup(
            jPListaZakupowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        jPListaZakupowLayout.setVerticalGroup(
            jPListaZakupowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lista zakupów", jPListaZakupow);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveActionPerformed
        //TUTAJ BĘDZIE ZAPIS Z KLASY
        FileUtils stf = new FileUtils();
        String text = jTFCoKupiles.getText().trim()+";"+jTFWartosc.getText().trim()+";"
                +jCBProducts.getSelectedItem().toString().trim()+";"+jTFData.getText().trim();
        
        stf.saveToFile(text);
    }//GEN-LAST:event_jBSaveActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaZakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaZakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaZakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaZakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaZakupow().setVisible(true);
            }
        });
    }
    
    private void addKeyListenerTojTFCoKupiles(){
        jTFCoKupiles.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if(ch >= 'a' && ch <= 'z' || ch == KeyEvent.VK_SPACE || ch == KeyEvent.VK_BACK_SPACE){
                    jTFCoKupiles.setEditable(true);
                    //jTADzisiejszeZakupy.setText(jTFCoKupiles.getText());
                } else {
                    jTFCoKupiles.setEditable(false);
                }
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println("2 keyPressed "+e.getKeyChar());
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                //System.out.println("3 keyReleased "+e.getKeyChar());
            }
        });
    }
   
    private void addKeyListenerTojTFData(){
        jTFData.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String temp = jTFData.getText();
                char ch = e.getKeyChar();
                if(  (ch >= '0'  && ch <= '9'  || ch == KeyEvent.VK_BACK_SPACE) && 
                        (temp.length() <10 || ch == KeyEvent.VK_BACK_SPACE)
                        ) {  
                    jTFData.setEditable(true);
                    //Jeśli długośći tekstu jest równa 4 lub 7 znaków i znak różny od backspace dodaj -
                    if( (temp.length() == 4 || temp.length() == 7) && ch != KeyEvent.VK_BACK_SPACE){
                        jTFData.setText(temp+'-');
                    }
//                    System.out.println("NACIŚNIĘTO CYFRĘ: "+ch);
                } else {
                    jTFData.setEditable(false);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
    
    private void addKeyListenerTojTFWartosc(){
        jTFWartosc.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                String temp = jTFWartosc.getText();
              
                if(temp.contains(",") ){
                    String [] splitted = temp.split(",");
                    if(splitted[1].length() < 2){
                        if(ch >= '0'  && ch <= '9'  || ch == KeyEvent.VK_BACK_SPACE){  
                            jTFWartosc.setEditable(true);
                        } else {
                            jTFWartosc.setEditable(false);
                        }
                    } //TODO jeśli będzie po przecinku za długo tekst to co zrobimy????
                    
                } else {
                    if(ch >= '0'  && ch <= '9'  || ch == KeyEvent.VK_BACK_SPACE || ch == ','){  
                        jTFWartosc.setEditable(true);
    //                    System.out.println("NACIŚNIĘTO CYFRĘ: "+ch);
                    } else {
                        jTFWartosc.setEditable(false);
                    }
                }
                
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }

    private void addTooltipToElements(){
        jTFCoKupiles.setToolTipText("<html>"
                + "<h3>Wprowadź tekst</h3>"
                + "<p>Nie używaj polskich znaków</p>"
                + "</html>");
    }
    
    private void filljCBProducts(){
        ArticleTypeUtils atu = new ArticleTypeUtils();
        //TODO read procucts from file!!!
        jCBProducts.removeAllItems();
        jCBProducts.addItem("");
        jCBProducts.addItem("Żywność");
        jCBProducts.addItem("Napoje");
        jCBProducts.addItem("Owoce");
        jCBProducts.addItem("Warzywa");
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSave;
    private javax.swing.JComboBox<String> jCBProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPListaZakupow;
    private javax.swing.JPanel jPWprowadzZakupy;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTADzisiejszeZakupy;
    private javax.swing.JTextField jTFCoKupiles;
    private javax.swing.JTextField jTFData;
    private javax.swing.JTextField jTFWartosc;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables


}
