/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.BorderFactory;
import javax.swing.ToolTipManager;
import javax.swing.border.Border;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private Socket s;
    PrintWriter write;
    BufferedReader reader;
    private ObjectInputStream oi;
    private ObjectOutputStream os;
    public NewJFrame(Socket s,ObjectInputStream oi, ObjectOutputStream os) throws IOException {
        initComponents();
        jPasswordField1.setEchoChar((char)0);//for show password as char not as a *
        ToolTipManager.sharedInstance().setEnabled(false);
        Border j=BorderFactory.createMatteBorder(2, 3, 3, 3, Color.WHITE);
        jPasswordField1.setBorder(j);
        jTextField_username.setBorder(j);
        //System.out.println("in jframe");
        this.s=s;
        //this.oi = new ObjectInputStream(s.getInputStream());System.out.println("in jframe");
        //this.os = new ObjectOutputStream(s.getOutputStream());System.out.println("in jframe");
        setVisible(true);
        System.out.println("out jframe");
        this.oi = oi;System.out.println("val");
        this.os = os;System.out.println("out of constructor");
    }
    public NewJFrame() {
        initComponents();
        jPasswordField1.setEchoChar((char)0);//for show password as char not as a *
        ToolTipManager.sharedInstance().setEnabled(false);
         Border j=BorderFactory.createMatteBorder(2, 3, 3, 3, Color.WHITE);
        jPasswordField1.setBorder(j);
        jTextField_username.setBorder(j);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        reg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jTextField_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_username.setForeground(new java.awt.Color(204, 204, 255));
        jTextField_username.setText("UserName@mnnit.ac.in");
        jTextField_username.setToolTipText("");
        jTextField_username.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField_username.setHighlighter(null);
        jTextField_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusLost(evt);
            }
        });
        jTextField_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_usernameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField_usernameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField_usernameMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField_usernameMouseReleased(evt);
            }
        });
        jTextField_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_usernameActionPerformed(evt);
            }
        });
        jTextField_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_usernameKeyPressed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 255));
        jPasswordField1.setText("Password");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseExited(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        login.setBackground(new java.awt.Color(0, 102, 102));
        login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        reg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        reg.setForeground(new java.awt.Color(255, 255, 255));
        reg.setText("Create new account");
        reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(reg)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reg)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 126, Short.MAX_VALUE))
        );

        //jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("C:/Users/rohit/OneDrive/Documents/NetBeansProjects/mavenproject1/src/main/java/com/lasercodes/mavenproject1/anokhi8.jpeg")));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusGained
        // TODO add your handling code here:
     
    
       
    }//GEN-LAST:event_jTextField_usernameFocusGained

    private void jTextField_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusLost
        // TODO add your handling code here:
        jTextField_username.setBorder(null);
        
    }//GEN-LAST:event_jTextField_usernameFocusLost

    private void jTextField_usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_usernameMouseClicked
        // TODO add your handling code here:
        if(jTextField_username.getText().trim().equals("UserName"))
        {
            jTextField_username.setText("");
            jTextField_username.setForeground(Color.BLACK);
        }
        Border j=BorderFactory.createMatteBorder(2, 3, 3, 3, Color.BLUE);
        jTextField_username.setBorder(j);
    }//GEN-LAST:event_jTextField_usernameMouseClicked

    private void jTextField_usernameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_usernameMouseExited
         //TODO add your handling code here:
        if(jTextField_username.getText().trim().equals("")|| jTextField_username.getText().trim().equals("UserName"))
        {
            jTextField_username.setText(" UserName");
            jTextField_username.setForeground(new Color(204,204,225));
        }
        jTextField_username.setBorder(null);
    }//GEN-LAST:event_jTextField_usernameMouseExited

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        // TODO add your handling code here:
        String pass=String.valueOf(jPasswordField1.getPassword());
        if(pass.trim().equals("Password"))
        {
            jPasswordField1.setText("");
            jPasswordField1.setForeground(Color.BLACK);
        }
        Border j=BorderFactory.createMatteBorder(2, 3, 3, 3, Color.BLUE);
        jPasswordField1.setBorder(j);
        jPasswordField1.setEchoChar('*');
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jPasswordField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseExited
        // TODO add your handling code here:
         String pass=String.valueOf(jPasswordField1.getPassword());
        if(pass.trim().equals("") || pass.trim().equals("Password"))
        {   jPasswordField1.setEchoChar((char)0);
            jPasswordField1.setText(" Password");
            jPasswordField1.setForeground(new Color(204,204,225));
        }
        
        jPasswordField1.setBorder(null);
        
    }//GEN-LAST:event_jPasswordField1MouseExited

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_usernameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField_usernameActionPerformed

    private void jTextField_usernameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_usernameMouseReleased
        // TODO add your handling code here:
         
        
    }//GEN-LAST:event_jTextField_usernameMouseReleased

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jTextField_usernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_usernameMouseEntered
        // TODO add your handling code here:
        Border j=BorderFactory.createMatteBorder(2, 3, 3, 3, Color.BLUE);
        jTextField_username.setBorder(j);
        
    }//GEN-LAST:event_jTextField_usernameMouseEntered

    private void jPasswordField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseEntered
        // TODO add your handling code here:
        Border j=BorderFactory.createMatteBorder(2, 3, 3, 3, Color.BLUE);
        jPasswordField1.setBorder(j);
    }//GEN-LAST:event_jPasswordField1MouseEntered

    private void jTextField_usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_usernameKeyPressed
        // TODO add your handling code here:
        if(jTextField_username.getText().trim().equals("UserName"))
        {
            jTextField_username.setText("");
            jTextField_username.setForeground(Color.BLACK);
        }
        Border j=BorderFactory.createMatteBorder(2, 3, 3, 3, Color.BLUE);
        jTextField_username.setBorder(j);
        
    }//GEN-LAST:event_jTextField_usernameKeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
        if(String.valueOf(jPasswordField1.getPassword()).trim().equals("Password"))
        {
            jPasswordField1.setText("");
            jPasswordField1.setForeground(Color.BLACK);
        }
        jPasswordField1.setEchoChar('*');
        Border j=BorderFactory.createMatteBorder(2, 3, 3, 3, Color.BLUE);
        jPasswordField1.setBorder(j);
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        try{
            //System.out.println("log1");
            String s="log";
            os.writeInt(1);
            os.flush();
                String username=jTextField_username.getText();
                String password=String.valueOf(jPasswordField1.getPassword());
                Login Ldata= new Login(username,password);
                
                os.writeObject(Ldata);os.flush();
                String res = (String)oi.readUTF();os.flush();
                if(res.equals("correct")){
                  //show a new form 
                    JOptionPane.showMessageDialog(null,"correct details","Login sucess",2);
                    //break;
                }
                else{
                    //show error
                    JOptionPane.showMessageDialog(null,"Invalid Username/Password","Login Error",2);
                    //this.jButton1ActionPerformed(evt);
                }
        }
        catch(Exception e){
            e.printStackTrace();
        }
           
    }//GEN-LAST:event_loginActionPerformed

    private void regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regMouseClicked
        // TODO add your handling code here:
        try{
            Register_Form rf =new Register_Form(s,oi,os);
        this.setVisible(false);
        os.flush();
        os.writeInt(2);
        os.flush();
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_regMouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField_username;
    private javax.swing.JButton login;
    private javax.swing.JLabel reg;
    // End of variables declaration//GEN-END:variables
}
