/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
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
        txt_stat_us = new javax.swing.JTextField();
        txt_stat_dat = new javax.swing.JTextField();
        Desktop = new javax.swing.JDesktopPane();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        menu = new javax.swing.JMenuBar();
        men_cad = new javax.swing.JMenu();
        men_cad_prod = new javax.swing.JMenuItem();
        men_cad_clie = new javax.swing.JMenuItem();
        men_cad_mold = new javax.swing.JMenuItem();
        men_cad_cor = new javax.swing.JMenuItem();
        men_cad_user = new javax.swing.JMenuItem();
        men_rel = new javax.swing.JMenu();
        men_rel_laudo = new javax.swing.JMenuItem();
        men_rel_fixT = new javax.swing.JMenuItem();
        men_rel_cad = new javax.swing.JMenuItem();
        men_ops = new javax.swing.JMenu();
        men_arq_sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Laudo e Fixa Tecnica");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel1.setText("Usuario:");

        jLabel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel2.setText("Data:");

        txt_stat_us.setEditable(false);
        txt_stat_us.setBackground(new java.awt.Color(204, 204, 204));
        txt_stat_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stat_usActionPerformed(evt);
            }
        });

        txt_stat_dat.setEditable(false);
        txt_stat_dat.setBackground(new java.awt.Color(204, 204, 204));

        Desktop.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("jLabel3");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField1");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("jButton1");

        jTextField3.setText("jTextField1");

        jTextField4.setText("jTextField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        Desktop.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jTextField4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DesktopLayout.createSequentialGroup()
                        .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(DesktopLayout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DesktopLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(DesktopLayout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        men_cad.setText("Cadastro");

        men_cad_prod.setText("Produtos");
        men_cad_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_cad_prodActionPerformed(evt);
            }
        });
        men_cad.add(men_cad_prod);

        men_cad_clie.setText("Cliente");
        men_cad_clie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_cad_clieActionPerformed(evt);
            }
        });
        men_cad.add(men_cad_clie);

        men_cad_mold.setText("Molde");
        men_cad_mold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_cad_moldActionPerformed(evt);
            }
        });
        men_cad.add(men_cad_mold);

        men_cad_cor.setText("Cores");
        men_cad_cor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_cad_corActionPerformed(evt);
            }
        });
        men_cad.add(men_cad_cor);

        men_cad_user.setText("Usuario");
        men_cad_user.setEnabled(false);
        men_cad_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_cad_userActionPerformed(evt);
            }
        });
        men_cad.add(men_cad_user);

        menu.add(men_cad);

        men_rel.setText("Relatorio");
        men_rel.setEnabled(false);

        men_rel_laudo.setText("Laudos");
        men_rel.add(men_rel_laudo);

        men_rel_fixT.setText("Ficha Tec.");
        men_rel_fixT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_rel_fixTActionPerformed(evt);
            }
        });
        men_rel.add(men_rel_fixT);

        men_rel_cad.setText("Cadastros");
        men_rel.add(men_rel_cad);

        menu.add(men_rel);

        men_ops.setText("Opçoes");

        men_arq_sair.setText("Sair");
        men_arq_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                men_arq_sairActionPerformed(evt);
            }
        });
        men_ops.add(men_arq_sair);

        menu.add(men_ops);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(txt_stat_us, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_stat_dat, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_stat_dat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_stat_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(5, 5, 5))
        );

        setSize(new java.awt.Dimension(792, 651));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Date data = new Date();
        DateFormat  formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        txt_stat_dat.setText(formatador.format(data));
        
        
    }//GEN-LAST:event_formWindowActivated

    private void txt_stat_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stat_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stat_usActionPerformed

    private void men_arq_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_arq_sairActionPerformed
        // TODO add your handling code here:
        int sair = JOptionPane.showConfirmDialog(null, "Deseja sair?");
        if (sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_men_arq_sairActionPerformed

    private void men_cad_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_cad_userActionPerformed
        // TODO add your handling code here:
        CadUsuario usuario = new CadUsuario();
        usuario.setVisible(true);
        Desktop.add(usuario);
        
    }//GEN-LAST:event_men_cad_userActionPerformed

    private void men_cad_corActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_cad_corActionPerformed
        //TODO add your handling code here:
        CadCor cor = new CadCor();
        cor.setVisible(true);
        Desktop.add(cor);
        
        
        
    }//GEN-LAST:event_men_cad_corActionPerformed

    private void men_cad_clieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_cad_clieActionPerformed
        // TODO add your handling code here:
        CadCliente cliente = new CadCliente();
        cliente.setVisible(true);
        Desktop.add(cliente);
    }//GEN-LAST:event_men_cad_clieActionPerformed

    private void men_rel_fixTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_rel_fixTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_men_rel_fixTActionPerformed

    private void men_cad_moldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_cad_moldActionPerformed
        // TODO add your handling code here:
        CadMolde molde = new CadMolde();
        molde.setVisible(true);
        Desktop.add(molde);
    }//GEN-LAST:event_men_cad_moldActionPerformed

    private void men_cad_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_men_cad_prodActionPerformed
        // TODO add your handling code here:
        CadProduto pro = new CadProduto();
        pro.setVisible(true);
        Desktop.add(pro);
    }//GEN-LAST:event_men_cad_prodActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Desktop;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JMenuItem men_arq_sair;
    private javax.swing.JMenu men_cad;
    private javax.swing.JMenuItem men_cad_clie;
    private javax.swing.JMenuItem men_cad_cor;
    private javax.swing.JMenuItem men_cad_mold;
    private javax.swing.JMenuItem men_cad_prod;
    public static javax.swing.JMenuItem men_cad_user;
    private javax.swing.JMenu men_ops;
    public static javax.swing.JMenu men_rel;
    private javax.swing.JMenuItem men_rel_cad;
    private javax.swing.JMenuItem men_rel_fixT;
    private javax.swing.JMenuItem men_rel_laudo;
    private javax.swing.JMenuBar menu;
    private javax.swing.JTextField txt_stat_dat;
    public static volatile javax.swing.JTextField txt_stat_us;
    // End of variables declaration//GEN-END:variables
}