/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS-NB
 */
public class suhu extends javax.swing.JFrame {

    /**
     * Creates new form suhu
     */
    public suhu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        rbCelcius1 = new javax.swing.JRadioButton();
        rbFahrenheit1 = new javax.swing.JRadioButton();
        rbCalvin1 = new javax.swing.JRadioButton();
        rbCelcius2 = new javax.swing.JRadioButton();
        rbFahrenheit2 = new javax.swing.JRadioButton();
        rbCalvin2 = new javax.swing.JRadioButton();
        bnCalculate = new javax.swing.JButton();
        txtResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Input");

        jLabel2.setText("From");

        jLabel3.setText("To");

        jLabel4.setText("Result");

        buttonGroup2.add(rbCelcius1);
        rbCelcius1.setText("Celcius");

        buttonGroup2.add(rbFahrenheit1);
        rbFahrenheit1.setText("Fahrenheit");

        buttonGroup2.add(rbCalvin1);
        rbCalvin1.setText("Calvin");

        buttonGroup1.add(rbCelcius2);
        rbCelcius2.setText("Celcius");

        buttonGroup1.add(rbFahrenheit2);
        rbFahrenheit2.setText("Fahrenheit");

        buttonGroup1.add(rbCalvin2);
        rbCalvin2.setText("Calvin");

        bnCalculate.setText("Calculate!");
        bnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(87, 87, 87))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(61, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbCalvin1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbCalvin2)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFahrenheit1)
                            .addComponent(rbCelcius1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFahrenheit2)
                            .addComponent(rbCelcius2))
                        .addGap(34, 34, 34))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(bnCalculate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addGap(46, 46, 46)
                        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCelcius1)
                    .addComponent(rbCelcius2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFahrenheit1)
                    .addComponent(rbFahrenheit2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCalvin1)
                    .addComponent(rbCalvin2))
                .addGap(18, 18, 18)
                .addComponent(bnCalculate)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCalculateActionPerformed
        // TODO add your handling code here:
        double Input;
        float Result = 0;
        String a;
        Input = Double.parseDouble(txtInput.getText());
        
        if(rbCelcius1.isSelected() && rbCelcius2.isSelected()){
            Result = (float) Input;
            a = String.valueOf(Result);
            txtResult.setText(a);
        }
        if(rbCelcius1.isSelected() && rbFahrenheit2.isSelected()){
            Result = (float) (Input * 9 / 5 +32);
            a = String.valueOf(Result);
            txtResult.setText(a);
        }
        if(rbCelcius1.isSelected() && rbCalvin2.isSelected()){
            Result = (float) (Input + 273);
            a = String.valueOf(Result);
            txtResult.setText(a);
        }
        if(rbFahrenheit1.isSelected()&& rbCelcius2.isSelected()) {
            Result = (float) ((Input - 32) * 5 / 9);
            a = String.valueOf(Result);
            txtResult.setText(a);
        }
        if(rbFahrenheit1.isSelected()&& rbFahrenheit2.isSelected()){
            Result = (float) Input;
            a = String.valueOf(Result);
            txtResult.setText(a);
        }
        if(rbFahrenheit1.isSelected()&& rbCalvin2.isSelected()){
            Result = (float) ((Input -32)*5/9+273);
            a = String.valueOf(Result);
            txtResult.setText(a);
        }
        if(rbCalvin1.isSelected()&& rbFahrenheit2.isSelected()){
            Result = (float) (Input-273);
            a = String.valueOf(Result);
            txtResult.setText(a);
        }
        if(rbCalvin1.isSelected()&& rbFahrenheit2.isSelected()){
            Result = (float) ((Input - 273)*9/5+32);
            a = String.valueOf(Result);
            txtResult.setText(a);
        }
        if(rbCalvin1.isSelected()&& rbFahrenheit2.isSelected()){
            Result = (float) Input;
            a = String.valueOf(Result);
            txtResult.setText(a);
        }
        
    }//GEN-LAST:event_bnCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new suhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnCalculate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rbCalvin1;
    private javax.swing.JRadioButton rbCalvin2;
    private javax.swing.JRadioButton rbCelcius1;
    private javax.swing.JRadioButton rbCelcius2;
    private javax.swing.JRadioButton rbFahrenheit1;
    private javax.swing.JRadioButton rbFahrenheit2;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables

    private static class rbCalcius1 {

        private static boolean isSelected() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public rbCalcius1() {
        }
    }
}
