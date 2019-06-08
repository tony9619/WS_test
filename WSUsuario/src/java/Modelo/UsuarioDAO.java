/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package Modelo;

import Modelo.Conexion;
import Modelo.Usuario;
import java.sql.*;

/**
 *
 * @author tonym
 */
public class UsuarioDAO {
    Conexion conexion;
    
    public UsuarioDAO(){
        conexion = new Conexion();
    }
    public Usuario validarUsuario(String usuario,String clave){
        Usuario user = null;
        Connection accesoDB = conexion.getConection();
        try{
            PreparedStatement ps = accesoDB.prepareStatement("SELECT usuario,clave FROM tb_usuarios WHERE usuario=? and clave=?");
            ps.setString(1, usuario);
            ps.setString(2, clave);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                user = new Usuario();
                user.setUsuario(rs.getString(1));
                user.setClave(rs.getString(2));
                return user;
            }
        }
        catch (Exception e){
            
        }
        return user;
    }
}
