/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Entidade.Prato;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class ControleInserirPrato {
    private ArrayList erro = new ArrayList();
    private boolean status = true;
    public ArrayList validaDadosPrato(Prato pr) throws ClassNotFoundException{
        
//        System.err.println(pr);
        
        if(pr.getNomePrato().length() < 4){
            erro.add(0, true);
        }else{
            erro.add(0, false);
        }
        if(pr.getDescricaoPrato().length() < 4){
            erro.add(1, true);
        }else{
            erro.add(1, false);
        }
        if(pr.getCategoriaPrato().length() < 4){
            erro.add(2, true);
        }else{
            erro.add(2, false);
        }
        if(pr.getPrecoPrato()<1){
            erro.add(3, true);
        }else{
            erro.add(3, false);
        }
        
        for(int i = 0; i<erro.size(); i++){
            if(erro.get(i).equals(true)){
                status = false;
                System.err.println(status);
            }
        }
        
        if(status){
            System.err.println("Entrou");
            Modelos.ModelPrato.getInstance().inserirPrato(pr);
            JOptionPane.showMessageDialog(null, "Cadastro de Prato realizado!!!");
        }else{
            JOptionPane.showMessageDialog(null, "Seu cadastro não foi realizado."+"\n"+" Por favor, verifique se os dados foram preenchidos corretamente.");
        }
        
        return erro;
    }
}
