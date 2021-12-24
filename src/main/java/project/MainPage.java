/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.net.*;
import java.io.*;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author hp
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    private Socket s;
    private ObjectInputStream oi;
    private ObjectOutputStream os;
    public MainPage(Socket s,ObjectInputStream oi, ObjectOutputStream os) {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        this.s=s;
        this.oi=oi;
        this.os=os;
        
    }
    public MainPage()
    {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Class9 = new javax.swing.JPanel();
        class9 = new javax.swing.JLabel();
        Class11 = new javax.swing.JPanel();
        class11 = new javax.swing.JLabel();
        Class10 = new javax.swing.JPanel();
        class13 = new javax.swing.JLabel();
        Class12 = new javax.swing.JPanel();
        class12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        classes = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        chat = new javax.swing.JLabel();
        Notification = new javax.swing.JLabel();
        TimeTable = new javax.swing.JLabel();
        Class8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        Class9.setBackground(new java.awt.Color(0, 0, 102));
        Class9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.white));
        Class9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Class9MouseClicked(evt);
            }
        });

        class9.setBackground(new java.awt.Color(102, 0, 102));
        class9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        class9.setForeground(new java.awt.Color(255, 255, 255));
        class9.setText("CLASS 9");

        javax.swing.GroupLayout Class9Layout = new javax.swing.GroupLayout(Class9);
        Class9.setLayout(Class9Layout);
        Class9Layout.setHorizontalGroup(
            Class9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Class9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(class9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Class9Layout.setVerticalGroup(
            Class9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Class9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(class9)
                .addGap(30, 30, 30))
        );

        Class11.setBackground(new java.awt.Color(0, 0, 102));
        Class11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.white));
        Class11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Class11MouseClicked(evt);
            }
        });

        class11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        class11.setForeground(new java.awt.Color(255, 255, 255));
        class11.setText("CLASS 11");

        javax.swing.GroupLayout Class11Layout = new javax.swing.GroupLayout(Class11);
        Class11.setLayout(Class11Layout);
        Class11Layout.setHorizontalGroup(
            Class11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Class11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(class11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Class11Layout.setVerticalGroup(
            Class11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Class11Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(class11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        Class10.setBackground(new java.awt.Color(0, 0, 102));
        Class10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.white));
        Class10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Class10MouseClicked(evt);
            }
        });

        class13.setBackground(new java.awt.Color(255, 255, 255));
        class13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        class13.setForeground(new java.awt.Color(255, 255, 255));
        class13.setText("CLASS 10");

        javax.swing.GroupLayout Class10Layout = new javax.swing.GroupLayout(Class10);
        Class10.setLayout(Class10Layout);
        Class10Layout.setHorizontalGroup(
            Class10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Class10Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(class13)
                .addContainerGap())
        );
        Class10Layout.setVerticalGroup(
            Class10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Class10Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(class13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        Class12.setBackground(new java.awt.Color(0, 0, 102));
        Class12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.white));
        Class12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Class12MouseClicked(evt);
            }
        });

        class12.setBackground(new java.awt.Color(255, 255, 255));
        class12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        class12.setForeground(new java.awt.Color(255, 255, 255));
        class12.setText("CLASS 12");

        javax.swing.GroupLayout Class12Layout = new javax.swing.GroupLayout(Class12);
        Class12.setLayout(Class12Layout);
        Class12Layout.setHorizontalGroup(
            Class12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Class12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(class12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Class12Layout.setVerticalGroup(
            Class12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Class12Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(class12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 0, 102));

        classes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        classes.setForeground(new java.awt.Color(255, 255, 255));
        classes.setText("CLASSES");
        classes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classesMouseClicked(evt);
            }
        });

        profile.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        profile.setForeground(new java.awt.Color(255, 255, 255));
        profile.setText("PROFILE");
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });

        chat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chat.setForeground(new java.awt.Color(255, 255, 255));
        chat.setText("CHAT");
        chat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chatMouseClicked(evt);
            }
        });

        Notification.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Notification.setForeground(new java.awt.Color(255, 255, 255));
        Notification.setText("NOTIFICATION");
        Notification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NotificationMouseClicked(evt);
            }
        });

        TimeTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TimeTable.setForeground(new java.awt.Color(255, 255, 255));
        TimeTable.setText("TIME-TABLE");
        TimeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimeTableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classes)
                    .addComponent(chat)
                    .addComponent(Notification)
                    .addComponent(TimeTable))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(profile)
                .addGap(56, 56, 56)
                .addComponent(classes)
                .addGap(54, 54, 54)
                .addComponent(chat)
                .addGap(55, 55, 55)
                .addComponent(Notification)
                .addGap(72, 72, 72)
                .addComponent(TimeTable)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        Class8.setBackground(new java.awt.Color(0, 0, 102));
        Class8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Class8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Class8MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CLASS 8");

        javax.swing.GroupLayout Class8Layout = new javax.swing.GroupLayout(Class8);
        Class8.setLayout(Class8Layout);
        Class8Layout.setHorizontalGroup(
            Class8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Class8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        Class8Layout.setVerticalGroup(
            Class8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Class8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Class8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(Class9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(Class10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Class11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(Class12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Class10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Class9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Class8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Class11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Class12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
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

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_profileMouseClicked

    private void classesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_classesMouseClicked

    private void chatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatMouseClicked
        // TODO add your handling code here:
        try{
            String str="";
        ChatPage cp=new ChatPage(this.s,this.oi,this.os,str);
        os.write(4);
        os.flush();
        this.setVisible(false);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        
        
    }//GEN-LAST:event_chatMouseClicked

    private void NotificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotificationMouseClicked
        // TODO add your handling code here:
        //Will be added in case of new notifiaction
        
    }//GEN-LAST:event_NotificationMouseClicked

    private void TimeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimeTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeTableMouseClicked

    private void Class8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Class8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Class8MouseClicked

    private void Class9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Class9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Class9MouseClicked

    private void Class10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Class10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Class10MouseClicked

    private void Class11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Class11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Class11MouseClicked

    private void Class12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Class12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Class12MouseClicked

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Class10;
    private javax.swing.JPanel Class11;
    private javax.swing.JPanel Class12;
    private javax.swing.JPanel Class8;
    private javax.swing.JPanel Class9;
    private javax.swing.JLabel Notification;
    private javax.swing.JLabel TimeTable;
    private javax.swing.JLabel chat;
    private javax.swing.JLabel class11;
    private javax.swing.JLabel class12;
    private javax.swing.JLabel class13;
    private javax.swing.JLabel class9;
    private javax.swing.JLabel classes;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel profile;
    // End of variables declaration//GEN-END:variables
}
