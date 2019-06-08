/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.*;

/**
 *
 * @author tonym
 */
public class Conexion {
    
    public Conexion(){
        
    }
    public Connection getConection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/eshare","root","root");
        }catch(SQLException ex){
        }
        catch(Exception e){
        }
        return con;
    }
    
}
