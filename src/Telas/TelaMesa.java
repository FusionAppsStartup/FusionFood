/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Entidade.Pedido;
import Entidade.Pessoa;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Allan Cezar 
 */
public class TelaMesa extends javax.swing.JFrame {

    private ArrayList<Pedido> gerarPDF =  new ArrayList();
    private ArrayList<Pedido> alteraPedidos =  new ArrayList();
    private boolean pValido;
    private int mesa;
    private float total = 0;
    private String nome;
    private String login;
    private String senha;
    private String perfil;
    private NumberFormat formatter = new DecimalFormat("0.00");
    /**
     * Creates new form TelaMesa
     * @param p
     */
    public TelaMesa(Pessoa p) {
        initComponents();
        mesa = Integer.valueOf(JOptionPane.showInputDialog("Número da mesa"));
        jLabelMesa.setText("Mesa: "+String.valueOf(mesa));
        nome = p.getNomePessoa();
        login = p.getLoginPessoa();
        senha = p.getSenhaPessoa();
        perfil = p.getPerfilPessoa();
        construirTabela();
        jButtonExcuir.setEnabled(false);
        if(perfil.equals("Garçom")){
            jButtonFecharConta.setVisible(false);
            pValido = true;
        }else{
            pValido = false;
            jButtonAtualizaPedido.setVisible(false);
            jButtonExcuir.setVisible(false);
        }
    }
    
    private void construirTabela(){
    ArrayList<Pedido> lista = Modelos.ModelPedido.getInstance().obterPedido(mesa,pValido);
        
        DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
        modelo.addColumn("Nome");
        modelo.addColumn("Tamanho");
        modelo.addColumn("Preço");

        if (lista.isEmpty()) {
            modelo.addRow(new String[]{"Sem dados",
                        null,
                        null,});
        }
        
        for (int i = 0; i < lista.size(); i++) {
            Pedido p = lista.get(i);
            modelo.addRow(new String[]{
                        p.getNomePedido(),
                        p.getTamanhoPedido()+"",
                        "R$ "+formatter.format(p.getPrecoPedido())+ "",});
            total = total + p.getPrecoPedido();
            gerarPDF.add(p);
        }

        jTable1.setModel(modelo);
        jLabelValorTotal.setText("Valor total: "+formatter.format(total));
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
        jTable1 = new javax.swing.JTable();
        jLabelMesa = new javax.swing.JLabel();
        jButtonFecharConta = new javax.swing.JButton();
        jLabelValorTotal = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jButtonAtualizaPedido = new javax.swing.JButton();
        jButtonExcuir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 710, 400));

        jLabelMesa.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jLabelMesa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMesa.setText("Mesa  x");
        getContentPane().add(jLabelMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 100, 30));

        jButtonFecharConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO FECHAR CONTA.png"))); // NOI18N
        jButtonFecharConta.setBorder(null);
        jButtonFecharConta.setContentAreaFilled(false);
        jButtonFecharConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonFecharContaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonFecharContaMouseExited(evt);
            }
        });
        jButtonFecharConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharContaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFecharConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 200, 40));

        jLabelValorTotal.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jLabelValorTotal.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 260, 40));

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
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 200, 40));

        jButtonAtualizaPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO ATUALIZAR PEDIDO.png"))); // NOI18N
        jButtonAtualizaPedido.setContentAreaFilled(false);
        jButtonAtualizaPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAtualizaPedidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAtualizaPedidoMouseExited(evt);
            }
        });
        jButtonAtualizaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizaPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizaPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 200, 40));

        jButtonExcuir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO EXCLUIR.png"))); // NOI18N
        jButtonExcuir.setBorder(null);
        jButtonExcuir.setBorderPainted(false);
        jButtonExcuir.setContentAreaFilled(false);
        jButtonExcuir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonExcuirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonExcuirMouseExited(evt);
            }
        });
        jButtonExcuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcuirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcuir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 449, 200, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TAMANHO CERTO.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

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
        if(perfil.equals("Garçom")){
            new TelaGarcom(p).setVisible(true);
        }else{
            new TelaCaixa(p).setVisible(true);
        }
        this.dispose();        
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonAtualizaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizaPedidoActionPerformed
        // TODO add your handling code here:
        Pessoa p = new Pessoa(nome, login, perfil, senha);
        new TelaCadastroPedido(p, mesa).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAtualizaPedidoActionPerformed

    private void jButtonFecharContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharContaActionPerformed
        // TODO add your handling code here:
        String url = null;
        JFileChooser menu = new JFileChooser();
        menu.setApproveButtonText("Salvar");
        menu.showOpenDialog(menu);
        url=menu.getSelectedFile().getPath();
        PDFs.GerarPDFdiario.getInstance().GeraPDF(gerarPDF,url,total);
        
        alteraPedidos = gerarPDF;
        
        Modelos.ModelPedido.getInstance().alteraPedidoPago(alteraPedidos);
        
//        fecha a tela atual e abre a tela anterior
        Pessoa p = new Pessoa(nome, login, perfil, senha);
        
        new TelaCaixa(p).setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonFecharContaActionPerformed

    private void jButtonFecharContaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFecharContaMouseEntered
        // TODO add your handling code here:
        jButtonFecharConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO FECHAR CONTA 2.png")));
    }//GEN-LAST:event_jButtonFecharContaMouseEntered

    private void jButtonFecharContaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFecharContaMouseExited
        // TODO add your handling code here:
        jButtonFecharConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO FECHAR CONTA.png")));
    }//GEN-LAST:event_jButtonFecharContaMouseExited

    private void jButtonAtualizaPedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAtualizaPedidoMouseEntered
        // TODO add your handling code here:
        jButtonAtualizaPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO ATUALIZAR PEDIDO 2.png")));
    }//GEN-LAST:event_jButtonAtualizaPedidoMouseEntered

    private void jButtonAtualizaPedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAtualizaPedidoMouseExited
        // TODO add your handling code here:
        jButtonAtualizaPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO ATUALIZAR PEDIDO.png")));
    }//GEN-LAST:event_jButtonAtualizaPedidoMouseExited

    private void jButtonExcuirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExcuirMouseEntered
        // TODO add your handling code here:
        jButtonExcuir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO EXCLUIR 2.png")));
    }//GEN-LAST:event_jButtonExcuirMouseEntered

    private void jButtonExcuirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExcuirMouseExited
        // TODO add your handling code here:
        jButtonExcuir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BOTÃO EXCLUIR.png")));
    }//GEN-LAST:event_jButtonExcuirMouseExited

    private void jButtonExcuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcuirActionPerformed
        // TODO add your handling code here:
        int linha = jTable1.getSelectedRow();
        String nomePedido = String.valueOf(jTable1.getValueAt(linha, 0));
        
        Modelos.ModelPedido.getInstance().excluirPedido(nomePedido);
        
        construirTabela();
        jButtonExcuir.setEnabled(false);
    }//GEN-LAST:event_jButtonExcuirActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        if(perfil.equals("Garçom")){
            jButtonExcuir.setEnabled(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new TelaMesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizaPedido;
    private javax.swing.JButton jButtonExcuir;
    private javax.swing.JButton jButtonFecharConta;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelMesa;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
