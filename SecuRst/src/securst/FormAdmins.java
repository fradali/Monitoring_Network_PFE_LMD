package securst;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
 import  java.sql.*;
 import java.sql.DriverManager;
import  java.sql.Statement;
import  java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormAdmins extends javax.swing.JFrame {

    public FormAdmins() {
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
        txtid = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtprenom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tableadmins = new javax.swing.JTable();
        btnPremier = new javax.swing.JButton();
        btnSuivant = new javax.swing.JButton();
        btnPrecedent = new javax.swing.JButton();
        btnDernier = new javax.swing.JButton();
        btnAjouter = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnRechercher = new javax.swing.JButton();
        btnAfficher = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtRecherhcer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        txtus = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
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
        setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        setMaximumSize(new java.awt.Dimension(812, 390));
        setMinimumSize(new java.awt.Dimension(812, 390));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid);
        txtid.setBounds(120, 20, 160, 30);

        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });
        getContentPane().add(txtnom);
        txtnom.setBounds(120, 60, 160, 30);

        txtprenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprenomActionPerformed(evt);
            }
        });
        getContentPane().add(txtprenom);
        txtprenom.setBounds(120, 100, 160, 30);

        jLabel1.setText("Id :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 17, 14);

        jLabel2.setText("nom :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 27, 14);

        jLabel3.setText("prenom :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 110, 43, 14);

        jLabel4.setText("user :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 150, 28, 14);

        jLabel5.setText("password :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 190, 53, 14);

        Tableadmins.setModel(new javax.swing.table.DefaultTableModel(
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
        Tableadmins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableadminsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tableadmins);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 80, 440, 90);

        btnPremier.setText("<<");
        btnPremier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPremierActionPerformed(evt);
            }
        });
        getContentPane().add(btnPremier);
        btnPremier.setBounds(80, 230, 50, 23);

        btnSuivant.setText(">");
        btnSuivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuivantActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuivant);
        btnSuivant.setBounds(200, 230, 50, 23);

        btnPrecedent.setText("<");
        btnPrecedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecedentActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrecedent);
        btnPrecedent.setBounds(140, 230, 50, 23);

        btnDernier.setText(">>");
        btnDernier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDernierActionPerformed(evt);
            }
        });
        getContentPane().add(btnDernier);
        btnDernier.setBounds(260, 230, 50, 23);

        btnAjouter.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Button-Add-icon.png")); // NOI18N
        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });
        getContentPane().add(btnAjouter);
        btnAjouter.setBounds(369, 20, 110, 30);

        btnModifier.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Document-icon.png")); // NOI18N
        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });
        getContentPane().add(btnModifier);
        btnModifier.setBounds(511, 20, 120, 30);

        btnSupprimer.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Misc-Delete-Database-icon.png")); // NOI18N
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });
        getContentPane().add(btnSupprimer);
        btnSupprimer.setBounds(650, 20, 114, 30);

        btnRechercher.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Zoom-icon.png")); // NOI18N
        btnRechercher.setText("Rechercher");
        btnRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercherActionPerformed(evt);
            }
        });
        getContentPane().add(btnRechercher);
        btnRechercher.setBounds(430, 180, 130, 30);

        btnAfficher.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Dell-Display-icon.png")); // NOI18N
        btnAfficher.setText("Afficher");
        btnAfficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfficherActionPerformed(evt);
            }
        });
        getContentPane().add(btnAfficher);
        btnAfficher.setBounds(600, 180, 140, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("id");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(440, 230, 33, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("nom");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(440, 260, 50, 23);
        getContentPane().add(txtRecherhcer);
        txtRecherhcer.setBounds(500, 240, 140, 30);

        jLabel6.setText("Recherhcer par :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(350, 240, 100, 14);

        jToggleButton1.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Admin-icon.png")); // NOI18N
        jToggleButton1.setText("Gestion machines");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(329, 289, 173, 32);
        getContentPane().add(txtus);
        txtus.setBounds(120, 140, 160, 30);
        getContentPane().add(txtpass);
        txtpass.setBounds(120, 180, 160, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Sans titre-2.jpg")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 812, 366);

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 255));

        jMenu1.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Earth-Security-icon.png")); // NOI18N
        jMenu1.setText("Network Security");

        jMenu3.setIcon(new javax.swing.ImageIcon("D:\\PFE\\next-icon.png")); // NOI18N
        jMenu3.setText("Acceder à");

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
//          Load FormStagiaire
private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    try{
        // connexion avec base de donnée 
         Class.forName("com.mysql.jdbc.Driver") ;
       
         cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/tunisietelecom","root","");
        St = cnx.createStatement();
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        jRadioButton1.setSelected(true);

        dt = new DefaultTableModel();
        dt.addColumn("id");
        dt.addColumn("nom");
        dt.addColumn("prenom");
        dt.addColumn("user");
        dt.addColumn("password");
        Tableadmins.setModel(dt);
        // afficehr la liste des admins
        AfficherAdmins();
        // remplir les champs 
        i = 0;
        DeplacerAdmins(i);
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur de connexion\n"+e.getMessage());
    }
}//GEN-LAST:event_formWindowOpened

//          PREMIER
private void btnPremierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPremierActionPerformed
    try{
        i = 0;
        DeplacerAdmins(i);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur premier !\n"+e.getMessage());
    }
}//GEN-LAST:event_btnPremierActionPerformed
//          PRECEDENT
private void btnPrecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecedentActionPerformed
    try{
        i--;
        DeplacerAdmins(i);
        // ou DeplacerAdmins(--i);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur premier !\n"+e.getMessage());
    }
}//GEN-LAST:event_btnPrecedentActionPerformed
//          SUIVANT
private void btnSuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuivantActionPerformed
    try{
        i++;
        DeplacerAdmins(i);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur premier !\n"+e.getMessage());
    }
}//GEN-LAST:event_btnSuivantActionPerformed
//          DERNIER
private void btnDernierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDernierActionPerformed
    try{
        i = dt.getRowCount() - 1 ;
        DeplacerAdmins(i);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur premier !\n"+e.getMessage());
    }
}//GEN-LAST:event_btnDernierActionPerformed
//          selectionnéé admin
private void TableadminsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableadminsMouseClicked
    try{
        i = Tableadmins.getSelectedRow();
        DeplacerAdmins(i);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur selectionnéé admin\n"+e.getMessage());
    }
}//GEN-LAST:event_TableadminsMouseClicked

