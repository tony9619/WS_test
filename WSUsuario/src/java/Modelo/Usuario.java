/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author tonym
 */
public class Usuario {
   String usuario;
   String nombre;
   String apellido;
   String clave;
   String fecha_gra;
   String ultimo_usuario;
   
   public Usuario(){
         usuario = "";
         nombre = "";
         apellido = "";
         clave = "";
         fecha_gra = "";
         ultimo_usuario = "";
   }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getFecha_gra() {
        return fecha_gra;
    }

    public void setFecha_gra(String fecha_gra) {
        this.fecha_gra = fecha_gra;
    }

    public String getUltimo_usuario() {
        return ultimo_usuario;
    }

    public void setUltimo_usuario(String ultimo_usuario) {
        this.ultimo_usuario = ultimo_usuario;
    }
   
}
