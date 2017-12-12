/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Entidade.Bebida;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class ModelBebida {
    
    private ArrayList<Bebida> listaBebida = new ArrayList();
    
    private static ModelBebida instance;
    
    public static ModelBebida getInstance(){
        if(instance == null){
            instance = new ModelBebida();
        }
        return instance;
    }
    
    public void inserirBebida(Bebida b) throws ClassNotFoundException {
    try{
            
            Statement st = DAO.getInstance().acessaBd();
            
            st.executeUpdate("INSERT INTO Bebida(nomeBebida, descricaoBebida , categoriaBebida, tamanhoBebida, precoBebida) VALUES('"
                                +b.getNomeBebida()+"','"
                                +b.getDescricaoBebida()+"','"
                                +b.getCategoriaBebida()+"','"
                                +b.getTamanhoBebida()+"','"
                                +b.getPrecoBebida()+"');");
            listaBebida.add(b);
            
        }catch(SQLException ex) {
            System.err.println(ex);
            ex.getStackTrace();
        }
    }
    public ArrayList alteraBebida(Bebida b) {
        try{
                Statement st = DAO.getInstance().acessaBd();
                
                st.executeUpdate("UPDATE Bebida SET nomeBebida = '" 
                    + b.getNomeBebida()+"', descricaoBebida = '"
                    + b.getDescricaoBebida()+ "', categoriaBebida= '"
                        + b.getCategoriaBebida()+ "', tamanhoBebida= '"
                    + b.getTamanhoBebida()+ "', precoBebida= '"
                    + b.getPrecoBebida()
                    + " 'WHERE idBebida='" + b.getCodigoBebida()+ "'");
                
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        return listaBebida;
    }
    
    public Bebida obterBebidaPesquisa(Bebida b){
        System.err.println(b);
        Bebida bValidado = null;
        try{
            
            Statement st = DAO.getInstance().acessaBd();
            
            st.executeQuery("SELECT * FROM Bebida WHERE nomeBebida = '"+b.getNomeBebida()+"' AND precoBebida = '"+b.getPrecoBebida()+"'");  
            ResultSet rs = st.getResultSet();
            
            while(rs.next()){
                bValidado = new Bebida(rs.getLong("idBebida"), rs.getNString("nomeBebida"), rs.getString("descricaoBebida"), rs.getString("categoriaBebida"),rs.getString("tamanhoBebida"), rs.getFloat("precoBebida"));
            }
  
        }catch(Exception e){
            System.err.println(e);
            e.getStackTrace();
        }
        
        return bValidado;
    }
    
    
    public ArrayList obterListaBebida() {
        listaBebida.clear();
        try{
                Statement st = DAO.getInstance().acessaBd();
                
                st.executeQuery("select * from Bebida");
                ResultSet rs=st.getResultSet();
                while(rs.next()){
                    Bebida b = new Bebida (rs.getString("nomeBebida"),
                                            rs.getString("descricaoBebida"),
                                            rs.getString("categoriaBebida"),
                                            rs.getString("tamanhoBebida"),
                                            rs.getFloat("precoBebida"));
                    listaBebida.add(b);
                }
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        return listaBebida;
    }
    public ArrayList<Bebida> listaBebida(){
        
        return listaBebida;
    }
    
    public ArrayList excluirBebida(Bebida b) throws SQLException, ClassNotFoundException{
        try {
            Statement st = DAO.getInstance().acessaBd();
            
                st.executeUpdate("delete from Bebida"
                        + " where nomeBebida ='"+b.getNomeBebida()+ "'");
            obterListaBebida();
            return listaBebida;
            
        }catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Selecione uma Sobremesa!");
            JOptionPane.showMessageDialog(null, ex);
            
        }
        return listaBebida;
    }
}

