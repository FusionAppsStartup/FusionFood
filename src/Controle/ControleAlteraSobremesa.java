/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Entidade.Sobremesa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class ControleAlteraSobremesa {
        private ArrayList erro = new ArrayList();
    private boolean status = true;
    public ArrayList validaAltDadosSobremesa(Sobremesa s) throws ClassNotFoundException{
        
        if(s.getNomeSobremesa().length() < 4){
            erro.add(0, true);
        }else{
            erro.add(0, false);
        }
        if(s.getDescricaoSobremesa().length() < 4){
            erro.add(1, true);
        }else{
            erro.add(1, false);
        }
        if(s.getPrecoSobremesa()<0){
            erro.add(2, true);
        }else{
            erro.add(2, false);
        }
        
        for(int i = 0; i<erro.size(); i++){
            
            if(erro.get(i).equals(true)){
                status = false;   
            }
        }
        
        if(status){
            Modelos.ModelSobremesa.getInstance().alteraSobremesa(s);
                    
            JOptionPane.showMessageDialog(null, "Alteração da Sobremesa Realizada!!!");
        }else{
            JOptionPane.showMessageDialog(null, "A alteração não foi realizada."+"\n"+" Por favor, verifique se os dados foram preenchidos corretamente.");
        }
        
        return erro;
    }
}
