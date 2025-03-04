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
public class Producto implements Serializable {
    private static final long serialVersionUID = -8327612031000780152L;
    private int idProducto;
    private String nombreProducto;
    private int codigoProducto;
    private String Descripcion;
    private int precioUnitario;
    private int cantidadProducto;
    private String categoria;

    public Producto(int idProducto, String nombreProducto, int codigoProducto, String Descripcion, int precioUnitario, int cantidadProducto, String categoria) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        this.Descripcion = Descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidadProducto = cantidadProducto;
        this.categoria = categoria;
    }

    

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    public String toString() {
    return nombreProducto; 
}
}
