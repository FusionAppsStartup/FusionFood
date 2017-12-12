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
public class ControleInserirSobremesa {
    private ArrayList erro = new ArrayList();
    private boolean status = true;
    public ArrayList validaDadosSobremesa(Sobremesa s) throws ClassNotFoundException{
        
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
            Modelos.ModelSobremesa.getInstance().inserirSobremesa(s);
                    
            JOptionPane.showMessageDialog(null, "Cadastro de Sobremesa realizado!!!");
        }else{
            JOptionPane.showMessageDialog(null, "Seu cadastro não foi realizado."+"\n"+" Por favor, verifique se os dados foram preenchidos corretamente.");
        }
        
        return erro;
    }
}
