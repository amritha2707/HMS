/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amritha
 */
public class userpage extends javax.swing.JFrame {

    String email,user;
    
    /**
     * Creates new form userpage
     */
    private Connection conn;
    public userpage() throws SQLException {
        initComponents();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // The credentials for the mysql account will differ
            this.conn =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","amri");
            
        }
        catch(ClassNotFoundException e){System.out.println(e);}
    }
    public userpage(String para1){
         initComponents();
         this.user = para1;
         name.setText(para1);
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
        label1 = new java.awt.Label();
        Book_rooms = new java.awt.Button();
        book_tours = new java.awt.Button();
        reserve_restaurants = new java.awt.Button();
        booked_rooms_history = new java.awt.Button();
        booked_tours_history = new java.awt.Button();
        name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(240, 240, 240));
        label1.setText("WELCOME,");
        jPanel1.add(label1);
        label1.setBounds(80, 50, 140, 40);

        Book_rooms.setLabel("Book rooms");
        Book_rooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_roomsActionPerformed(evt);
            }
        });
        jPanel1.add(Book_rooms);
        Book_rooms.setBounds(80, 120, 130, 90);

        book_tours.setLabel("Book tours");
        book_tours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_toursActionPerformed(evt);
            }
        });
        jPanel1.add(book_tours);
        book_tours.setBounds(80, 230, 130, 90);

        reserve_restaurants.setLabel("Reserve restaurants");
        jPanel1.add(reserve_restaurants);
        reserve_restaurants.setBounds(80, 340, 130, 100);

        booked_rooms_history.setLabel("Room booking history");
        booked_rooms_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booked_rooms_historyActionPerformed(evt);
            }
        });
        jPanel1.add(booked_rooms_history);
        booked_rooms_history.setBounds(240, 120, 136, 90);

        booked_tours_history.setLabel("Booked tours history");
        booked_tours_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booked_tours_historyActionPerformed(evt);
            }
        });
        jPanel1.add(booked_tours_history);
        booked_tours_history.setBounds(240, 230, 140, 90);

        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(name);
        name.setBounds(240, 50, 250, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amritha\\Documents\\3RD YEAR\\ooad lab\\hotel reservation system\\bell.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Book_roomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_roomsActionPerformed
        // TODO add your handling code here:
        location loc = null;
        try {
            loc = new location();
        } catch (SQLException ex) {
            Logger.getLogger(userpage.class.getName()).log(Level.SEVERE, null, ex);
        }
                loc.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_Book_roomsActionPerformed

    private void booked_rooms_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booked_rooms_historyActionPerformed
        // TODO add your handling code here:
        this.dispose();  
            user_roomhistory trw = null;
        try {
            trw = new user_roomhistory(user);
        } catch (SQLException ex) {
            Logger.getLogger(userpage.class.getName()).log(Level.SEVERE, null, ex);
        }
            trw.setVisible(true);
    }//GEN-LAST:event_booked_rooms_historyActionPerformed

    private void book_toursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_toursActionPerformed
        // TODO add your handling code here:
        this.dispose();  
            tours tr = null;
            tr = new tours(user);
            tr.setVisible(true);
    }//GEN-LAST:event_book_toursActionPerformed

    private void booked_tours_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booked_tours_historyActionPerformed
        // TODO add your handling code here:
         
        this.dispose();  
            tourhistory tra = null;
        try {
            tra = new tourhistory(user);
        } catch (SQLException ex) {
            Logger.getLogger(userpage.class.getName()).log(Level.SEVERE, null, ex);
        }
            tra.setVisible(true);
    }//GEN-LAST:event_booked_tours_historyActionPerformed

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
            java.util.logging.Logger.getLogger(userpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new userpage().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(userpage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Book_rooms;
    private java.awt.Button book_tours;
    private java.awt.Button booked_rooms_history;
    private java.awt.Button booked_tours_history;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private javax.swing.JLabel name;
    private java.awt.Button reserve_restaurants;
    // End of variables declaration//GEN-END:variables
}
