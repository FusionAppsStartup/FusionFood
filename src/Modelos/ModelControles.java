/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Entidade.ControleMensal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author AndrheiHenrique
 */
public class ModelControles {
    
    private static ModelControles instance;
    
    public static ModelControles getInstance(){
        if(instance == null){
            instance = new ModelControles();
        }
        return instance;
    }
    
    public void transferirCotroleDpM(String Data,float Vtotal,int qtdVendas ) throws ClassNotFoundException{
    try{
            
            Statement st = DAO.getInstance().acessaBd();
            
            st.executeUpdate("INSERT INTO ControleMensal(dataDiaria, valorDiario , qtdVendida) VALUES('"
                                +Data+"','"
                                +Vtotal+"','"
                                +qtdVendas+"');");
        }catch(SQLException ex) {
            System.err.println(ex);
            ex.getStackTrace();
        }
    }
    
    public ArrayList<ControleMensal> obterControleMensal(String mesAno){
        ArrayList<ControleMensal> cValidado = new ArrayList();
            try{
                String data;
                for(int dia = 1; dia < 32;dia ++){
                    if(dia <10){
                        data = "0"+dia+"/"+mesAno;
                    }else{
                        data = dia+"/"+mesAno;
                    }
                    Statement st = DAO.getInstance().acessaBd();
                    st.executeQuery("SELECT * FROM ControleMensal WHERE dataDiaria = '"+data+"'");  
                    ResultSet rs = st.getResultSet();
//                    System.err.println(data);

                    while(rs.next()){
//                        System.err.println(data);
                        ControleMensal cm = new ControleMensal(rs.getString("dataDiaria"),
                                rs.getFloat("valorDiario"),
                                rs.getInt("qtdVendida"));
                        cValidado.add(cm);
                    }
                }
  
            }catch(Exception e){
                System.err.println(e);
                e.getStackTrace();
            }
        return cValidado;
    }
    
}
