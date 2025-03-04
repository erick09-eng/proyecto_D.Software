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
public class Cliente implements Serializable{
      private static final long serialVersionUID = 4834420882122885941L;
    private String nombre;
    private int puntos;
    private String contraseña;
    private int historialPuntos;

    public Cliente(String nombre, String contraseña ) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    
    

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getHistorialPuntos() {
        return historialPuntos;
    }

    public void setHistorialPuntos(int historialPuntos) {
        this.historialPuntos = historialPuntos;
    }

    public String toString() {
    return nombre; 
}
}
