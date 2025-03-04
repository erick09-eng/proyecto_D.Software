/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;



/**
 *
 * @author ANDRES FELIPE
 */
public class ControladorSesion {
    private String nombreUsuario;
    

    
    public ControladorSesion() {
       
    }

   
   public void setNombreUsuario(String nombreUsuario)  {
    
    this.nombreUsuario = nombreUsuario;
}

   
    public String obtenerNombreUsuario() {
        return nombreUsuario;
    }

    
    
}

