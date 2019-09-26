/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.util.*;

/**
 *
 * @author Amritha
 */
public class user_roomhistory extends javax.swing.JFrame {

    /**
     * Creates new form user_roomhistory
     */
    private Connection conn; 
     ResultSet rs;
     ResultSet rs2;
     ResultSet rst;
    PreparedStatement ps;
     PreparedStatement pss;
    PreparedStatement ps2;
    PreparedStatement pst;
    String bid,user;
   
    
    public user_roomhistory() throws SQLException {
        initComponents();
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // The credentials for the mysql account will differ
            this.conn =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","amri");
            
        }
        catch(ClassNotFoundException e){System.out.println(e);}
    }
    public user_roomhistory(String user) throws SQLException {
        initComponents();
        this.user=user;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // The credentials for the mysql account will differ
            this.conn =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","amri");
            
        }
        catch(ClassNotFoundException e){System.out.println(e);}
        try {
        String sql2 ="Select bookingid,fname,chin,chout,roomtype,noofrooms from booking where emailid=?";
              
        try {
            ps2 = conn.prepareStatement(sql2);
        } catch (SQLException ex) {
            Logger.getLogger(user_roomhistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ps2.setString(1,user);
        } catch (SQLException ex) {
            Logger.getLogger(user_roomhistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs2 = ps2.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(user_roomhistory.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            table.setModel(DbUtils.resultSetToTableModel(rs2)); 
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hmsPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("hmsPU").createEntityManager();
        booking_1Query = java.beans.Beans.isDesignTime() ? null : hmsPUEntityManager.createQuery("SELECT b FROM Booking_1 b");
        booking_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : booking_1Query.getResultList();
        jPanel1 = new javax.swing.JPanel();
        dd = new javax.swing.JTextField();
        ee = new javax.swing.JTextField();
        ff = new javax.swing.JTextField();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        bb = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cc = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(dd);
        dd.setBounds(410, 380, 86, 22);

        ee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eeActionPerformed(evt);
            }
        });
        jPanel1.add(ee);
        ee.setBounds(530, 380, 93, 22);
        jPanel1.add(ff);
        ff.setBounds(670, 380, 77, 22);

        button2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button2.setLabel("DELETE RESERVATION");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2);
        button2.setBounds(510, 490, 223, 30);

        button3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button3.setLabel("UPDATE RESERVATION");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel1.add(button3);
        button3.setBounds(240, 490, 226, 32);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "BookingID", "Name", "Checkin", "Checkout", "Room type", "No of Rooms"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 200, 756, 170);

        bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbActionPerformed(evt);
            }
        });
        jPanel1.add(bb);
        bb.setBounds(160, 380, 77, 22);

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 20, 63, 25);
        jPanel1.add(cc);
        cc.setBounds(280, 380, 80, 22);

        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(240, 240, 240));
        label1.setText("Booking History");
        jPanel1.add(label1);
        label1.setBounds(240, 30, 300, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Welcome, ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 140, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/b.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eeActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        
        int row=table.getSelectedRow();
        String cell= table.getModel().getValueAt(row,0).toString();
        String sql = "delete from booking where bookingid = " + cell;
        
        try{
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Deleted successfully");
        }
        catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        try {
        String sql2 ="Select bookingid,fname,chin,chout,roomtype,noofrooms from booking where emailid=?";
              
        try {
            ps2 = conn.prepareStatement(sql2);
        } catch (SQLException ex) {
            Logger.getLogger(user_roomhistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ps2.setString(1,user);
        } catch (SQLException ex) {
            Logger.getLogger(user_roomhistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs2 = ps2.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(user_roomhistory.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            table.setModel(DbUtils.resultSetToTableModel(rs2)); 
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel model;
        model = (DefaultTableModel)table.getModel();
        int row=table.getSelectedRow();
        
        bb.setText(model.getValueAt(row,1).toString());
        cc.setText(model.getValueAt(row,2).toString());
        dd.setText(model.getValueAt(row,3).toString());
        ee.setText(model.getValueAt(row,4).toString());
        ff.setText(model.getValueAt(row,5).toString());
        bid = model.getValueAt(row, 0).toString();
            
       
    }//GEN-LAST:event_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
               
                this.dispose();
                new userpage(user).setVisible(true);     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
       try {
           
           String value2 = bb.getText();
           String value3 = cc.getText();
           String value4 = dd.getText();
           String value5 = ee.getText();
           String value6 = ff.getText();
           
           String sqll = "update booking set fname='"+value2+"',chin='"+value3+"',chout='"+value4+"',roomtype='"+value5+"',noofrooms='"+value6+"'"+"where bookingid = '"+bid+"'";
           pst=conn.prepareStatement(sqll);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Updated!");
           
          }
       catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        try {
        String sql2 ="Select bookingid,fname,chin,chout,roomtype,noofrooms from booking where emailid=?";
              
        try {
            ps2 = conn.prepareStatement(sql2);
        } catch (SQLException ex) {
            Logger.getLogger(user_roomhistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ps2.setString(1,user);
        } catch (SQLException ex) {
            Logger.getLogger(user_roomhistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs2 = ps2.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(user_roomhistory.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            table.setModel(DbUtils.resultSetToTableModel(rs2)); 
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_button3ActionPerformed

    private void bbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bbActionPerformed

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
            java.util.logging.Logger.getLogger(user_roomhistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_roomhistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_roomhistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_roomhistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new user_roomhistory().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(user_roomhistory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bb;
    private java.util.List<javaapplication1.Booking_1> booking_1List;
    private javax.persistence.Query booking_1Query;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.JTextField cc;
    private javax.swing.JTextField dd;
    private javax.swing.JTextField ee;
    private javax.swing.JTextField ff;
    private javax.persistence.EntityManager hmsPUEntityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
