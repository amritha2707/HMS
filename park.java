/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amritha
 */
public class park extends javax.swing.JFrame {

    /**
     * Creates new form park
     */
    
    private Connection conn; 
    ResultSet rs;
    PreparedStatement ps;
    
       
    public park() throws SQLException {
        initComponents();
         try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // The credentials for the mysql account will differ
            this.conn =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","amri");
            
        }
        catch(ClassNotFoundException e){System.out.println(e);}
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
        button1 = new java.awt.Button();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        rating = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        hno_tf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        button1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button1.setLabel("Book Now!");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1);
        button1.setBounds(215, 244, 140, 40);

        label1.setForeground(new java.awt.Color(240, 240, 240));
        label1.setText("Hotel ID:");
        jPanel1.add(label1);
        label1.setBounds(360, 260, 51, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Hotel The Park, Chennai");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 60, 310, 40);

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 10, 63, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/park.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(360, 110, 120, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/parkk.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(490, 110, 120, 110);

        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea1.setRows(5);
        jTextArea1.setText("Stay at the Park Hotels Chennai\n & experience world class \nhospitality and host of \nspecialized facilities that that \nthe hotel has to offer.");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 110, 270, 110);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("RATING:");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 350, 110, 20);

        rating.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rating.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(rating);
        rating.setBounds(210, 340, 40, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("/5");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(250, 350, 40, 20);

        jButton2.setText("RATE YOUR STAY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(420, 350, 150, 25);

        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("(click!)");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 370, 38, 16);

        hno_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hno_tf.setForeground(new java.awt.Color(255, 255, 255));
        hno_tf.setText("2");
        jPanel1.add(hno_tf);
        hno_tf.setBounds(420, 260, 9, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        this.dispose();  
            booking book = null;
        try {
            book = new booking(hno_tf.getText());
        } catch (SQLException ex) {
            Logger.getLogger(park.class.getName()).log(Level.SEVERE, null, ex);
        }
            book.setVisible(true); 
    }//GEN-LAST:event_button1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();  
            hotels hot = null;
            hot = new hotels();
            hot.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
         String sql = "select avg(rating) from rating where hotelid=2";
         
        try {
            ps = conn.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(radisson_blu.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(radisson_blu.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
            if(rs.next()) 
            {
                float i= rs.getFloat("avg(rating)");
                String s=String.valueOf(i);
                rating.setText(s);
            }
           
        }
        catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         this.dispose();
                 feedback fd = null;
        try {
            fd = new feedback();
        } catch (SQLException ex) {
            Logger.getLogger(radisson_blu.class.getName()).log(Level.SEVERE, null, ex);
        }
                 fd.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(park.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(park.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(park.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(park.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new park().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(park.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel hno_tf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Label label1;
    private javax.swing.JLabel rating;
    // End of variables declaration//GEN-END:variables
}
