 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Entidade.Pedido;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AndrheiHenrique
 */
public class ModelPedido {
    
    private static ModelPedido instance;
    
    public static ModelPedido getInstance(){
        if(instance == null){
            instance = new ModelPedido();
        }
        return instance;
    }
    
    public boolean inserirPedido(ArrayList listaPedido) throws ClassNotFoundException {
        boolean status = false;
    try{
            Statement st = DAO.getInstance().acessaBd();
            
            for (int i = 0; i < listaPedido.size(); i++) {
                
                Pedido p = (Pedido) listaPedido.get(i);
                
                st.executeUpdate("INSERT INTO Pedido(nomePedido, mesaPedido , garcomPedido, precoPedido, pedidoandamento, tamanhoPedido, pgtPedido) VALUES('"
                                +p.getNomePedido()+"','"
                                +p.getMesaPedido()+"','"
                                +p.getNomeGarcomPedido()+"','"
                                +p.getPrecoPedido()+"','"
                                +p.isAndamentoPedido()+"','"
                                +p.getTamanhoPedido()+"','"
                                +p.isPgtPedido()+"');");
            }
            status = true;
            
        }catch(Exception e){
            status = false;
//            System.err.println(e);
            e.getStackTrace();
        }
        return status;
    }
    
    public ArrayList obterPedido(int mesa, boolean pValido){
        ArrayList<Pedido> pValidado = new ArrayList();
        if(pValido){
            try{
            
                Statement st = DAO.getInstance().acessaBd();
            
                st.executeQuery("SELECT * FROM Pedido WHERE mesaPedido = "+mesa+" AND pedidoandamento = '"+pValido+"'");  
                ResultSet rs = st.getResultSet();
            
                while(rs.next()){
                    Pedido p = new Pedido (rs.getString("nomePedido"),rs.getInt("mesaPedido"),rs.getString("garcomPedido"),rs.getFloat("precoPedido"),rs.getString("tamanhoPedido"),rs.getBoolean("pedidoandamento"),rs.getBoolean("pgtPedido"));
                    pValidado.add(p);
                }
  
            }catch(Exception e){
                System.err.println(e);
                e.getStackTrace();
            }
        }else{
            try{
            
                Statement st = DAO.getInstance().acessaBd();
            
                st.executeQuery("SELECT * FROM Pedido WHERE mesaPedido = "+mesa+" AND pgtPedido = '"+pValido+"'");  
                ResultSet rs = st.getResultSet();
            
                while(rs.next()){
                    Pedido p = new Pedido (rs.getLong("idPedido"),rs.getString("nomePedido"),rs.getInt("mesaPedido"),rs.getString("garcomPedido"),rs.getFloat("precoPedido"),rs.getString("tamanhoPedido"),rs.getBoolean("pedidoandamento"),rs.getBoolean("pgtPedido"));
                    pValidado.add(p);
                }
  
            }catch(Exception e){
                System.err.println(e);
                e.getStackTrace();
            }
        }
        return pValidado;
    }
        public ArrayList obterPedidoCozinha(){
        ArrayList<Pedido> pValidado = new ArrayList();
        boolean pValido = true;
        try{
            
            Statement st = DAO.getInstance().acessaBd();
            
            st.executeQuery("SELECT * FROM Pedido WHERE pedidoAndamento = '"+pValido+"'");  
            ResultSet rs = st.getResultSet();
            
            while(rs.next()){
                Pedido p = new Pedido (rs.getString("nomePedido"),rs.getInt("mesaPedido"),rs.getString("garcomPedido"),rs.getFloat("precoPedido"),rs.getString("tamanhoPedido"),rs.getBoolean("pedidoandamento"),rs.getBoolean("pgtPedido"));
                pValidado.add(p);
            }
  
        }catch(Exception e){
            System.err.println(e);
            e.getStackTrace();
        }
        
        return pValidado;
    }
        
    public ArrayList obterAlteraPedido(int mesa, String nome){
        ArrayList<Pedido> pValidado = new ArrayList();
         boolean pValido = true;
        try{
            
            Statement st = DAO.getInstance().acessaBd();
            
            st.executeQuery("SELECT * FROM Pedido WHERE mesaPedido = "+mesa+" AND nomePedido = '"+nome+"'AND pedidoandamento = '"+pValido+"'");  
            ResultSet rs = st.getResultSet();
            
            while(rs.next()){
                Pedido p = new Pedido (rs.getLong("idPedido"), rs.getString("nomePedido"),rs.getInt("mesaPedido"),rs.getString("garcomPedido"),rs.getFloat("precoPedido"),rs.getString("tamanhoPedido"),rs.getBoolean("pedidoandamento"),rs.getBoolean("pgtPedido"));
                pValidado.add(p);
            }
  
        }catch(Exception e){
            System.err.println(e);
            e.getStackTrace();
        }
        
        return pValidado;
    }    
    
    public void alteraPedidoRealizado(Pedido p) {
       
        boolean altera = false;
        try{
                Statement st = DAO.getInstance().acessaBd();
                
                st.executeUpdate("UPDATE Pedido SET pedidoandamento = '"+ altera
                    + " 'WHERE idPedido='" + p.getCodigoPedido() + "'");
                
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
    }

    public void alteraPedidoPago(ArrayList<Pedido> alteraPedidos) {
       
        boolean altera = true;
        for(int i = 0; alteraPedidos.size() > i; i++){
            Pedido p = alteraPedidos.get(i);
           try{
                Statement st = DAO.getInstance().acessaBd();
                
                st.executeUpdate("UPDATE Pedido SET pgtPedido = '"+ altera
                    + " 'WHERE idPedido='" + p.getCodigoPedido() + "'");
                
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    } 
    
    public ArrayList obterPedidoControle(){
        ArrayList<Pedido> pValidado = new ArrayList();
            try{
            
                Statement st = DAO.getInstance().acessaBd();
            
                st.executeQuery("SELECT * FROM Pedido");  
                ResultSet rs = st.getResultSet();
            
                while(rs.next()){
                    Pedido p = new Pedido (rs.getString("nomePedido"),
                            rs.getInt("mesaPedido"),
                            rs.getString("garcomPedido"),
                            rs.getFloat("precoPedido"),
                            rs.getString("tamanhoPedido"),
                            rs.getBoolean("pedidoandamento"),
                            rs.getBoolean("pgtPedido"));
                    pValidado.add(p);
                }
  
            }catch(Exception e){
                System.err.println(e);
                e.getStackTrace();
            }
        return pValidado;
    }
    
    public void excluirPedido(String nomePedido){
        try {
            Statement st = DAO.getInstance().acessaBd();
            
                st.executeUpdate("delete from Pedido"
                        + " where nomePedido ='"+nomePedido+ "'");
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void limpaTabelaPedido() throws SQLException, ClassNotFoundException {
        Statement st = DAO.getInstance().acessaBd();
        st.executeUpdate("TRUNCATE Pedido");
    }
        
}