//          Ajouter admin
private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
    try{
        // verifier si deja exist
        boolean b = false;
        for(int j=0; j < dt.getRowCount() ;j++){
            if(Integer.parseInt(txtid.getText()) == dt.getValueAt(j, 0)){
                b = true;
                break;
            }
        }
        String id = txtid.getText();
        String nom = txtnom.getText();
        String prenom = txtprenom.getText();
        String user = txtus.getText();
        String password = txtpass.getText();
        if(b == false){
         
            String SQL = "INSERT INTO employer(id,nom,prenom,user,password) VALUES('" +id+ "','"+nom+"','"+prenom+"','"+user+"','" +password+ "')";
            St.executeUpdate(SQL);
            AfficherAdmins(); // recharger la liste des admins
            JOptionPane.showMessageDialog(null, "Admin est ajouté");
        }else{
            JOptionPane.showMessageDialog(null, " Déja existe !");
            txtid.setText("");
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur ajouter admin\n"+e.getMessage());
    }
}//GEN-LAST:event_btnAjouterActionPerformed
//          MODIFIER admin
private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
    try{ 
        String prenom = txtprenom.getText();
        String user = txtus.getText();
        String nom = txtnom.getText();
        String password = txtpass.getText();
        String id = txtid.getText();
        // msg d confirmation !
        if (JOptionPane.showConfirmDialog(null, "confirmer la modification","modification",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION){
            St.executeUpdate("UPDATE employer SET nom='"+nom+"',prenom='"+prenom+"',user='"+user+"',password='"+password+"' WHERE id = '"+id+"'");                                
            AfficherAdmins(); // recharger la liste des Admins
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur modifier admin\n"+e.getMessage());
    }
}//GEN-LAST:event_btnModifierActionPerformed
//          supprimer admin
private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
    try{
        if(JOptionPane.showConfirmDialog(null, "Confirmer la suppression","Supprimer admin",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION){
            if(txtid.getText().length() != 0){
                St.executeUpdate("Delete from employer where id = "+ txtid.getText());
                AfficherAdmins(); // recharger la liste des stagiaires ...
            }else{
                JOptionPane.showMessageDialog(null, "veuillez remplir champ matricule !");
            }
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur supprimer admin !\n"+e.getMessage());
    }
}//GEN-LAST:event_btnSupprimerActionPerformed
//          afficher admin
private void btnAfficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfficherActionPerformed
    try{
        AfficherAdmins();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur btn afficher admin !\n"+e.getMessage());
    }
}//GEN-LAST:event_btnAfficherActionPerformed
//          rechercher stg
private void btnRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercherActionPerformed
    try{
        dt.setRowCount(0); // vider la liste des admins
        if(jRadioButton1.isSelected()){ // radioboutton 'id'
            Rs = St.executeQuery("Select * From employer WHERE id = "+txtRecherhcer.getText());
        }else{
            Rs = St.executeQuery("Select * From employer WHERE nom = '"+txtRecherhcer.getText()+"'");
        }
        while(Rs.next()){
            id = Rs.getInt("id"); // la même chose
            nom = Rs.getString(2);
            prenom = Rs.getString(3);
            user = Rs.getString(4);
            password = Rs.getString(5);
            Object[] employer = {id,nom,prenom,user,password};
            dt.addRow(employer);
        }
        if (dt.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Aucun admin");
            AfficherAdmins(); // afficehr tout les admins
        }else{
            i = 0;
            DeplacerAdmins(i);
        }
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur btn rechercher admin !\n"+e.getMessage());
    }
}//GEN-LAST:event_btnRechercherActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    private void txtprenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprenomActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
             close();
            FormMachines p = new FormMachines();
            p.setVisible(true); 
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            Historique h = new Historique();
            h.setVisible(true); 
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Apropos ap = new Apropos();
            ap.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
