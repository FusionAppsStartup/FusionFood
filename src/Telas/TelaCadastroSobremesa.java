/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Controle.ControleInserirSobremesa;
import Entidade.Pessoa;
import Entidade.Sobremesa;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samsung
 */
public class TelaCadastroSobremesa extends javax.swing.JFrame {
    private ArrayList erro = new ArrayList();
    private String nome;
    private String login;
    private String senha;
    private String perfil;
    /**
     * Creates new form TelaCadastroSobremesa
     */
    public TelaCadastroSobremesa(Pessoa p) {
        initComponents();
        nome = p.getNomePessoa();
        login = p.getLoginPessoa();
        senha = p.getSenhaPessoa();
        perfil = p.getPerfilPessoa();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Preco = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jTextFieldDescricaoSobremesa = new javax.swing.JTextField();
        Descricao = new javax.swing.JLabel();
        jTextFieldNomeSobremesa = new javax.swing.JTextField();
        NomeSobremesa = new javax.swing.JLabel();
        jTextFieldPrecoSobremesa = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jButtonInserir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/perfeito.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 110, 70));

        Preco.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        Preco.setForeground(new java.awt.Color(255, 255, 255));
        Preco.setText("Preço:");
        getContentPane().add(Preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        Titulo.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("CADASTRAR NOVA SOBREMESA");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 270, -1));

        jTextFieldDescricaoSobremesa.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        getContentPane().add(jTextFieldDescricaoSobremesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 720, 30));

        Descricao.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        Descricao.setForeground(new java.awt.Color(255, 255, 255));
        Descricao.setText("Descrição Sobremesa:");
        getContentPane().add(Descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jTextFieldNomeSobremesa.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        getContentPane().add(jTextFieldNomeSobremesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 720, 30));

        NomeSobremesa.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        NomeSobremesa.setForeground(new java.awt.Color(255, 255, 255));
        NomeSobremesa.setText("Nome Sobremesa:");
        getContentPane().add(NomeSobremesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTextFieldPrecoSobremesa.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        getContentPane().add(jTextFieldPrecoSobremesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 440, 30));

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
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 200, 40));

        jButtonInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO INSERIR.png"))); // NOI18N
        jButtonInserir.setBorder(null);
        jButtonInserir.setContentAreaFilled(false);
        jButtonInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonInserirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonInserirMouseExited(evt);
            }
        });
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 200, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FundoSobremesa_1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
        // TODO add your handling code here:
        String Nome = jTextFieldNomeSobremesa.getText();
        String Descricao = jTextFieldDescricaoSobremesa.getText();
        float Preco = Float.valueOf(jTextFieldPrecoSobremesa.getText());
        
         Sobremesa s = new Sobremesa(Nome,Descricao,Preco);
         
         Controle.ControleInserirSobremesa Controle = new ControleInserirSobremesa();
         
         try {
        erro = Controle.validaDadosSobremesa(s);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(TelaCadastroSobremesa.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        Pessoa p = new Pessoa(nome, login, perfil, senha);
        new TelaAdministrador(p).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseEntered
        // TODO add your handling code here:
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO VOLTAR 2.png")));
    }//GEN-LAST:event_jButtonVoltarMouseEntered

    private void jButtonVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseExited
        // TODO add your handling code here:
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO VOLTAR.png")));
    }//GEN-LAST:event_jButtonVoltarMouseExited

    private void jButtonInserirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInserirMouseEntered
        // TODO add your handling code here:
        jButtonInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO INSERIR 2.png")));
    }//GEN-LAST:event_jButtonInserirMouseEntered

    private void jButtonInserirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInserirMouseExited
        // TODO add your handling code here:
        jButtonInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO INSERIR.png")));
    }//GEN-LAST:event_jButtonInserirMouseExited

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
            java.util.logging.Logger.getLogger(TelaCadastroSobremesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroSobremesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroSobremesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroSobremesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaCadastroSobremesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descricao;
    private javax.swing.JLabel NomeSobremesa;
    private javax.swing.JLabel Preco;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldDescricaoSobremesa;
    private javax.swing.JTextField jTextFieldNomeSobremesa;
    private javax.swing.JTextField jTextFieldPrecoSobremesa;
    // End of variables declaration//GEN-END:variables
}