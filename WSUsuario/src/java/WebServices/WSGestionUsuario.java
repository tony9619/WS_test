/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import Modelo.*;

/**
 *
 * @author tonym
 */
@WebService(serviceName = "WSGestionUsuario")
public class WSGestionUsuario {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "validar")
    public Usuario validar(@WebParam(name = "usuario") String usuario, @WebParam(name = "clave") String clave) {
        
        UsuarioDAO  user = new UsuarioDAO();
        Usuario usu = user.validarUsuario(usuario, clave);  
        
        return usu;
    }
}
