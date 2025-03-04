/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author ANDRES FELIPE
 */
public class Venta implements Serializable {
    private int idVenta;
    private LocalDate fecha;
    private Empleados empleado;
//    private Empresa empresa;
    private Cliente cliente;
    private Producto producto;
    private int puntosRedimidos;
    private int cantidadProducto;

    public Venta(int idVenta, LocalDate fecha, Empleados empleado, Cliente cliente, Producto producto, int puntosRedimidos, int cantidadProductos ) {
        this.idVenta = idVenta;
        this.fecha = fecha;
//        this.empresa = empresa;
this.empleado= empleado;
        this.cliente = cliente;
        this.producto=producto;
        this.puntosRedimidos = puntosRedimidos;
        this.cantidadProducto=cantidadProductos;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Empleados getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleados empleado) {
        this.empleado = empleado;
    }

    

//    public Empresa getEmpresa() {
//        return empresa;
//    }
//
//    public void setEmpresa(Empresa empresa) {
//        this.empresa = empresa;
//    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }


    public int getPuntosRedimidos() {
        return puntosRedimidos;
    }

    public void setPuntosRedimidos(int puntosRedimidos) {
        this.puntosRedimidos = puntosRedimidos;
    }
    
    
}
