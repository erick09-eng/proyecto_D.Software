/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author ANDRES FELIPE
 */
public class Empleados extends Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String rol;
    private String contraseña;
    private String funcionesEspeciales;

    public Empleados(String rol, String contraseña, String funcionesEspeciales, String nombre, int telefono, int id, String correo) {
        super(nombre, telefono, id, correo);
        this.rol = rol;
        this.contraseña = contraseña;
        this.funcionesEspeciales = funcionesEspeciales;
    }

   

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getFuncionesEspeciales() {
        return funcionesEspeciales;
    }

    public void setFuncionesEspeciales(String funcionesEspeciales) {
        this.funcionesEspeciales = funcionesEspeciales;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

   
}