//          procedure qui rempli les champs ...
private void DeplacerAdmins(int i){
    try{
        if (dt.getRowCount() == 0){
            btnPrecedent.setEnabled(false);
            btnSuivant.setEnabled(false);
            txtid.setText("");
            txtnom.setText("");
            txtprenom.setText("");
            txtus.setText("");
            txtpass.setText("");
        }else{
            if(i == 0){
                btnPrecedent.setEnabled(false);
                btnSuivant.setEnabled(true);
            }else if (i == dt.getRowCount()-1){ // dernier enregistrement
                btnPrecedent.setEnabled(true);
            btnSuivant.setEnabled(false);
            }else{
                btnPrecedent.setEnabled(true);
                btnSuivant.setEnabled(true);
            }
            if(dt.getRowCount() == 1){
                btnPrecedent.setEnabled(false);
                btnSuivant.setEnabled(false);
            }
        }
        txtid.setText(dt.getValueAt(i, 0).toString()); // i represente numero d ligne ,et 0 1 .. colonne
        txtnom.setText(dt.getValueAt(i, 1).toString());
        txtprenom.setText(dt.getValueAt(i, 2).toString());
        txtus.setText(dt.getValueAt(i, 3).toString());
        txtpass.setText(dt.getValueAt(i, 4).toString());
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur deplacement admin\n"+e.getMessage());
    }
}
//          procedure qui Afficher la liste des admins.
private void AfficherAdmins(){
    try{
        dt.setRowCount(0); // vider la list des admins.
        Rs = St.executeQuery("Select * From employer");
        
        while(Rs.next()){
            id = Rs.getInt("id");
            nom = Rs.getString("nom");
            prenom = Rs.getString("prenom");
            user = Rs.getString("user");
            password = Rs.getString("password");
            Object[] employer = {id,nom,prenom,user,password};
            dt.addRow(employer);
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur afficher la liste des admins\n"+e.getMessage());
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
            java.util.logging.Logger.getLogger(FormAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FormAdmins().setVisible(true);
            }
        });
    }
    
    // Déclaration des variables.
    private Connection cnx;
    private Statement St;
    private ResultSet Rs;
    private DefaultTableModel dt;
    private int id;
    private String nom ,prenom,user,password;
    private int i; // indice de déplacement
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tableadmins;
    private javax.swing.JButton btnAfficher;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnDernier;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnPrecedent;
    private javax.swing.JButton btnPremier;
    private javax.swing.JButton btnRechercher;
    private javax.swing.JButton btnSuivant;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtRecherhcer;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtprenom;
    private javax.swing.JTextField txtus;
    // End of variables declaration//GEN-END:variables
}
