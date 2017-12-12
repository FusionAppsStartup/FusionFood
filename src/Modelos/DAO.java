/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author AndrheiHenrique
 */
public class DAO {
    
    //Configurações de acesso ao banco de dados.
    private String classConn = "com.mysql.jdbc.Driver";
    private String bdConn ="fusionfood";
    private String hostConn = "localhost";//host/servidor/maquina
    private String portaConn = "3306";
    private String userConn = "root";
    private String passConn = "andrhei";
    
    
    private static DAO instance;
    
    public static DAO getInstance(){
        if(instance == null){
            instance = new DAO();
        }
        return instance;
    }
    
    public Statement acessaBd() throws ClassNotFoundException, SQLException{
            
            Class.forName(classConn);
            Connection conn =  DriverManager.getConnection("jdbc:mysql://"+hostConn+":"+portaConn+"/"+bdConn+"?zeroDateTimeBehavior=convertToNull", userConn, passConn);
            Statement st = conn.createStatement();

        return st;
    }
            
    
}
