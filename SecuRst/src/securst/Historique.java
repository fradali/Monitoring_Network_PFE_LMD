package securst;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
 import  java.sql.*;
 import java.sql.DriverManager;
import  java.sql.Statement;
import  java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Historique extends javax.swing.JFrame {

    public Historique() {
        initComponents();
    }

    public void close (){
WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablehisto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        setMinimumSize(new java.awt.Dimension(812, 390));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        Tablehisto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tablehisto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablehistoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablehisto);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 780, 160);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Historique :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 50, 100, 18);

        jToggleButton1.setIcon(new javax.swing.ImageIcon("D:\\PFE\\go-back-icon.png")); // NOI18N
        jToggleButton1.setText("Retour");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(330, 280, 130, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Sans titre-2.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 810, 330);

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 255));

        jMenu1.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Earth-Security-icon.png")); // NOI18N
        jMenu1.setText("Network Security");

        jMenu3.setIcon(new javax.swing.ImageIcon("D:\\PFE\\next-icon.png")); // NOI18N
        jMenu3.setText("Acceder à");

        jMenuItem6.setIcon(new javax.swing.ImageIcon("D:\\PFE\\system-icon.png")); // NOI18N
        jMenuItem6.setText("Conf Admins");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem4.setIcon(new javax.swing.ImageIcon("D:\\PFE\\system-icon.png")); // NOI18N
        jMenuItem4.setText("Conf Machines");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon("D:\\PFE\\system-icon.png")); // NOI18N
        jMenuItem5.setText("Ping");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

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

        jMenuItem3.setIcon(new javax.swing.ImageIcon("D:\\PFE\\info-about-icon.png")); // NOI18N
        jMenuItem3.setText("A Propos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//          Load FormStagiaire
private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    try{
        // connexion avec base de donnée 
         Class.forName("com.mysql.jdbc.Driver") ;
       
         cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/tunisietelecom","root","");
        St = cnx.createStatement();

        dt = new DefaultTableModel();
        dt.addColumn("ip_h");
        dt.addColumn("alerte");
        dt.addColumn("date");
        
        Tablehisto.setModel(dt);
       
        AfficherHisto();
       
        i = 0;
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur de connexion\n"+e.getMessage());
    }
}//GEN-LAST:event_formWindowOpened


private void TablehistoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablehistoMouseClicked
    try{
        i = Tablehisto.getSelectedRow();

    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur selectionnéé historique\n"+e.getMessage());
    }
}//GEN-LAST:event_TablehistoMouseClicked


    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         close();
            FormMachines d = new FormMachines();
            d.setVisible(true); 
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

         close();
            Ping1 d = new Ping1();
            d.setVisible(true); 
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        close();
            FormAdmins e = new FormAdmins();
            e.setVisible(true); 
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
            close();
            Ping1 dd = new Ping1();
            dd.setVisible(true); 
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Apropos ap = new Apropos();
            ap.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

//          procedure qui Afficher la liste des admins.
private void AfficherHisto(){
    try{
        dt.setRowCount(0); // vider la list des admins.
        Rs = St.executeQuery("Select * From historique");
        
        while(Rs.next()){
            
            ip_h = Rs.getString("ip_h");
            alerte = Rs.getString("alerte");
            date = Rs.getString("date");
            
            Object[] employer = {ip_h,alerte,date};
            dt.addRow(employer);
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur afficher la liste de l'historique\n"+e.getMessage());
    }
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
            java.util.logging.Logger.getLogger(Historique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Historique().setVisible(true);
            }
        });
    }
    
    // Déclaration des variables.
    private Connection cnx;
    private Statement St;
    private ResultSet Rs;
    private DefaultTableModel dt;
    private String ip_h ,alerte,date;
    private int i; // indice de déplacement
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablehisto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
