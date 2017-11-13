package securst;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
 import  java.sql.*;
 import java.sql.DriverManager;
import  java.sql.Statement;
import  java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormMachines extends javax.swing.JFrame {

    public FormMachines() {
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
        txtip = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tableamachines = new javax.swing.JTable();
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
        txdes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
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
        setMinimumSize(new java.awt.Dimension(861, 390));
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
        txtid.setBounds(110, 40, 130, 30);

        txtip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtipActionPerformed(evt);
            }
        });
        getContentPane().add(txtip);
        txtip.setBounds(110, 90, 130, 30);

        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });
        getContentPane().add(txtnom);
        txtnom.setBounds(110, 130, 130, 30);

        jLabel1.setText("ID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 50, 18, 14);

        jLabel2.setText("Nom machine :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 140, 70, 14);

        jLabel3.setText("IP :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 17, 14);

        jLabel4.setText("Description :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 180, 60, 14);

        Tableamachines.setModel(new javax.swing.table.DefaultTableModel(
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
        Tableamachines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableamachinesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tableamachines);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(400, 80, 440, 91);

        btnPremier.setText("<<");
        btnPremier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPremierActionPerformed(evt);
            }
        });
        getContentPane().add(btnPremier);
        btnPremier.setBounds(50, 220, 50, 23);

        btnSuivant.setText(">");
        btnSuivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuivantActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuivant);
        btnSuivant.setBounds(170, 220, 50, 23);

        btnPrecedent.setText("<");
        btnPrecedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecedentActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrecedent);
        btnPrecedent.setBounds(110, 220, 50, 23);

        btnDernier.setText(">>");
        btnDernier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDernierActionPerformed(evt);
            }
        });
        getContentPane().add(btnDernier);
        btnDernier.setBounds(230, 220, 50, 23);

        btnAjouter.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Button-Add-icon.png")); // NOI18N
        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });
        getContentPane().add(btnAjouter);
        btnAjouter.setBounds(410, 20, 121, 30);

        btnModifier.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Document-icon.png")); // NOI18N
        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });
        getContentPane().add(btnModifier);
        btnModifier.setBounds(560, 20, 134, 30);

        btnSupprimer.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Misc-Delete-Database-icon.png")); // NOI18N
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });
        getContentPane().add(btnSupprimer);
        btnSupprimer.setBounds(710, 20, 130, 30);

        btnRechercher.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Zoom-icon.png")); // NOI18N
        btnRechercher.setText("Rechercher");
        btnRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercherActionPerformed(evt);
            }
        });
        getContentPane().add(btnRechercher);
        btnRechercher.setBounds(470, 190, 151, 30);

        btnAfficher.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Dell-Display-icon.png")); // NOI18N
        btnAfficher.setText("Afficher");
        btnAfficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfficherActionPerformed(evt);
            }
        });
        getContentPane().add(btnAfficher);
        btnAfficher.setBounds(650, 190, 151, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("id");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(440, 230, 33, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("nom");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(440, 250, 50, 23);
        getContentPane().add(txtRecherhcer);
        txtRecherhcer.setBounds(500, 240, 140, 30);

        jLabel6.setText("Recherhcer par :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 230, 100, 14);

        jToggleButton1.setIcon(new javax.swing.ImageIcon("D:\\PFE\\network-icon.png")); // NOI18N
        jToggleButton1.setText("Tester réseau");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(560, 290, 155, 32);
        getContentPane().add(txdes);
        txdes.setBounds(110, 170, 130, 30);

        jLabel7.setText("IP Ex : ( 192.168.126.158)");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 70, 130, 14);

        jToggleButton2.setIcon(new javax.swing.ImageIcon("D:\\PFE\\go-back-icon.png")); // NOI18N
        jToggleButton2.setText("Retour");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(110, 290, 150, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\PFE\\Sans titre-4.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 860, 330);

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 255));

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
//          Load FormMachines
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
        dt.addColumn("ip");
        dt.addColumn("nom");
        dt.addColumn("description");
        
        Tableamachines.setModel(dt);
        // afficehr la liste des machines
        AfficherMachine();
        // remplir les champs 
        i = 0;
        DeplacerMachine(i);
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur de connexion\n"+e.getMessage());
    }
}//GEN-LAST:event_formWindowOpened

//          PREMIER
private void btnPremierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPremierActionPerformed
    try{
        i = 0;
        DeplacerMachine(i);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur premier !\n"+e.getMessage());
    }
}//GEN-LAST:event_btnPremierActionPerformed
//          PRECEDENT
private void btnPrecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecedentActionPerformed
    try{
        i--;
        DeplacerMachine(i);
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur premier !\n"+e.getMessage());
    }
}//GEN-LAST:event_btnPrecedentActionPerformed
//          SUIVANT
private void btnSuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuivantActionPerformed
    try{
        i++;
        DeplacerMachine(i);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur premier !\n"+e.getMessage());
    }
}//GEN-LAST:event_btnSuivantActionPerformed
//          DERNIER
private void btnDernierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDernierActionPerformed
    try{
        i = dt.getRowCount() - 1 ;
        DeplacerMachine(i);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur premier !\n"+e.getMessage());
    }
}//GEN-LAST:event_btnDernierActionPerformed
//          selectionnéé machine
private void TableamachinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableamachinesMouseClicked
    try{
        i = Tableamachines.getSelectedRow();
        DeplacerMachine(i);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur selectionnéé admin\n"+e.getMessage());
    }
}//GEN-LAST:event_TableamachinesMouseClicked

