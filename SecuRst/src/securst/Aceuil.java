package securst;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author F_ALI
 */
public class Aceuil extends javax.swing.JFrame {
Connection  conn = null ;
ResultSet rs = null;
PreparedStatement pst = null;
    public Aceuil() {
        initComponents();
        conn= Connectdb.Connectdab();
    }
public void close (){
WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        connecter = new javax.swing.JToggleButton();
        quitter = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(608, 384));
        setMinimumSize(new java.awt.Dimension(608, 384));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrateur");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 140, 20);

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Login :");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 150, 40, 14);

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Mot de passe :");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 200, 90, 14);

        txtuser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        getContentPane().add(txtuser);
        txtuser.setBounds(430, 140, 130, 30);

        txtpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordKeyPressed(evt);
            }
        });
        getContentPane().add(txtpassword);
        txtpassword.setBounds(430, 190, 130, 30);

        connecter.setBackground(java.awt.Color.white);
        connecter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        connecter.setIcon(new javax.swing.ImageIcon("D:\\PFE\\connect-icon (1).png")); // NOI18N
        connecter.setText("Connecter");
        connecter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        connecter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connecterMouseClicked(evt);
            }
        });
        connecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connecterActionPerformed(evt);
            }
        });
        getContentPane().add(connecter);
        connecter.setBounds(290, 253, 130, 30);

        quitter.setBackground(java.awt.Color.white);
        quitter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        quitter.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Log-Out-icon.png")); // NOI18N
        quitter.setText("Quitter");
        quitter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });
        getContentPane().add(quitter);
        quitter.setBounds(423, 253, 130, 30);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(184, 323, 285, 0);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 0, 109, 0);

        back.setBackground(java.awt.Color.white);
        back.setIcon(new javax.swing.ImageIcon("D:\\PFE\\26_03_200912_35_492568_72160565933_622075933_2374175_8056228_n.jpg")); // NOI18N
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        back.setRequestFocusEnabled(false);
        back.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                backComponentResized(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(0, 0, 608, 384);
        back.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void connecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connecterActionPerformed
        String user = txtuser.getText();
        String password = txtpassword.getText();
        String sql = "Select * from employer where user=? and password=?";
        try{
                      
          Class.forName("com.mysql.jdbc.Driver") ;
          Connection conn;
           Statement St;
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tunisietelecom","root","");
               St = conn.createStatement();
          
            pst=conn.prepareStatement(sql);
            pst.setString(1,txtuser.getText());
            pst.setString(2,txtpassword.getText());
            
            rs = pst.executeQuery();
            if(rs.next()){
            
          // JOptionPane.showMessageDialog(null,"user and password are correct");
            close();
            FormAdmins s = new FormAdmins();
            s.setVisible(true);
            
            }
             else
                JOptionPane.showMessageDialog(null,"user or password is not correct");
             conn.close();
        }
        catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_connecterActionPerformed

    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
        System.exit (10);
    }//GEN-LAST:event_quitterActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void connecterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connecterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_connecterMouseClicked

    private void backComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_backComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_backComponentResized

    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
      String user = txtuser.getText();
        String password = txtpassword.getText();
        String sql = "Select * from employer where user=? and password=?";
        try{
                      
          Class.forName("com.mysql.jdbc.Driver") ;
          Connection conn;
           Statement St;
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tunisietelecom","root","");
               St = conn.createStatement();
          
            pst=conn.prepareStatement(sql);
            pst.setString(1,txtuser.getText());
            pst.setString(2,txtpassword.getText());
            
            rs = pst.executeQuery();
            if(rs.next()){
            
         //   JOptionPane.showMessageDialog(null,"user and password are correct");
            close();
            FormAdmins s = new FormAdmins();
            s.setVisible(true);
            
            }
             else
                JOptionPane.showMessageDialog(null,"user or password is not correct");
             conn.close();
        }
        catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
        }
     }
    }//GEN-LAST:event_txtpasswordKeyPressed

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
            java.util.logging.Logger.getLogger(Aceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Aceuil().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JToggleButton connecter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JToggleButton quitter;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
