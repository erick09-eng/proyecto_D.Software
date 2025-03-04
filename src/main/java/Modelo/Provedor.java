/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ANDRES FELIPE
 */
public class Provedor extends Persona{
    private Empresa empresa;
    private String productosSuministrados;

    public Provedor(Empresa empresa, String productosSuministrados, String nombre, int telefono, int id, String correo) {
        super(nombre, telefono, id, correo);
        this.empresa = empresa;
        this.productosSuministrados = productosSuministrados;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getProductosSuministrados() {
        return productosSuministrados;
    }

    public void setProductosSuministrados(String productosSuministrados) {
        this.productosSuministrados = productosSuministrados;
    }
    
}
