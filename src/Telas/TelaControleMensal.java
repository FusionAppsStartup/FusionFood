/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Entidade.ControleMensal;
import Entidade.Pessoa;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AndrheiHenrique
 */
public class TelaControleMensal extends javax.swing.JFrame {

    ArrayList<ControleMensal> lista = new ArrayList();
    private String nome;
    private String mesAno;
    private String login;
    private String senha;
    private String perfil;
    private float vTotalMensal = 0;
    private NumberFormat formatter = new DecimalFormat("0.00");
    
    /**
     * Creates new form Conrlo
     */
    public TelaControleMensal(Pessoa p) {
        initComponents();
        mesAno = JOptionPane.showInputDialog("Digite o Número Referente ao Mês e ao ANO no Formato MM/AAAA.");
        nome = p.getNomePessoa();
        login = p.getLoginPessoa();
        senha = p.getSenhaPessoa();
        perfil = p.getPerfilPessoa();
        construirTabela();
        jLabel3.setText("TOTAL: R$ "+formatter.format(vTotalMensal));
    }
    
     private void construirTabela(){
        lista= Modelos.ModelControles.getInstance().obterControleMensal(mesAno);
        
        DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
        modelo.addColumn("Data");
        modelo.addColumn("Quantidade Itens");
        modelo.addColumn("Valor");

        if (lista.isEmpty()) {
            modelo.addRow(new String[]{"Sem dados",
                        null,
                        null,});
        }
        
        for (int i = 0; i < lista.size(); i++) {
            ControleMensal cm = lista.get(i);
            modelo.addRow(new String[]{
                        cm.getDataDiaria(),
                        cm.getItensVendidos()+"",
                        "R$ "+formatter.format(cm.getValorVendido())+ "",});
            vTotalMensal = vTotalMensal + cm.getValorVendido();
        }
        jTableControles.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableControles = new javax.swing.JTable();
        jButtonVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableControles.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jTableControles.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableControles);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 700, 410));

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO VOLTAR.png"))); // NOI18N
        jButtonVoltar.setBorder(null);
        jButtonVoltar.setContentAreaFilled(false);
        jButtonVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonVoltarMouseExited(evt);
            }
        });
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 200, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/perfeito.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 430, 120, 70));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 220, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TAMANHO CERTO.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseEntered
        // TODO add your handling code here:
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO VOLTAR 2.png")));
    }//GEN-LAST:event_jButtonVoltarMouseEntered

    private void jButtonVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseExited
        // TODO add your handling code here:
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO VOLTAR.png")));
    }//GEN-LAST:event_jButtonVoltarMouseExited

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        Pessoa p = new Pessoa(nome, login, perfil, senha);
        new TelaAdministrador(p).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaControleMensal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaControleMensal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaControleMensal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaControleMensal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new TelaControleMensal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableControles;
    // End of variables declaration//GEN-END:variables
}
