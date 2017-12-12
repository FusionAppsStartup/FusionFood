/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AndrheiHenrique
 */
public class ControlePedido {
    
    private boolean status = true;
    public void validaDadosPedido(ArrayList listaPedido) throws ClassNotFoundException{
        
//        System.err.println(pr);
        
        if(listaPedido.size() == 0){
            status = false;
        }
        
        if(status){
//            System.err.println("Entrou");
            Modelos.ModelPedido.getInstance().inserirPedido(listaPedido);
            JOptionPane.showMessageDialog(null, "Pedido realizado!!!");
        }else{
            JOptionPane.showMessageDialog(null, "Seu Pedido não foi realizado."+"\n"+" Por favor, verifique se os dados foram preenchidos corretamente.");
        }
        

    }
}
