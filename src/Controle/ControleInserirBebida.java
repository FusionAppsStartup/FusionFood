/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Entidade.Bebida;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class ControleInserirBebida {
    private ArrayList erro = new ArrayList();
    private boolean status = true;
    public ArrayList validaDadosBebida(Bebida b) throws ClassNotFoundException{
        
        if(b.getNomeBebida().length() < 4){
            erro.add(0, true);
        }else{
            erro.add(0, false);
        }
        if(b.getDescricaoBebida().length() < 4){
            erro.add(1, true);
        }else{
            erro.add(1, false);
        }
        if(b.getCategoriaBebida().length() < 5){
            erro.add(2, true);
        }else{
            erro.add(2, false);
        }
        if(b.getTamanhoBebida().length() < 1){
            erro.add(3, true);
        }else{
            erro.add(3, false);
        }
        if(b.getPrecoBebida()<0){
            erro.add(4, true);
        }else{
            erro.add(4, false);
        }
        
        for(int i = 0; i<erro.size(); i++){
            
            if(erro.get(i).equals(true)){
                status = false;   
            }
        }
        
        if(status){
            Modelos.ModelBebida.getInstance().inserirBebida(b);
                    
            JOptionPane.showMessageDialog(null, "Cadastro de Bebida realizado!!!");
        }else{
            JOptionPane.showMessageDialog(null, "Seu cadastro não foi realizado."+"\n"+" Por favor, verifique se os dados foram preenchidos corretamente.");
        }
        
        return erro;
    }
    
}
