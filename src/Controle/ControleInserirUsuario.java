/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Entidade.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AndrheiHenrique
 */
public class ControleInserirUsuario {
 
    private ArrayList erro = new ArrayList();
    private boolean status = true;
    public ArrayList validaDadosPessoa(Pessoa p){
        
        if(p.getNomePessoa().length() < 4){
            erro.add(0, true);
        }else{
            erro.add(0, false);
        }
        if(p.getLoginPessoa().length() < 4){
            erro.add(1, true);
        }else{
            erro.add(1, false);
        }
        if(p.getSenhaPessoa().length() < 5){
            erro.add(2, true);
        }else{
            erro.add(2, false);
        }
        if(p.getPerfilPessoa().equals("Selecione")){
            erro.add(3, true);
        }else{
            erro.add(3, false);
        }
        
        for(int i = 0; i<erro.size(); i++){
            
            if(erro.get(i).equals(true)){
                status = false;   
            }
        }
        
        if(status){
            Modelos.ModelPessoa.getInstance().insertPessoa(p);
            JOptionPane.showMessageDialog(null, "Cadastro de Ususario realizado!!!");
        }else{
            JOptionPane.showMessageDialog(null, "Seu cadastro não foi realizado."+"\n"+" Por favor, verifique se os dados foram preenchidos corretamente.");
        }
        
        return erro;
    }
    
}
