/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Entidade.Pessoa;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Samsung
 */
public class TelaUsuario extends javax.swing.JFrame {
    private String nome;
    private String login;
    private String senha;
    private String perfil;
    /**
     * Creates new form TelaComida
     */
    public TelaUsuario(Pessoa p) {
        initComponents();
        nome = p.getNomePessoa();
        login = p.getLoginPessoa();
        senha = p.getSenhaPessoa();
        perfil = p.getPerfilPessoa();
        
       jButtonEditar.setEnabled(false);
       jButtonExcluir.setEnabled(false);
        
        construirTabela();
    }
    
    private void construirTabela(){
    ArrayList<Pessoa> lista = Modelos.ModelPessoa.getInstance().obterListaPessoa();
        
        DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
        modelo.addColumn("Nome");
        modelo.addColumn("Login");
        modelo.addColumn("Perfil");

        if (lista.size() == 0) {
            modelo.addRow(new String[]{"Sem dados",
                        null,
                        null,});
        }
        
        for (int i = 0; i < lista.size(); i++) {
            Pessoa p = lista.get(i);
           
            modelo.addRow(new String[]{
                        p.getNomePessoa(),
                        p.getLoginPessoa()+"",
                        p.getPerfilPessoa()+ "",});
        }

        jTableUsuarios.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jButtonVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO EDITAR.png"))); // NOI18N
        jButtonEditar.setBorder(null);
        jButtonEditar.setContentAreaFilled(false);
        jButtonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEditarMouseExited(evt);
            }
        });
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 200, 40));

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO EXCLUIR.png"))); // NOI18N
        jButtonExcluir.setBorder(null);
        jButtonExcluir.setContentAreaFilled(false);
        jButtonExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonExcluirMouseExited(evt);
            }
        });
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 200, 40));

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Nome", "Login", "Perfil"
            }
        ));
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableUsuarios);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 700, 400));

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
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 200, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TAMANHO CERTO.jpg"))); // NOI18N
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

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        int linha = jTableUsuarios.getSelectedRow();
//        System.err.println(linha);
        Pessoa p = Modelos.ModelPessoa.getInstance().listaPessoa().get(linha);
//        System.err.println(p);
        try {
            Modelos.ModelPessoa.getInstance().excluirPessoa(p);
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        Modelos.ModelPessoa.getInstance().obterListaPessoa();
        construirTabela();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        int linha = jTableUsuarios.getSelectedRow();
        Pessoa p = new Pessoa (nome, login, perfil, senha);
        Pessoa p1 = Modelos.ModelPessoa.getInstance().listaPessoa().get(linha);
        new TelaAlterarUsuario(p,p1).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseEntered
        // TODO add your handling code here:
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO VOLTAR 2.png")));
    }//GEN-LAST:event_jButtonVoltarMouseEntered

    private void jButtonVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseExited
        // TODO add your handling code here:
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO VOLTAR.png")));
    }//GEN-LAST:event_jButtonVoltarMouseExited

    private void jButtonExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExcluirMouseEntered
        // TODO add your handling code here:
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO EXCLUIR 2.png")));
    }//GEN-LAST:event_jButtonExcluirMouseEntered

    private void jButtonExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExcluirMouseExited
        // TODO add your handling code here:
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO EXCLUIR.png")));
    }//GEN-LAST:event_jButtonExcluirMouseExited

    private void jButtonEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseEntered
        // TODO add your handling code here:
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO EDITAR 2.png")));
    }//GEN-LAST:event_jButtonEditarMouseEntered

    private void jButtonEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseExited
        // TODO add your handling code here:
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO EDITAR.png")));
    }//GEN-LAST:event_jButtonEditarMouseExited

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked
        // TODO add your handling code here:
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jTableUsuariosMouseClicked

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
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableUsuarios;
    // End of variables declaration//GEN-END:variables
}
