/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Entidade.Sobremesa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class ModelSobremesa {
    private ArrayList<Sobremesa> listaSobremesa = new ArrayList();
    
    private static ModelSobremesa instance;
    
    public static ModelSobremesa getInstance(){
        if(instance == null){
            instance = new ModelSobremesa();
        }
        return instance;
    }
    public Sobremesa obterSobremesaPesquisa(Sobremesa s){
        
        Sobremesa pValidado = null;
        try{
            
            Statement st = DAO.getInstance().acessaBd();
            
            st.executeQuery("SELECT * FROM Sobremesa WHERE nomeSobremesa = '"+s.getNomeSobremesa()+"' AND precoSobremesa = '"+s.getPrecoSobremesa()+"'");  
            ResultSet rs = st.getResultSet();
            
            while(rs.next()){
                pValidado = new Sobremesa(rs.getLong("idSobremesa"), rs.getNString("nomeSobremesa"), rs.getString("descricaoSobremesa"),rs.getFloat("precoSobremesa"));
            }
  
        }catch(Exception e){
            System.err.println(e);
            e.getStackTrace();
        }
        
        return pValidado;
    }
    public void inserirSobremesa(Sobremesa s) throws ClassNotFoundException {
    try{
            
            Statement st = DAO.getInstance().acessaBd();
            
            st.executeUpdate("INSERT INTO sobremesa(nomeSobremesa, descricaoSobremesa, precoSobremesa) VALUES('"
                                +s.getNomeSobremesa()+"','"
                                +s.getDescricaoSobremesa()+"','"
                                +s.getPrecoSobremesa()+"');");
            listaSobremesa.add(s);
            
        }catch(SQLException ex) {
            System.err.println(ex);
            ex.getStackTrace();
        }
    }
    public ArrayList alteraSobremesa(Sobremesa s) {
        try{
                Statement st = DAO.getInstance().acessaBd();
                
                st.executeUpdate("UPDATE Sobremesa SET nomeSobremesa = '" 
                    + s.getNomeSobremesa()+"', descricaoSobremesa = '"
                    + s.getDescricaoSobremesa()+"', precoSobremesa= '"
                    + s.getPrecoSobremesa()
                    + " 'WHERE idSobremesa='" + s.getCodigoSobremesa()+ "'");
                
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        return listaSobremesa;
    }
    
    
    
    
    public ArrayList obterListaSobremesa() {
        listaSobremesa.clear();
        try{
                Statement st = DAO.getInstance().acessaBd();
                
                st.executeQuery("select * from Sobremesa");
                ResultSet rs=st.getResultSet();
                while(rs.next()){
                    Sobremesa s = new Sobremesa (rs.getString("nomeSobremesa"),
                                            rs.getString("descricaoSobremesa"),
                                            rs.getFloat("precoSobremesa"));
                    listaSobremesa.add(s);
                }
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        return listaSobremesa;
    }
    
    public ArrayList<Sobremesa> listaSobremesa(){
        return listaSobremesa;
    }
    public ArrayList excluirSobremesa(Sobremesa s) throws SQLException, ClassNotFoundException{
        try {
            Statement st = DAO.getInstance().acessaBd();
            
                st.executeUpdate("delete from Sobremesa"
                        + " where nomeSobremesa ='"+s.getNomeSobremesa()+ "'");
            obterListaSobremesa();
            return listaSobremesa;
            
        }catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Selecione uma Sobremesa!");
            JOptionPane.showMessageDialog(null, ex);
            
        }
        return listaSobremesa;
    }
}
