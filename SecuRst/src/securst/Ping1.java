package securst;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Ping1 extends javax.swing.JFrame {
private boolean test = true ;
Connection  conn = null ;
ResultSet rs = null;
PreparedStatement pst = null;
    public Ping1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        ping = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(812, 410));
        setMinimumSize(new java.awt.Dimension(812, 410));
        setPreferredSize(new java.awt.Dimension(767, 410));
        setResizable(false);
        getContentPane().setLayout(null);

        ping.setIcon(new javax.swing.ImageIcon("D:\\PFE\\network-2-icon.png")); // NOI18N
        ping.setText("Tester");
        ping.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        ping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pingActionPerformed(evt);
            }
        });
        getContentPane().add(ping);
        ping.setBounds(310, 310, 130, 30);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 10, 757, 273);

        jToggleButton1.setIcon(new javax.swing.ImageIcon("D:\\PFE\\archive-icon.png")); // NOI18N
        jToggleButton1.setText("Historique");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(520, 310, 130, 30);

        jToggleButton2.setIcon(new javax.swing.ImageIcon("D:\\PFE\\go-back-icon.png")); // NOI18N
        jToggleButton2.setText("Retour");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(110, 310, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Sans titre-3.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 800, 380);

        jMenu1.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Earth-Security-icon.png")); // NOI18N
        jMenu1.setText("Network Security");

        jMenu3.setIcon(new javax.swing.ImageIcon("D:\\PFE\\next-icon.png")); // NOI18N
        jMenu3.setText("Acceder à");

        jMenuItem4.setIcon(new javax.swing.ImageIcon("D:\\PFE\\system-icon.png")); // NOI18N
        jMenuItem4.setText("Conf Admins");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon("D:\\PFE\\system-icon.png")); // NOI18N
        jMenuItem5.setText("Conf Machines");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon("D:\\PFE\\system-icon.png")); // NOI18N
        jMenuItem6.setText("Historique");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenu1.add(jMenu3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Status-dialog-error-icon.png")); // NOI18N
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Help-Info-icon.png")); // NOI18N
        jMenu2.add(jSeparator1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon("D:\\PFE\\info-about-icon.png")); // NOI18N
        jMenuItem2.setText("A Propos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void close (){
WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
}
    class MonThread extends Thread {

        @Override
        public void run() {
           
            while (test) {
                String ipAddress = null;
                 Statement st ;
                 Connection conn = null;
                 String erreur = null ;
                 
                    ResultSet rs;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tunisietelecom", "root", "");
                    Statement stmt = conn.createStatement();
                    
                           St = conn.createStatement();
                           St.executeUpdate("Delete from historique ");
                    rs = stmt.executeQuery("SELECT ip FROM machines ");

                    while (rs.next()) {
                        jTextArea1.append("Ping  Starts..." + "\n");
                       
                        ipAddress = rs.getString(1);
                        System.out.println("The Ip is =" + ipAddress);

                        InetAddress inet = InetAddress.getByName(ipAddress);
                        jTextArea1.append("Sending Ping Request to " + ipAddress + "\n");
                        boolean status = inet.isReachable(6000);

                        if (status) {
                            jTextArea1.append("Status : The Computer with the corrent IP :"+ipAddress+"  is reachable " + "\n");
                        } else {
                            
                             DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	                //  get current date time with Date() 'Error !! check your PC'
	                    Date date = new Date();
                            String dt = dateFormat.format(date);
                          
                            String SQL = "INSERT INTO historique(ip_h,alerte,date) VALUES('"+ipAddress+"','"+erreur+"','"+dt+"')";
                             St = conn.createStatement();
                             St.executeUpdate(SQL);
                            
                            jTextArea1.append("Status : IP is not reachable" + "\n");
                         
                        }
                    }

                } catch (UnknownHostException e1) {
                    erreur = "IP do not exist";
                    jTextArea1.append(erreur + "\n");
                } catch (IOException e2) {
                    erreur="Erreur reaching host";
                    jTextArea1.append( erreur + "\n");
                } catch (Exception e3) {
                    erreur="Erreur"+e3.getMessage();
                    jTextArea1.append(erreur+ "\n");
                }finally{
                    
                 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	                //  get current date time with Date()
	                    Date date = new Date();
                            String dt = dateFormat.format(date);
                          
                            String SQL = "INSERT INTO historique(ip_h,alerte,date) VALUES('"+ipAddress+"','"+erreur+"','"+dt+"')";
                    try {
                        St = conn.createStatement();
                          St.executeUpdate(SQL);
                    } catch (SQLException ex) {
                        Logger.getLogger(Ping1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                           
                }
                
                
                try {
                    sleep(60000);//1 minute
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ping1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
      MonThread processus_test = new MonThread();
    
    private void pingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pingActionPerformed

        if(ping.isSelected())
        { 
            
            processus_test.start();
            ping.setText("Test ongoing");
        }
        else
           test=false;
    }//GEN-LAST:event_pingActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         close();
            FormAdmins d = new FormAdmins();
            d.setVisible(true); 
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
         close();
            FormMachines e = new FormMachines();
            e.setVisible(true); 
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
            close();
            Historique h = new Historique();
            h.setVisible(true); 
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
                close();
            Historique he = new Historique();
            he.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        close();
            FormMachines ee = new FormMachines();
            ee.setVisible(true); 
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Apropos ap = new Apropos();
            ap.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ping1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ping1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ping1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ping1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ping1().setVisible(true);
            }
        });
    }
 //private Connection cnx;
    private Statement St;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton ping;
    // End of variables declaration//GEN-END:variables
}
