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
public class tabel_check_in extends javax.swing.JInternalFrame {
String data[] = new String [4];
    /**
     * Creates new form tabel_check_in
     */
    public tabel_check_in() {
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
            String strSQL="SELECT id_ktp,id_kamar,tanggal_check_in,harga_sewa FROM tabel_check_in";
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtktp = new javax.swing.JTextField();
        txtkamar = new javax.swing.JTextField();
        txtin = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmaster = new javax.swing.JTable();
        btnsimpan = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnbaru = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("id ktp");

        jLabel2.setText("id kamar");

        jLabel3.setText("tanggal check in");

        jLabel5.setText("harga sewa");

        tblmaster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id_ktp", "id_kamar", "tanggal_check_in", "harga_sewa"
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

        btnhapus.setText("hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("CHECK IN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnbaru)
                                .addGap(18, 18, 18)
                                .addComponent(btnsimpan))
                            .addComponent(jLabel5))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtin, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtkamar, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtktp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                    .addComponent(btnubah)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnhapus)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnkeluar)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtktp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtkamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnubah)
                    .addComponent(btnhapus)
                    .addComponent(btnkeluar)
                    .addComponent(btnbaru))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbaruActionPerformed
        // TODO add your handling code here:
         txtktp.setText("");
        txtkamar.setText("");
        txtin.setText("");
        txtharga.setText("");
    }
    private javax.swing.table.DefaultTableModel tblModel = getDefaultTabelModel();
    
    private javax.swing.table.DefaultTableModel getDefaultTabelModel() {
        return new javax.swing.table.DefaultTableModel(
        new Object[][] {},
        new String[] {"id_ktp","id_kamar","tanggal_check_in","harga_sewa"}
         ){
            boolean[] canEdit=new boolean[]{
                false,false,false
            };

            public boolean isiCellEditable(int rowIndex,int columnIndex){
                    return canEdit[columnIndex];

            }

        };
   
        
    }//GEN-LAST:event_btnbaruActionPerformed

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

            String strSQL="INSERT INTO tabel_check_in(id_ktp,id_kamar,tanggal_check_in,harga_sewa) values('"+txtktp.getText()+"','"+txtkamar.getText()+"','"+txtin.getText()+"','"+txtharga.getText()+"')";
            
            st.executeUpdate(strSQL);

            data[0]=txtktp.getText();
            data[1]=txtkamar.getText();
            data[2]=txtin.getText();
            data[3]=txtharga.getText();
            tblModel.insertRow(0, data);

            txtktp.setText("");
            txtkamar.setText("");
            txtin.setText("");
            txtharga.setText("");

            st.close();
            koneksi.close();
        }catch(ClassNotFoundException cnfe){
            System.out.println("KESALAHAN SAAT"+"ME-LOAD DRIVER JDBC \n"+cnfe.getMessage());
        }catch(SQLException sqle){
            System.out.println("KESALAHAN SAAT KONEKSI ATAU "+"KESALAHAN QUERY SQL \n"+sqle.getMessage());
        }
         
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
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

            String strSQL = "UPDATE tabel_check_in SET id_ktp='"+txtktp.getText()+"',id_kamar='"+txtkamar.getText()+"', tanggal_check_in='"+txtin.getText()+"',harga_sewa='"+txtharga.getText()+"' where id_ktp='"+txtktp.getText()+"'" ;
            st.executeUpdate(strSQL);

            data[0]=txtktp.getText();
            data[1]=txtkamar.getText();
            data[2]=txtin.getText();
            data[3]=txtharga.getText();
            tblModel.removeRow(row);
            tblModel.insertRow(row, data);

            txtktp.setText("");
            txtkamar.setText("");
            txtin.setText("");
            txtharga.setText("");

            st.close();
            koneksi.close();
        }catch(ClassNotFoundException cnfe){
            System.out.println("KESALAHAN SAAT"+"ME-LOAD DRIVER JDBC \n"+cnfe.getMessage());
        }catch(SQLException sqle){
            System.out.println("KESALAHAN SAAT KONEKSI ATAU "+"KESALAHAN QUERY SQL \n"+sqle.getMessage());
        }
//    }                                         
//
//    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
//        // TODO add your handling code here:
//        try{
//            Class.forName ("com.mysql.jdbc.Driver");
//
//            // MENYIAPKAN KONEKSI DAN PARAMETERNYA
//            String urldb="jdbc:mysql://localhost:3306/tp_perpustakaan";
//            String user="root";
//            String password="";
//            Connection koneksi=DriverManager.getConnection(urldb,user,password);
//            //Query SQL dan Eksekuusinya
//
//            Statement st = koneksi.createStatement();
//
//            String strSQL="delete from t where jurusanoid='"+txtktp.getText()+"'";
//            st.executeUpdate(strSQL);
//            tblModel.removeRow(row);
//
//            txtktp.setText("");
//            txtkamar.setText("");
//            txtin.setText("");
//            txtout.setText("");
//            txtharga.setText("");
//            
//            st.close();
//            koneksi.close();
//        }catch(ClassNotFoundException cnfe){
//            System.out.println("KESALAHAN SAAT"+"ME-LOAD DRIVER JDBC \n"+cnfe.getMessage());
//        }catch(SQLException sqle){
//            System.out.println("KESALAHAN SAAT KONEKSI ATAU "+"KESALAHAN QUERY SQL \n"+sqle.getMessage());
//        }
    }//GEN-LAST:event_btnubahActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
            this.dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void tblmasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmasterMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==1){
            Tampil();
        }
    }//GEN-LAST:event_tblmasterMouseClicked

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
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

            String strSQL="delete from tabel_check_in where id_ktp='"+txtktp.getText()+"'";
            st.executeUpdate(strSQL);
            tblModel.removeRow(row);

            txtktp.setText("");
            txtkamar.setText("");
            txtin.setText("");
            txtharga.setText("");

            st.close();
            koneksi.close();
        }catch(ClassNotFoundException cnfe){
            System.out.println("KESALAHAN SAAT"+"ME-LOAD DRIVER JDBC \n"+cnfe.getMessage());
        }catch(SQLException sqle){
            System.out.println("KESALAHAN SAAT KONEKSI ATAU "+"KESALAHAN QUERY SQL \n"+sqle.getMessage());
        }
    }//GEN-LAST:event_btnhapusActionPerformed
int row=0;
    public void Tampil(){
        row=tblmaster.getSelectedRow();
        txtktp.setText(tblModel.getValueAt(row, 0).toString());
        txtkamar.setText(tblModel.getValueAt(row, 1).toString());
        txtin.setText(tblModel.getValueAt(row, 2).toString());
        txtharga.setText(tblModel.getValueAt(row, 4).toString());
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
            java.util.logging.Logger.getLogger(tabel_check_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabel_check_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabel_check_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabel_check_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new tabel_check_in().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbaru;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblmaster;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtin;
    private javax.swing.JTextField txtkamar;
    private javax.swing.JTextField txtktp;
    // End of variables declaration//GEN-END:variables
}
