/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.home.local.adams.notatki;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adams
 */
public class Notatki extends javax.swing.JFrame {
    
    /**
     * Creates new form Notatki
     */
    public Notatki() {
        initComponents();
        createDirectoriesAndFiles();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        as_jTFTitle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        as_jTAContents = new javax.swing.JTextArea();
        as_jBClear = new javax.swing.JButton();
        as_JBSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Moje notatki");

        as_jTAContents.setColumns(20);
        as_jTAContents.setRows(5);
        jScrollPane1.setViewportView(as_jTAContents);

        as_jBClear.setText("Wyczyść");

        as_JBSave.setText("Zapisz");
        as_JBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                as_JBSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(as_jBClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(as_JBSave))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(as_jTFTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(as_jTFTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(as_jBClear)
                    .addComponent(as_JBSave))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Wprowadzanie", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Spis notatek", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void as_JBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_as_JBSaveActionPerformed
        String title = as_jTFTitle.getText();
        String contents = as_jTAContents.getText();
        saveDataToFile(title+"\n"+contents);
    }//GEN-LAST:event_as_JBSaveActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Notatki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notatki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notatki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notatki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notatki().setVisible(true);
            }
        });
    }
    private void createDirectoriesAndFiles(){
        try {
            /**
             * Utworzenie folderu dane jeśli nie istnieje w miejscu w którym uruchomiliśmy program (plik jar).
             */
            File directory = new File("."+File.separator+"dane");
            if (!directory.exists()){
                directory.mkdir();
            }
            /**
             * Utworzenie pliku test.txt jeśli nie istnieje w miejscu w którym uruchomiliśmy program (plik jar)
             * a dokładniej w folderze dane.
             */
            if(!file.exists()){
                file.createNewFile();
            }
//            FileWriter fw = new FileWriter(file);
//            fw.write("Testowanie działania");
//            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Notatki.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Function save data to file
     * @param data - data to save to file
     */
    private void saveDataToFile(String data){
       //Spróbuj zapisać do pliku
        try {
            //  Ustawienie zapisu do pliku
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            //Zapis do pliku
            bw.write(data);
            //Zamknięcie dostępu do pliku =====WAŻNE=====
            bw.close();
        } catch (IOException ex) { 
            //Jak nie uda się zapisać do pliku wykonaj poniższe instrukcje
            System.out.println(ex.toString());
        }
    }
    /**
     * Globalnie zdefiniowane zmienne directory i file - będziemy używać w kilku miejscach aplikacji
     * Istotne jest aby na początku dodać ".".
    */
    
    File file = new File("."+File.separator+"dane"+File.separator+"test.txt");
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton as_JBSave;
    private javax.swing.JButton as_jBClear;
    private javax.swing.JTextArea as_jTAContents;
    private javax.swing.JTextField as_jTFTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
