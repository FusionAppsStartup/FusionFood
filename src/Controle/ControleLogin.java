/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Entidade.Pessoa;

/**
 *
 * @author AndrheiHenrique
 */
public class ControleLogin {
    
    private static ControleLogin instance;
    
    public static ControleLogin getInstance(){
        if(instance == null){
            instance = new ControleLogin();
        }
        return instance;
    }
    
    public void validaPerfil(Pessoa p){
        
        if(p.getPerfilPessoa().equals("Administrador")){
//          System.out.println(p.toString());
            new Telas.TelaAdministrador(p).setVisible(true);
        }
        if(p.getPerfilPessoa().equals("Caixa")){
//          System.out.println(p.toString());
            new Telas.TelaCaixa(p).setVisible(true);
        }
        if(p.getPerfilPessoa().equals("Garçom")){
//          System.out.println(p.toString());
            new Telas.TelaGarcom(p).setVisible(true);
        }
        if(p.getPerfilPessoa().equals("Cozinha")){
//          System.out.println(p.toString());
            new Telas.TelaCozinha(p).setVisible(true);
        }
    }    
}
