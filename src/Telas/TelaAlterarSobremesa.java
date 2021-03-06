/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Controle.ControleAlteraSobremesa;
import Entidade.Pessoa;
import Entidade.Sobremesa;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samsung
 */
public class TelaAlterarSobremesa extends javax.swing.JFrame {
    private ArrayList erro = new ArrayList();
    private String nome;
    private String login;
    private String senha;
    private String perfil;
    
    private String nomeAltera;
    private String descricaoAltera;
    private float precoAltera;
    /**
     * Creates new form TelaAlterarSobremesa
     */
    public TelaAlterarSobremesa(Pessoa p, Sobremesa s) {
        initComponents();
        nome = p.getNomePessoa();
        login = p.getLoginPessoa();
        senha = p.getSenhaPessoa();
        perfil = p.getPerfilPessoa();
        
        jTextFieldNomeSobremesa.setText(s.getNomeSobremesa());
        jTextFieldDescricaoSobremesa.setText(s.getDescricaoSobremesa());
        jTextFieldPrecoSobremesa.setText(String.valueOf(s.getPrecoSobremesa()));
        
        nomeAltera = s.getNomeSobremesa();
        descricaoAltera = s.getDescricaoSobremesa();
        precoAltera = s.getPrecoSobremesa();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVoltar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        Preco = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jTextFieldDescricaoSobremesa = new javax.swing.JTextField();
        Descricao = new javax.swing.JLabel();
        jTextFieldNomeSobremesa = new javax.swing.JTextField();
        NomeSobremesa = new javax.swing.JLabel();
        jTextFieldPrecoSobremesa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 200, 40));

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO ALTERAR.png"))); // NOI18N
        jButtonAlterar.setBorder(null);
        jButtonAlterar.setContentAreaFilled(false);
        jButtonAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAlterarMouseExited(evt);
            }
        });
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 200, 40));

        Preco.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        Preco.setForeground(new java.awt.Color(255, 255, 255));
        Preco.setText("Preço:");
        getContentPane().add(Preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        Titulo.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("ALTERAR  SOBREMESA");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 180, -1));

        jTextFieldDescricaoSobremesa.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        getContentPane().add(jTextFieldDescricaoSobremesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 720, 30));

        Descricao.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        Descricao.setForeground(new java.awt.Color(255, 255, 255));
        Descricao.setText("Descrição Sobremesa:");
        getContentPane().add(Descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jTextFieldNomeSobremesa.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        getContentPane().add(jTextFieldNomeSobremesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 720, 30));

        NomeSobremesa.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        NomeSobremesa.setForeground(new java.awt.Color(255, 255, 255));
        NomeSobremesa.setText("Nome Sobremesa:");
        getContentPane().add(NomeSobremesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTextFieldPrecoSobremesa.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        getContentPane().add(jTextFieldPrecoSobremesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 440, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FundoSobremesa_1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        Pessoa p = new Pessoa(nome, login, perfil, senha);
        new TelaAdministrador(p).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        String nome = jTextFieldNomeSobremesa.getText();
        String descricao = jTextFieldDescricaoSobremesa.getText();
        float preco = Float.valueOf(jTextFieldPrecoSobremesa.getText());

        Sobremesa s = new Sobremesa(null, nomeAltera, descricaoAltera, precoAltera);
        
        s = Modelos.ModelSobremesa.getInstance().obterSobremesaPesquisa(s);
        Sobremesa s1 = new Sobremesa(s.getCodigoSobremesa(),nome,descricao, preco);
        Controle.ControleAlteraSobremesa Controle = new ControleAlteraSobremesa();
        
        try {
            erro = Controle.validaAltDadosSobremesa(s1);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaAlterarSobremesa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseExited
        // TODO add your handling code here:
         jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO VOLTAR.png")));
    }//GEN-LAST:event_jButtonVoltarMouseExited

    private void jButtonVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseEntered
        // TODO add your handling code here:
         jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO VOLTAR 2.png")));
    }//GEN-LAST:event_jButtonVoltarMouseEntered

    private void jButtonAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAlterarMouseEntered
        // TODO add your handling code here:
        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO ALTERAR 2.png")));
    }//GEN-LAST:event_jButtonAlterarMouseEntered

    private void jButtonAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAlterarMouseExited
        // TODO add your handling code here:
        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO ALTERAR.png")));
    }//GEN-LAST:event_jButtonAlterarMouseExited

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
            java.util.logging.Logger.getLogger(TelaAlterarSobremesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarSobremesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarSobremesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarSobremesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaAlterarSobremesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descricao;
    private javax.swing.JLabel NomeSobremesa;
    private javax.swing.JLabel Preco;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldDescricaoSobremesa;
    private javax.swing.JTextField jTextFieldNomeSobremesa;
    private javax.swing.JTextField jTextFieldPrecoSobremesa;
    // End of variables declaration//GEN-END:variables
}