//          Ajouter machine
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
        String ip = txtip.getText();
        String nom = txtnom.getText();
        String description = txdes.getText();
        
        if(b == false){
         
            String SQL = "INSERT INTO machines(id,ip,nom,description) VALUES('" +id+ "','"+ip+"','"+nom+"','"+description+"')";
            St.executeUpdate(SQL);
            AfficherMachine(); // recharger la liste des admins
            JOptionPane.showMessageDialog(null, "machine est ajouté");
        }else{
            JOptionPane.showMessageDialog(null, " Déja existe !");
            txtid.setText("");
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur ajouter admin\n"+e.getMessage());
    }
}//GEN-LAST:event_btnAjouterActionPerformed
//          MODIFIER machines
private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
    try{ 
        // msg d confirmation !
         String id = txtid.getText();
        String ip = txtip.getText();
        String nom = txtnom.getText();
        String description = txdes.getText();
        if (JOptionPane.showConfirmDialog(null, "confirmer la modification","modification",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION){
            St.executeUpdate("UPDATE machines SET ip='"+ip+"',nom='"+nom+"',description='"+description+"' WHERE id = '"+id+"'");                                
            AfficherMachine(); // recharger la liste des machines
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur modifier machine\n"+e.getMessage());
    }
}//GEN-LAST:event_btnModifierActionPerformed
//          supprimer machines
private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
    try{
        if(JOptionPane.showConfirmDialog(null, "Confirmer la suppression","Supprimer machine",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION){
            if(txtid.getText().length() != 0){
                St.executeUpdate("Delete from machines where id = "+ txtid.getText());
                AfficherMachine(); // recharger la liste des machines ...
            }else{
                JOptionPane.showMessageDialog(null, "veuillez remplir champ !");
            }
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur supprimer admin !\n"+e.getMessage());
    }
}//GEN-LAST:event_btnSupprimerActionPerformed
//          afficher admin
private void btnAfficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfficherActionPerformed
    try{
        AfficherMachine();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur btn afficher machines !\n"+e.getMessage());
    }
}//GEN-LAST:event_btnAfficherActionPerformed
//          rechercher stg
private void btnRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercherActionPerformed
    try{
        dt.setRowCount(0); // vider la liste des admins
        if(jRadioButton1.isSelected()){ // radioboutton 'id'
            Rs = St.executeQuery("Select * From machines WHERE id = "+txtRecherhcer.getText());
        }else{
            Rs = St.executeQuery("Select * From machines WHERE nom = '"+txtRecherhcer.getText()+"'");
        }
        while(Rs.next()){
            id = Rs.getInt("id"); // la même chose
            ip = Rs.getString(2);
            nom = Rs.getString(3);
            description = Rs.getString(4);
            
            Object[] employer = {id,ip,nom,description};
            dt.addRow(employer);
        }
        if (dt.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Aucun machine");
            AfficherMachine(); // afficehr tout les machines
        }else{
            i = 0;
            DeplacerMachine(i);
        }
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur btn rechercher machines !\n"+e.getMessage());
    }
}//GEN-LAST:event_btnRechercherActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtipActionPerformed

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
             close();
            Ping1 p = new Ping1();
            p.setVisible(true); 
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            Ping1 p = new Ping1();
            p.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       close();
            Historique h = new  Historique();
            h.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        close();
            FormAdmins de = new FormAdmins();
            de.setVisible(true); 
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Apropos ap = new Apropos();
        ap.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
//          procedure qui rempli les champs ...
private void DeplacerMachine(int i){
    try{
        if (dt.getRowCount() == 0){
            btnPrecedent.setEnabled(false);
            btnSuivant.setEnabled(false);
            txtid.setText("");
            txtip.setText("");
            txtnom.setText("");
            txdes.setText("");
           
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
        txtip.setText(dt.getValueAt(i, 1).toString());
        txtnom.setText(dt.getValueAt(i, 2).toString());
        txdes.setText(dt.getValueAt(i, 3).toString());
       
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur deplacement machine\n"+e.getMessage());
    }
}
//          procedure qui Afficher la liste des machines.
private void AfficherMachine(){
    try{
        dt.setRowCount(0); // vider la list des admins.
        Rs = St.executeQuery("Select * From machines");
        
        while(Rs.next()){
            id = Rs.getInt("id");
            nom = Rs.getString("nom");
            ip = Rs.getString("ip");
            description = Rs.getString("description");
            
            Object[] employer = {id,ip,nom,description};
            dt.addRow(employer);
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur afficher la liste des machines\n"+e.getMessage());
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
            java.util.logging.Logger.getLogger(FormMachines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMachines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMachines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMachines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FormMachines().setVisible(true);
            }
        });
    }
    
    // Déclaration des variables.
    private Connection cnx;
    private Statement St;
    private ResultSet Rs;
    private DefaultTableModel dt;
    private int id;
    private String nom ,ip,description;
    private int i; // indice de déplacement
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tableamachines;
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
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField txdes;
    private javax.swing.JTextField txtRecherhcer;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtip;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
}
