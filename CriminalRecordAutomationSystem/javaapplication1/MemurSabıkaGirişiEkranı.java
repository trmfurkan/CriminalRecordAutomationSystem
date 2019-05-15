/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Toolkit;

/**
 *
 * @author Ali Asaf
 */
public class MemurSabıkaGirişiEkranı extends javax.swing.JFrame {
public String gelenTc;
Color old;
    /**
     * Creates new form MemurSabıkaGirişiEkranı
     */
    public MemurSabıkaGirişiEkranı() {
        initComponents();
        setIcon();
        this.setLocationRelativeTo(null);
    }
    
     private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconResmi.png"))); //To change body of generated methods, choose Tools | Templates.
    }
    
    public MemurSabıkaGirişiEkranı(Insan insan){
        initComponents();
        setIcon();
        this.setLocationRelativeTo(null);
        EnterCinsiyet.setText(insan.Cinsiyet);
        EnterAnneAdı.setText(insan.AnneAdı);
        EnterBabaAdı.setText(insan.BabaAdı);
        EnterDoğumYeri.setText(insan.DoğumYeri);
        EnterDoğumTarihi.setText(insan.DoğumTarih);
        EnterSoyİsim.setText(insan.Soyİsim);
        Enterİsim.setText(insan.İsim);
        EnterTc.setText(insan.TcNo);
        gelenTc=insan.TcNo;
    
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSabıkaGiriş = new javax.swing.JPanel();
        lblSabıkaKaydıYazısı = new javax.swing.JLabel();
        lblİsim = new javax.swing.JLabel();
        lblSoyisimYazısı = new javax.swing.JLabel();
        lblTcNoYazısı = new javax.swing.JLabel();
        lblCinsiyetYazısı = new javax.swing.JLabel();
        Enterİsim = new javax.swing.JLabel();
        EnterSoyİsim = new javax.swing.JLabel();
        EnterTc = new javax.swing.JLabel();
        EnterCinsiyet = new javax.swing.JLabel();
        lblAnneAdıYazısı = new javax.swing.JLabel();
        lblBabaAdıYazısı = new javax.swing.JLabel();
        lblDoğumTarihiYazısı = new javax.swing.JLabel();
        lblDoğumYeriYazısı = new javax.swing.JLabel();
        EnterAnneAdı = new javax.swing.JLabel();
        EnterBabaAdı = new javax.swing.JLabel();
        EnterDoğumTarihi = new javax.swing.JLabel();
        EnterDoğumYeri = new javax.swing.JLabel();
        lblİşlenenSuçYazısı = new javax.swing.JLabel();
        EnterİşlenenSuç = new javax.swing.JTextField();
        lblSuçunişlendiğiTarihYazısı = new javax.swing.JLabel();
        EnterSuçTarihi = new javax.swing.JTextField();
        btnEkle = new javax.swing.JButton();
        btnÇıkış = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelSabıkaGiriş.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        lblSabıkaKaydıYazısı.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblSabıkaKaydıYazısı.setForeground(new java.awt.Color(51, 102, 255));
        lblSabıkaKaydıYazısı.setText("Sabıka Kaydı Girişi");

        lblİsim.setForeground(new java.awt.Color(51, 51, 255));
        lblİsim.setText("İsim :");

        lblSoyisimYazısı.setForeground(new java.awt.Color(51, 51, 255));
        lblSoyisimYazısı.setText("Soyisim :");

        lblTcNoYazısı.setForeground(new java.awt.Color(51, 51, 255));
        lblTcNoYazısı.setText("Tc No :");

        lblCinsiyetYazısı.setForeground(new java.awt.Color(51, 51, 255));
        lblCinsiyetYazısı.setText("Cinsiyet :");

        lblAnneAdıYazısı.setForeground(new java.awt.Color(51, 51, 255));
        lblAnneAdıYazısı.setText("Anne Adı :");

        lblBabaAdıYazısı.setForeground(new java.awt.Color(51, 51, 255));
        lblBabaAdıYazısı.setText("Baba Adı :");

        lblDoğumTarihiYazısı.setForeground(new java.awt.Color(51, 51, 255));
        lblDoğumTarihiYazısı.setText("Doğum Tarihi :");

        lblDoğumYeriYazısı.setForeground(new java.awt.Color(51, 51, 255));
        lblDoğumYeriYazısı.setText("Doğum Yeri :");

        lblİşlenenSuçYazısı.setForeground(new java.awt.Color(51, 51, 255));
        lblİşlenenSuçYazısı.setText("İşlenen Suç :");

        lblSuçunişlendiğiTarihYazısı.setForeground(new java.awt.Color(51, 51, 255));
        lblSuçunişlendiğiTarihYazısı.setText("Suçun İşlendiği Tarih :");

        btnEkle.setText("Ekle");
        btnEkle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.black));
        btnEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEkleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEkleMouseExited(evt);
            }
        });
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        btnÇıkış.setText("Çıkış");
        btnÇıkış.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.black));
        btnÇıkış.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnÇıkışMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnÇıkışMouseExited(evt);
            }
        });
        btnÇıkış.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÇıkışActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSabıkaGirişLayout = new javax.swing.GroupLayout(panelSabıkaGiriş);
        panelSabıkaGiriş.setLayout(panelSabıkaGirişLayout);
        panelSabıkaGirişLayout.setHorizontalGroup(
            panelSabıkaGirişLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSabıkaGirişLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSabıkaGirişLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSabıkaKaydıYazısı, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addGroup(panelSabıkaGirişLayout.createSequentialGroup()
                        .addGroup(panelSabıkaGirişLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblİsim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSoyisimYazısı, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(lblTcNoYazısı, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCinsiyetYazısı, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelSabıkaGirişLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Enterİsim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EnterSoyİsim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EnterTc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EnterCinsiyet, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelSabıkaGirişLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAnneAdıYazısı, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBabaAdıYazısı, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDoğumTarihiYazısı, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(lblDoğumYeriYazısı, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelSabıkaGirişLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EnterAnneAdı, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EnterBabaAdı, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EnterDoğumTarihi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EnterDoğumYeri, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelSabıkaGirişLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelSabıkaGirişLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSabıkaGirişLayout.createSequentialGroup()
                        .addGroup(panelSabıkaGirişLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblİşlenenSuçYazısı, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnterİşlenenSuç, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(lblSuçunişlendiğiTarihYazısı, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnterSuçTarihi))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelSabıkaGirişLayout.createSequentialGroup()
                        .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnÇıkış, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        panelSabıkaGirişLayout.setVerticalGroup(
            panelSabıkaGirişLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSabıkaGirişLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSabıkaKaydıYazısı, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSabıkaGirişLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblİsim)
                    .addComponent(Enterİsim)
                    .addComponent(lblAnneAdıYazısı)
                    .addComponent(EnterAnneAdı))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSabıkaGirişLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoyisimYazısı)
                    .addComponent(EnterSoyİsim)
                    .addComponent(lblBabaAdıYazısı)
                    .addComponent(EnterBabaAdı))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSabıkaGirişLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTcNoYazısı)
                    .addComponent(EnterTc)
                    .addComponent(lblDoğumTarihiYazısı)
                    .addComponent(EnterDoğumTarihi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSabıkaGirişLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCinsiyetYazısı)
                    .addComponent(EnterCinsiyet)
                    .addComponent(lblDoğumYeriYazısı)
                    .addComponent(EnterDoğumYeri))
                .addGap(27, 27, 27)
                .addComponent(lblİşlenenSuçYazısı)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnterİşlenenSuç, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSuçunişlendiğiTarihYazısı)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnterSuçTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(panelSabıkaGirişLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnÇıkış, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSabıkaGiriş, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSabıkaGiriş, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnÇıkışActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÇıkışActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnÇıkışActionPerformed

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        VeriTabani vt=new VeriTabani();
        if(EnterİşlenenSuç.getText().length()!=0&&EnterSuçTarihi.getText().length()!=0&&vt.sabikaEkle(gelenTc,EnterİşlenenSuç.getText().toString(), EnterSuçTarihi.getText().toString())){
            islemBasarıylaGerçekleşti islem=new islemBasarıylaGerçekleşti();
            islem.setVisible(true);
        }else{
            kisiBulunamadı hata =new kisiBulunamadı();
            hata.setVisible(true);
        }
        
        
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnEkleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEkleMouseEntered
      old=btnEkle.getForeground();
      btnEkle.setForeground(Color.red);// TODO add your handling code here:
    }//GEN-LAST:event_btnEkleMouseEntered

    private void btnEkleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEkleMouseExited
     btnEkle.setForeground(old);   // TODO add your handling code here:
    }//GEN-LAST:event_btnEkleMouseExited

    private void btnÇıkışMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnÇıkışMouseEntered
     old=btnEkle.getForeground();
      btnÇıkış.setForeground(Color.red);   // TODO add your handling code here:
    }//GEN-LAST:event_btnÇıkışMouseEntered

    private void btnÇıkışMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnÇıkışMouseExited
      btnÇıkış.setForeground(old);  // TODO add your handling code here:
    }//GEN-LAST:event_btnÇıkışMouseExited

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
            java.util.logging.Logger.getLogger(MemurSabıkaGirişiEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemurSabıkaGirişiEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemurSabıkaGirişiEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemurSabıkaGirişiEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemurSabıkaGirişiEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EnterAnneAdı;
    private javax.swing.JLabel EnterBabaAdı;
    private javax.swing.JLabel EnterCinsiyet;
    private javax.swing.JLabel EnterDoğumTarihi;
    private javax.swing.JLabel EnterDoğumYeri;
    private javax.swing.JLabel EnterSoyİsim;
    private javax.swing.JTextField EnterSuçTarihi;
    private javax.swing.JLabel EnterTc;
    private javax.swing.JLabel Enterİsim;
    private javax.swing.JTextField EnterİşlenenSuç;
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnÇıkış;
    private javax.swing.JLabel lblAnneAdıYazısı;
    private javax.swing.JLabel lblBabaAdıYazısı;
    private javax.swing.JLabel lblCinsiyetYazısı;
    private javax.swing.JLabel lblDoğumTarihiYazısı;
    private javax.swing.JLabel lblDoğumYeriYazısı;
    private javax.swing.JLabel lblSabıkaKaydıYazısı;
    private javax.swing.JLabel lblSoyisimYazısı;
    private javax.swing.JLabel lblSuçunişlendiğiTarihYazısı;
    private javax.swing.JLabel lblTcNoYazısı;
    private javax.swing.JLabel lblİsim;
    private javax.swing.JLabel lblİşlenenSuçYazısı;
    private javax.swing.JPanel panelSabıkaGiriş;
    // End of variables declaration//GEN-END:variables
}
