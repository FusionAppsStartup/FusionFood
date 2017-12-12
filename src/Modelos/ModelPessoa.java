/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Entidade.Pessoa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AndrheiHenrique
 */
public class ModelPessoa {
    
    private ArrayList<Pessoa> listaPessoa = new ArrayList();
    
    private static ModelPessoa instance;
    
    public static ModelPessoa getInstance(){
        if(instance == null){
            instance = new ModelPessoa();
        }
        return instance;
    }
    
    public Pessoa autenticaPessoa(Pessoa p){
        Pessoa pValidado = null;
        try{
            
            Statement st = DAO.getInstance().acessaBd();
            
            st.executeQuery("SELECT * FROM Pessoa WHERE loginPessoa like '%"+p.getLoginPessoa()+"%' AND senhaPessoa like '%"+p.getSenhaPessoa()+"%'");  
            ResultSet rs = st.getResultSet();
            
            while(rs.next()){
                pValidado = new Pessoa(rs.getNString("nomepessoa"), rs.getString("loginPessoa"), rs.getString("perfilPessoa"), rs.getString("senhaPessoa"));
            }
  
        }catch(Exception e){
            System.err.println(e);
            e.getStackTrace();
        }
        
        return pValidado;
    }
    
    public Pessoa obterPessoaPesquisa(Pessoa p){
//        System.err.println(p);
        Pessoa pValidado = null;
        try{
            
            Statement st = DAO.getInstance().acessaBd();
            
            st.executeQuery("SELECT * FROM Pessoa WHERE loginPessoa = '"+p.getLoginPessoa()+"' AND perfilPessoa = '"+p.getPerfilPessoa()+"'");  
            ResultSet rs = st.getResultSet();
            
            while(rs.next()){
                pValidado = new Pessoa(rs.getLong("idPessoa"), rs.getNString("nomepessoa"), rs.getString("loginPessoa"), rs.getString("perfilPessoa"), rs.getString("senhaPessoa"));
            }
  
        }catch(Exception e){
            System.err.println(e);
            e.getStackTrace();
        }
        
        return pValidado;
    }
    
    
    public boolean insertPessoa(Pessoa p){
        boolean status = false;
        
        try{
            
            Statement st = DAO.getInstance().acessaBd();
            
            st.executeUpdate("INSERT INTO Pessoa (nomePessoa, loginPessoa, senhaPessoa, perfilPessoa)"
                    + " VALUES ('"+p.getNomePessoa()+"','"+p.getLoginPessoa()+"','"+p.getSenhaPessoa()+"',"
                    + "'"+p.getPerfilPessoa()+"')");  
            status = true;
            
        }catch(Exception e){
            status = false;
//            System.err.println(e);
            e.getStackTrace();
        }
        
        return status;
    }
    public ArrayList alteraPessoa(Pessoa p) {
        try{
                Statement st = DAO.getInstance().acessaBd();
                
                st.executeUpdate("UPDATE Pessoa SET nomePessoa = '" 
                    + p.getNomePessoa()+"', loginPessoa = '"
                    + p.getLoginPessoa()+ "', senhaPessoa= '"
                    + p.getSenhaPessoa()+ "', perfilPessoa= '"
                    + p.getPerfilPessoa()
                    + " 'WHERE idPessoa='" + p.getIdPessoa()+ "'");
                
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        return listaPessoa;
    }
    
    
    public ArrayList obterListaPessoa() {
        listaPessoa.clear();
        try{
                Statement st = DAO.getInstance().acessaBd();
                
                st.executeQuery("select * from Pessoa");
                ResultSet rs=st.getResultSet();
                while(rs.next()){
                    Pessoa p = new Pessoa (rs.getString("nomePessoa"),
                                            rs.getString("loginPessoa"),
                                            rs.getString("perfilPessoa"),
                                            rs.getString("senhaPessoa") );
                    listaPessoa.add(p);
                }
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        return listaPessoa;
    }
    
    public ArrayList<Pessoa> listaPessoa(){
//        System.err.println(listaPessoa);
        return listaPessoa;
    }
    
    public ArrayList excluirPessoa(Pessoa p) throws SQLException, ClassNotFoundException{
        try {
            Statement st = DAO.getInstance().acessaBd();
            
                st.executeUpdate("delete from Pessoa"
                        + " where nomePessoa ='"+p.getNomePessoa()+ "' AND perfilPessoa = '"+p.getPerfilPessoa()+"'");
            
            obterListaPessoa();
            return listaPessoa;
            
        }catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Selecione uma Pessoa!");
            JOptionPane.showMessageDialog(null, ex);
            
        }
        return listaPessoa;
    }
    
}
