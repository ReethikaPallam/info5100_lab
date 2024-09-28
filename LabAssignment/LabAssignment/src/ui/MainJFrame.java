/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author HP USER
 */
public class MainJFrame extends javax.swing.JFrame {
    ImageIcon profilePicture;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
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

        buttonGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        FNameJLabel = new javax.swing.JLabel();
        FNameJTextField = new javax.swing.JTextField();
        LNameJLabel = new javax.swing.JLabel();
        LNameJTextField = new javax.swing.JTextField();
        GenderJLabel = new javax.swing.JLabel();
        MaleJRadioButton = new javax.swing.JRadioButton();
        FemaleJRadioButton = new javax.swing.JRadioButton();
        OthersJRadioButton = new javax.swing.JRadioButton();
        AgeJLabel = new javax.swing.JLabel();
        AgeJTextField = new javax.swing.JTextField();
        PhoneJLabel = new javax.swing.JLabel();
        EmailJTextField = new javax.swing.JTextField();
        EmailJLabel = new javax.swing.JLabel();
        PhoneJTextField = new javax.swing.JTextField();
        TitlejLabel = new javax.swing.JLabel();
        ImageJButton = new javax.swing.JButton();
        ImageJLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        imgJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        FNameJLabel.setText("First Name :");

        FNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameJTextFieldActionPerformed(evt);
            }
        });

        LNameJLabel.setText("Last Name :");

        GenderJLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        GenderJLabel.setText("Gender :");

        buttonGroupGender.add(MaleJRadioButton);
        MaleJRadioButton.setText("Male");
        MaleJRadioButton.setActionCommand("MALE");

        buttonGroupGender.add(FemaleJRadioButton);
        FemaleJRadioButton.setText("Female");
        FemaleJRadioButton.setActionCommand("FEMALE");
        FemaleJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleJRadioButtonActionPerformed(evt);
            }
        });

        buttonGroupGender.add(OthersJRadioButton);
        OthersJRadioButton.setText("Prefer Not to Say");
        OthersJRadioButton.setActionCommand("OTHERS");
        OthersJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OthersJRadioButtonActionPerformed(evt);
            }
        });

        AgeJLabel.setText("Age :");

        PhoneJLabel.setText("Phone No :");

        EmailJLabel.setText("Email :");

        TitlejLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TitlejLabel.setText("Registration");

        ImageJButton.setText("Select Image");
        ImageJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageJButtonActionPerformed(evt);
            }
        });

        ImageJLabel.setText("Image :");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LNameJLabel))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FNameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(LNameJTextField))
                        .addGap(0, 118, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(GenderJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FemaleJRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MaleJRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OthersJRadioButton)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AgeJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PhoneJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ImageJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(AgeJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(PhoneJTextField))
                                    .addComponent(ImageJButton)
                                    .addComponent(EmailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(56, 56, 56))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(TitlejLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(imgJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TitlejLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FNameJLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNameJLabel))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaleJRadioButton)
                    .addComponent(GenderJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FemaleJRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OthersJRadioButton)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeJLabel)
                    .addComponent(AgeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailJLabel)
                            .addComponent(EmailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneJLabel))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageJButton)
                    .addComponent(ImageJLabel))
                .addGap(18, 18, 18)
                .addComponent(imgJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OthersJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OthersJRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OthersJRadioButtonActionPerformed

    private void FemaleJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleJRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleJRadioButtonActionPerformed

    private void FNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNameJTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        String fname = this.FNameJTextField.getText();
        String lname = this.LNameJTextField.getText();
        String gender = this.buttonGroupGender.getSelection().getActionCommand();
        String age = this.AgeJTextField.getText();
        int agenum= Integer.parseInt(age);
        String phone = this.PhoneJTextField.getText();
        String email = this.EmailJTextField.getText();
        String displayMessage = "Full Name:" +fname+lname+ "Gender:" +gender+ "Age:" +age;
        String showmsg="Invalid Input";
        System.out.println(this.FNameJTextField.getText());
        System.out.println(this.buttonGroupGender.getSelection().getActionCommand());
        JOptionPane.showMessageDialog(this, displayMessage);
        
        
        if (agenum >=0 && agenum<=150 && phone.matches("\\d{10}") && email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
            JOptionPane.showMessageDialog(this, displayMessage);
        }
        else{
            JOptionPane.showMessageDialog(this, showmsg);
        }
            
        }
        catch(NumberFormatException ne){
            System.out.println(ne);
        }
        catch(NullPointerException ne){
            String errorMessage = "You must enter values in Name and Gender";
            JOptionPane.showMessageDialog(this, errorMessage);
        }
        catch(Exception e){
            System.out.println("Exception has occured");
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ImageJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImageJButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
            if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                Image edited_image = img.getScaledInstance(60, 80,Image.SCALE_SMOOTH);
                if (edited_image != null) {
                  this.imgJLabel.setText(file.getSelectedFile().getAbsolutePath());
                  this.imgJLabel.setIcon(new ImageIcon(edited_image));
                  this.profilePicture=(new ImageIcon(edited_image));
    //            this.userInfo.setPic(new ImageIcon(edited_image));
                }
                } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Please upload image correctly.", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }}
    }//GEN-LAST:event_ImageJButtonActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeJLabel;
    private javax.swing.JTextField AgeJTextField;
    private javax.swing.JLabel EmailJLabel;
    private javax.swing.JTextField EmailJTextField;
    private javax.swing.JLabel FNameJLabel;
    private javax.swing.JTextField FNameJTextField;
    private javax.swing.JRadioButton FemaleJRadioButton;
    private javax.swing.JLabel GenderJLabel;
    private javax.swing.JButton ImageJButton;
    private javax.swing.JLabel ImageJLabel;
    private javax.swing.JLabel LNameJLabel;
    private javax.swing.JTextField LNameJTextField;
    private javax.swing.JRadioButton MaleJRadioButton;
    private javax.swing.JRadioButton OthersJRadioButton;
    private javax.swing.JLabel PhoneJLabel;
    private javax.swing.JTextField PhoneJTextField;
    private javax.swing.JLabel TitlejLabel;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JLabel imgJLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}