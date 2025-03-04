/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ANDRES FELIPE
 */
public class Empresa extends Persona{
    private String provedoresAsociados;

    public Empresa(String provedoresAsociados, String nombre, int telefono, int id, String correo) {
        super(nombre, telefono, id, correo);
        this.provedoresAsociados = provedoresAsociados;
    }

    public String getProvedoresAsociados() {
        return provedoresAsociados;
    }

    public void setProvedoresAsociados(String provedoresAsociados) {
        this.provedoresAsociados = provedoresAsociados;
    }
    
}
