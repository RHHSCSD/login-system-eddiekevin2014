/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginsystem;

import java.awt.Cursor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author edwar
 */
public class SignupForm extends javax.swing.JFrame {

    private MaskFormatter fmt = new MaskFormatter();
    private final String def = "";

    /**
     * Creates new form LoginForm
     */
    public SignupForm() {
        try {
            fmt = new MaskFormatter(UserConfig.PHONE_PATTERN);
        } catch (ParseException exp) {
            System.out.println(exp);
        }
        
        initComponents();
        
        //empty response
        res.setText(def);
        
        //display password rules
        //setVisible(true);
        //JOptionPane.showMessageDialog(this,
        //UserConfig.PASSWORD_RULES,
       // "Password Rules",JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgroup = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        unameText = new javax.swing.JTextField();
        fnameText = new javax.swing.JTextField();
        pass1Text = new javax.swing.JPasswordField();
        pass2Text = new javax.swing.JPasswordField();
        lnameText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        mobileText = new javax.swing.JFormattedTextField(fmt);
        submitButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        term = new javax.swing.JCheckBox();
        date = new javax.swing.JComboBox<>(UserConfig.DATES);
        month = new javax.swing.JComboBox<>(UserConfig.MONTHS);
        year = new javax.swing.JComboBox<>(UserConfig.YEARS);
        res = new javax.swing.JLabel();
        passrules = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration System");
        setLocation(new java.awt.Point(300, 90));
        setResizable(false);

        title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        title.setText("Sign Up Form");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Confirm Password");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("First Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Last Name");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Date of Birth");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Gender");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Mobile");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        bgroup.add(male);
        male.setSelected(true);
        male.setText("Male");

        bgroup.add(female);
        female.setText("Female");

        term.setText("Accept Terms And Conditions.");

        res.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        res.setText("Response");

        passrules.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passrules.setForeground(new java.awt.Color(102, 102, 255));
        passrules.setText("[Password Rules]");
        passrules.setToolTipText("");
        passrules.setName(""); // NOI18N
        passrules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passrulesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passrulesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passrulesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(term)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(submitButton)
                                .addGap(29, 29, 29)
                                .addComponent(resetButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closeButton))
                            .addComponent(res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(passrules)))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(unameText)
                                    .addComponent(pass1Text)
                                    .addComponent(pass2Text)
                                    .addComponent(lnameText)
                                    .addComponent(emailText)
                                    .addComponent(mobileText)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(male)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(female)
                                        .addGap(22, 22, 22))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(fnameText)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(title)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(title)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(unameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pass1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(passrules)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pass2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(male)
                    .addComponent(female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(mobileText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(term)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(resetButton)
                    .addComponent(closeButton))
                .addGap(18, 18, 18)
                .addComponent(res)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        passrules.getAccessibleContext().setAccessibleName("Password Rules");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        // System.out.println(evt);
        RegisterSys register = new RegisterSys();
        try {
            register.loadUsers();
        } catch (FileNotFoundException | ParseException exp) {
            System.out.println(exp);
        }

        User user = new User();
        StringBuilder errbuf = new StringBuilder();

        if (term.isSelected()) {
            // get data from sign-up form
            String username = unameText.getText().trim();
            String pass1Str = new String(pass1Text.getPassword());
            String pass2Str = new String(pass2Text.getPassword());
            String firstname = fnameText.getText().trim();
            String lastname = lnameText.getText().trim();
            String mobile = mobileText.getText().trim();
            String emailstr = emailText.getText().trim();
            String genderstr = new String();
            if (male.isSelected()) {
                genderstr = UserConfig.GENDER_M;
            } else if (female.isSelected()) {
                genderstr = UserConfig.GENDER_F;
            }
            String dobStr = (String) date.getSelectedItem() + "-" + (String) month.getSelectedItem() + "-"
                    + (String) year.getSelectedItem();
            Date dateob = new Date();
            try {
                dateob = (new SimpleDateFormat(UserConfig.DATE_FORMAT)).parse(dobStr);
            } catch (ParseException exp) {
                System.out.println(exp);
            }

            // check input error
            errbuf.append(checkInputStr(username, UserConfig.HEADER_USERNAME));
            if (!username.isEmpty() && !register.isUniqueName(username)) {
                errbuf.append("User ID is not unique..\n");
            }
            errbuf.append(checkInputStr(pass1Str, UserConfig.HEADER_PASSWORD));
            errbuf.append(checkInputStr(pass2Str, "Confirm " + UserConfig.HEADER_PASSWORD));
            if (!pass1Str.equals(pass2Str)) {
                errbuf.append("Password does not match..\n");
            }
            errbuf.append(checkInputStr(firstname, UserConfig.HEADER_FIRST_NAME));
            errbuf.append(checkInputStr(lastname, UserConfig.HEADER_LAST_NAME));
            errbuf.append(checkInputStr(emailstr, UserConfig.HEADER_EMAIL));
            errbuf.append(checkInputStr(mobile, UserConfig.HEADER_MOBILE));

            // display error
            if (errbuf.length() > 0) {
                JOptionPane.showMessageDialog(this, errbuf.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                user.setUsername(username);
                user.setPassword(pass1Str);
                user.setFirstName(firstname);
                user.setLastName(lastname);
                user.setGender(genderstr);
                user.setDob(dateob);
                user.setEmail(emailstr);
                user.setMobile(mobile);
                // save user data
                try {
                    register.saveUser(user);
                } catch (IOException exp) {
                    System.out.println(exp);
                }

                // disable Edit
                unameText.setEnabled(false);
                pass1Text.setEnabled(false);
                pass2Text.setEnabled(false);
                fnameText.setEnabled(false);
                lnameText.setEnabled(false);
                mobileText.setEnabled(false);
                emailText.setEnabled(false);
                unameText.setEnabled(false);
                male.setEnabled(false);
                female.setEnabled(false);
                date.setEnabled(false);
                month.setEnabled(false);
                year.setEnabled(false);
                submitButton.setEnabled(false);
                term.setEnabled(false);
                resetButton.setEnabled(false);

                //display success message
                res.setText("Registration Successfully..");

            }
        } else {
            res.setText("Please accept the terms & conditions..");
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        // System.out.println(evt);
        new MainForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        // System.out.println(evt);
        //clear contents
        unameText.setText(def);
        pass1Text.setText(def);
        pass2Text.setText(def);
        fnameText.setText(def);
        lnameText.setText(def);
        mobileText.setText(def);
        emailText.setText(def);
        term.setSelected(false);
        date.setSelectedIndex(0);
        month.setSelectedIndex(0);
        year.setSelectedIndex(0);
        res.setText(def);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void passrulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passrulesMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, UserConfig.PASSWORD_RULES, "Password Rules", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_passrulesMouseClicked

    private void passrulesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passrulesMouseEntered
        // TODO add your handling code here:
        passrules.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_passrulesMouseEntered

    private void passrulesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passrulesMouseExited
        // TODO add your handling code here:
        passrules.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_passrulesMouseExited

    /**
     * Verify user input and return error
     * @param inputStr
     * @param header
     * @return String
     */
    private String checkInputStr(String inputStr, String header) {
        String errStr = new String();
        String charsStr = ", \\ /";
        char[] chars = {',', '\\', '/'};
        if (inputStr.isEmpty()) {
            errStr = header + " is empty. \n";
        } else if (header.endsWith(UserConfig.HEADER_PASSWORD)) {
            PassChecker checker = new PassChecker();
            Pattern pattern = Pattern.compile(UserConfig.PASSWORD_PATTERN);
            Matcher matcher = pattern.matcher(inputStr);
            if (checker.isBadPass(inputStr)){
                errStr = header + " input is a weak password. \n";
            } else if (!matcher.matches()) {
                errStr = header + " input does not meet password rules. \n";
            }
        } else if (header.equals(UserConfig.HEADER_EMAIL)) {
            Pattern pattern = Pattern.compile(UserConfig.EMAIL_PATTERN);
            Matcher matcher = pattern.matcher(inputStr);
            if (!matcher.matches()) {
                errStr = header + " containns wrong format. \n";
            }
        } else if (header.equals(UserConfig.HEADER_MOBILE)) {
            if (inputStr.length() < UserConfig.PHONE_PATTERN.length()) {
                errStr = header + " input is invalid. \n";
            }
        } else {
            for (int i = 0; i < chars.length; i++) {
                if (inputStr.indexOf(chars[i]) >= 0) {
                    errStr = header + " containns invalid char " + charsStr + ". \n";
                    break;
                }
            }
        }

        return errStr;

    }

    
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
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgroup;
    private javax.swing.JButton closeButton;
    private javax.swing.JComboBox<String> date;
    private javax.swing.JTextField emailText;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fnameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lnameText;
    private javax.swing.JRadioButton male;
    private javax.swing.JFormattedTextField mobileText;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JPasswordField pass1Text;
    private javax.swing.JPasswordField pass2Text;
    private javax.swing.JLabel passrules;
    private javax.swing.JLabel res;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JCheckBox term;
    private javax.swing.JLabel title;
    private javax.swing.JTextField unameText;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
