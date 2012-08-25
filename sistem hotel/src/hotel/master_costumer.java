/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.*;

/**
 *
 * @author chipto
 */
public class master_costumer extends javax.swing.JInternalFrame {

    /**
     * Creates new form master_costumer
     */
    String data[] = new String [4];
    public master_costumer() {
        initComponents();
        tblmaster.setModel(tblModel);
         setDefaultTable(); 
    }
    public void setDefaultTable(){
 
        try{
            Class.forName ("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb="jdbc:mysql://localhost:3306/hotel";
            String user="root";
            String password="";
            Connection koneksi=DriverManager.getConnection(urldb,user,password);
            //Query SQL dan Eksekuusinya
            String strSQL="SELECT id_ktp,nama,alamat,jenis_kelamin FROM master_costumer";
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(strSQL);

            while(rs.next()){
                data[0]=rs.getString(1);
                data[1]=rs.getString(2);
                data[2]=rs.getString(3);
                data[3]=rs.getString(4);
                
                tblModel.addRow(data);
            }

            rs.close();
            st.close();
            koneksi.close();
        }catch(ClassNotFoundException cnfe){
            System.out.println("KESALAHAN SAAT"+"ME-LOAD DRIVER JDBC \n"+cnfe.getMessage());
        }catch(SQLException sqle){
            System.out.println("KESALAHAN SAAT KONEKSI ATAU "+"KESALAHAN QUERY SQL \n"+sqle.getMessage());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmaster = new javax.swing.JTable();
        btnsimpan = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        rbtnlaki = new javax.swing.JRadioButton();
        rbtnperempuan = new javax.swing.JRadioButton();
        btnbaru = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("id ktp");

        jLabel2.setText("nama");

        jLabel3.setText("alamat");

        jLabel4.setText("jenis_kelamin");

        tblmaster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id_ktp", "nama", "alamat", "jenis_kelamin"
            }
        ));
        tblmaster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmasterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblmaster);

        btnsimpan.setText("simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnubah.setText("ubah");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });

        jButton3.setText("hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnlaki);
        rbtnlaki.setText("laki-laki");

        buttonGroup1.add(rbtnperempuan);
        rbtnperempuan.setSelected(true);
        rbtnperempuan.setText("perempuan");

        btnbaru.setText("baru");
        btnbaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbaruActionPerformed(evt);
            }
        });

        btnkeluar.setText("keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("DATA PEMESAN");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(txtnama))
                                .addGap(185, 185, 185))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(rbtnlaki)
                                        .addGap(43, 43, 43)
                                        .addComponent(rbtnperempuan)))
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnbaru)
                        .addGap(18, 18, 18)
                        .addComponent(btnsimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnubah)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(btnkeluar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbtnlaki)
                    .addComponent(rbtnperempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnubah)
                    .addComponent(jButton3)
                    .addComponent(btnbaru)
                    .addComponent(btnkeluar))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbaruActionPerformed
        txtid.setText(null);
        txtnama.setText(null);
        txtalamat.setText(null);
    }//GEN-LAST:event_btnbaruActionPerformed

    private javax.swing.table.DefaultTableModel tblModel = getDefaultTabelModel();
    
    private javax.swing.table.DefaultTableModel getDefaultTabelModel() {
        return new javax.swing.table.DefaultTableModel(
        new Object[][] {},
        new String[] {"id_ktp","nama","alamat","jenis_kelamin"}
         ){
            boolean[] canEdit=new boolean[]{
                false,false,false
            };

            public boolean isiCellEditable(int rowIndex,int columnIndex){
                    return canEdit[columnIndex];

            }

        };
   }
    
    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName ("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb="jdbc:mysql://localhost:3306/hotel";
            String user="root";
            String password="";
            Connection koneksi=DriverManager.getConnection(urldb,user,password);
            //Query SQL dan Eksekuusinya

            Statement st = koneksi.createStatement();

            String jnsKelamin;
            if (rbtnlaki.isSelected()) {
                jnsKelamin = "laki-laki";
            } else {
                jnsKelamin = "perempuan";
            }
            
            String strSQL="INSERT INTO master_costumer(id_ktp,nama,alamat,jenis_kelamin) values('"+txtid.getText()+"','"+txtnama.getText()+"','"+txtalamat.getText()+"','"+jnsKelamin+"')";
            st.executeUpdate(strSQL);

            data[0]=txtid.getText();
            data[1]=txtnama.getText();
            data[2]=txtalamat.getText();
            data[3]=jnsKelamin;
            tblModel.insertRow(0, data);

            txtid.setText("");
            txtnama.setText("");
            txtalamat.setText("");

            st.close();
            koneksi.close();
        }catch(ClassNotFoundException cnfe){
            System.out.println("KESALAHAN SAAT"+"ME-LOAD DRIVER JDBC \n"+cnfe.getMessage());
        }catch(SQLException sqle){
            System.out.println("KESALAHAN SAAT KONEKSI ATAU "+"KESALAHAN QUERY SQL \n"+sqle.getMessage());
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void tblmasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmasterMouseClicked
        if(evt.getClickCount()==1){
            Tampil();
        }
    }//GEN-LAST:event_tblmasterMouseClicked

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        try{
            Class.forName ("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb="jdbc:mysql://localhost:3306/hotel";
            String user="root";
            String password="";
            Connection koneksi=DriverManager.getConnection(urldb,user,password);
            //Query SQL dan Eksekuusinya

            Statement st = koneksi.createStatement();
            
             String jnsKelamin;
            if (rbtnlaki.isSelected()) {
                jnsKelamin = "laki-laki";
            } else {
                jnsKelamin = "perempuan";
            }

            String strSQL="update master_costumer set id_ktp='"+txtid.getText()+"',nama='"+txtnama.getText()+"', alamat='"+txtalamat.getText()+"', jenis_kelamin='"+jnsKelamin+"' where id_ktp='"+txtid.getText()+"'";
            st.executeUpdate(strSQL);

            data[0]=txtid.getText();
            data[1]=txtnama.getText();
            data[2]=txtalamat.getText();
            data[3]=jnsKelamin;
            tblModel.removeRow(row);
            tblModel.insertRow(row, data);

            txtid.setText("");
            txtnama.setText("");
            txtalamat.setText("");
            
            st.close();
            koneksi.close();
        }catch(ClassNotFoundException cnfe){
            System.out.println("KESALAHAN SAAT"+"ME-LOAD DRIVER JDBC \n"+cnfe.getMessage());
        }catch(SQLException sqle){
            System.out.println("KESALAHAN SAAT KONEKSI ATAU "+"KESALAHAN QUERY SQL \n"+sqle.getMessage());
        }
    }//GEN-LAST:event_btnubahActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.mysql.jdbc.Driver");

            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
            String urldb="jdbc:mysql://localhost:3306/hotel";
            String user="root";
            String password="";
            Connection koneksi=DriverManager.getConnection(urldb,user,password);
            //Query SQL dan Eksekuusinya

            Statement st = koneksi.createStatement();

            String strSQL="delete from master_costumer where id_ktp='"+txtid.getText()+"'";
            st.executeUpdate(strSQL);
            tblModel.removeRow(row);

            txtid.setText("");
            txtnama.setText("");
            txtalamat.setText("");

            st.close();
            koneksi.close();
        }catch(ClassNotFoundException cnfe){
            System.out.println("KESALAHAN SAAT"+"ME-LOAD DRIVER JDBC \n"+cnfe.getMessage());
        }catch(SQLException sqle){
            System.out.println("KESALAHAN SAAT KONEKSI ATAU "+"KESALAHAN QUERY SQL \n"+sqle.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
          this.dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed
int row=0;
    public void Tampil(){
        row=tblmaster.getSelectedRow();
        txtid.setText(tblModel.getValueAt(row, 0).toString());
        txtnama.setText(tblModel.getValueAt(row, 1).toString());
        txtalamat.setText(tblModel.getValueAt(row, 2).toString());
        if(tblModel.getValueAt(row, 3).toString().equals("Laki-laki")){
            rbtnlaki.setSelected(true);
        }else{
            rbtnperempuan.setSelected(true);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(master_costumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(master_costumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(master_costumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(master_costumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new master_costumer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbaru;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnlaki;
    private javax.swing.JRadioButton rbtnperempuan;
    private javax.swing.JTable tblmaster;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
