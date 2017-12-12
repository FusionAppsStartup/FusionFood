/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Entidade.Prato;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class ModelPrato {
    private ArrayList<Prato> listaPrato = new ArrayList();
    
    private static ModelPrato instance;
    
    public static ModelPrato getInstance(){
        if(instance == null){
            instance = new ModelPrato();
        }
        return instance;
    }
    
    public boolean inserirPrato(Prato pr) throws ClassNotFoundException {
        boolean status = false;
    try{
            
            Statement st = DAO.getInstance().acessaBd();
            
            st.executeUpdate("INSERT INTO Prato(nomePrato, descricaoPrato , categoriaPrato, precoPrato) VALUES('"
                                +pr.getNomePrato()+"','"
                                +pr.getDescricaoPrato()+"','"
                                +pr.getCategoriaPrato()+"','"
                                +pr.getPrecoPrato()+"');");
            status = true;
            
        }catch(Exception e){
            status = false;
//            System.err.println(e);
            e.getStackTrace();
        }
        return status;
    }
    public Prato obterPratoPesquisa(Prato p){
//        System.err.println(p);
        Prato pValidado = null;
        try{
            
            Statement st = DAO.getInstance().acessaBd();
            
            st.executeQuery("SELECT * FROM Prato WHERE nomePrato = '"+p.getNomePrato()+"' AND precoPrato = '"+p.getPrecoPrato()+"'");  
            ResultSet rs = st.getResultSet();
            
            while(rs.next()){
                pValidado = new Prato(rs.getLong("idPrato"), rs.getNString("nomePrato"), rs.getString("descricaoPrato"), rs.getString("categoriaPrato"), rs.getFloat("precoPrato"));
            }
  
        }catch(Exception e){
            System.err.println(e);
            e.getStackTrace();
        }
        
        return pValidado;
    }
    
    public ArrayList alteraPrato(Prato p) {
        try{
                Statement st = DAO.getInstance().acessaBd();
                
                st.executeUpdate("UPDATE Prato SET nomePrato = '" 
                    + p.getNomePrato()+"', descricaoPrato = '"
                    + p.getDescricaoPrato()+ "', categoriaPrato= '"
                    + p.getCategoriaPrato()+ "', precoPrato= '"
                    + p.getPrecoPrato()
                    + " 'WHERE idPrato='" + p.getCodigoPrato()+ "'");
                
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        return listaPrato;
    }
    
    public ArrayList excluirPrato(Prato p) throws SQLException, ClassNotFoundException{
        try {
            Statement st = DAO.getInstance().acessaBd();
            
                st.executeUpdate("delete from Prato"
                        + " where nomePrato ='"+p.getNomePrato()+ "'");
            obterListaPrato();
            return listaPrato;
            
        }catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Selecione um Prato!");
            JOptionPane.showMessageDialog(null, ex);
            
        }
        return listaPrato;
    }
    
    public ArrayList obterListaPrato() {
        listaPrato.clear();
        try{
                Statement st = DAO.getInstance().acessaBd();
                
                st.executeQuery("select * from Prato");
                ResultSet rs=st.getResultSet();
                while(rs.next()){
                    Prato pr = new Prato (rs.getString("nomePrato"),
                                            rs.getString("descricaoPrato"),
                                            rs.getString("categoriaPrato"),
                                            rs.getFloat("precoPrato"));
                    listaPrato.add(pr);
                }
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        return listaPrato;
    }
    public ArrayList<Prato> listaPrato(){
        
        return listaPrato;
    }
    
        
}
