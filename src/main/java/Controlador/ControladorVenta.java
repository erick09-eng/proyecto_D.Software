/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Factura;
import Modelo.Producto;
import Modelo.Venta;
import Singleton.Singleton;
import excepciones.CantidadDeProductosExcepciones;
import excepciones.IdVentaDuplicadoException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ANDRES FELIPE
 */
public class ControladorVenta {
   ArrayList<Venta> listaVenta;
   ArrayList<Producto>listaProducto;
   ArrayList<Factura> listaFactura;

    public ControladorVenta() {
        listaVenta = Singleton.getInstancia().getListaVenta();
        listaProducto=Singleton.getInstancia().getListaProducto();
        listaFactura=Singleton.getInstancia().getListaFactura();
    }
   
     public ArrayList<Venta> getVenta() {
        return listaVenta;
    }
   public boolean GuardarVenta(Venta venta) throws IdVentaDuplicadoException {
    for (Factura v : listaFactura) {
        if (v.getIdVenta() == venta.getIdVenta() && !v.getCliente().equals(venta.getCliente())) {
            throw new IdVentaDuplicadoException("No se puede registrar la venta porque el ID de venta está duplicado para otro cliente.");
        }
    }

    listaVenta.add(venta);
    Singleton.getInstancia().escribirObjectoVenta();
    return true;

}
   
   
public boolean EliminarVenta(int idVenta) throws CantidadDeProductosExcepciones {
    boolean eliminado = false;

  
    Iterator<Venta> iterador = listaVenta.iterator();
    
    while (iterador.hasNext()) {
        Venta venta = iterador.next();
        
        if (venta.getIdVenta() == idVenta) {
            if (!RestarCantidadProductos(venta.getProducto(), venta.getCantidadProducto())) {
                throw new CantidadDeProductosExcepciones("No se pudo restar la cantidad de productos.");
            }
            iterador.remove(); 
            eliminado = true;
        }
    }

   
    if (eliminado) {
        Singleton.getInstancia().escribirObjectoVenta();
    }

    return eliminado;
}

private boolean RestarCantidadProductos(Producto producto, int cantidad) throws CantidadDeProductosExcepciones {
    for (Producto prodExistente : listaProducto) {
        if (prodExistente.getCodigoProducto() == producto.getCodigoProducto()) {
           
            if (prodExistente.getCantidadProducto() < cantidad) {
                throw new CantidadDeProductosExcepciones("No se puede restar la cantidad especificada porque no hay suficientes productos disponibles.");
            }
            
            
            prodExistente.setCantidadProducto(prodExistente.getCantidadProducto() - cantidad);
            
            // Guardar los cambios
            Singleton.getInstancia().escribirObjecto();
            return true;
        }
    }
    return false;
}
public double calcularPrecioTotalCompra(int idVenta, int puntos) {
    double precioTotal = 0.0;

    // Calcular el precio total de todos los productos con el mismo idVenta
    for (Venta venta : listaVenta) {
        if (venta.getIdVenta() == idVenta) {
            Producto producto = venta.getProducto();
            if (producto != null) {
                double precioUnitario = producto.getPrecioUnitario();
                int cantidad = venta.getCantidadProducto();
                precioTotal += precioUnitario * cantidad;
            }
        }
    }

    // Aplicar el descuento basado en los puntos
    if (puntos >= 100) {
        int cantidadDescuentos = puntos / 100;
        double descuento = cantidadDescuentos * 0.10 * precioTotal;
        precioTotal -= descuento;
    }

    return precioTotal;
}

private Cliente obtenerClientePorVenta(int idVenta) {
    for (Venta venta : listaVenta) {
        if (venta.getIdVenta() == idVenta) {
            return venta.getCliente();
        }
    }
    return null;
}


// Método para obtener un producto por su ID desde listaProductos
private Producto obtenerProductoPorId(int idProducto) {
    for (Producto producto : listaProducto) {
        if (producto.getIdProducto() == idProducto) {
            return producto;
        }
    }
    return null; // Retorna null si no se encuentra el producto con el ID dado
}
public ArrayList<Venta> obtenerFacturasPorCliente(String nombreUsuario) {
    ArrayList<Venta> facturasCliente = new ArrayList<>();
    for (Venta factura : listaVenta) {
        if (factura.getCliente().equals(nombreUsuario)) {
            facturasCliente.add(factura);
        }
    }
    return facturasCliente;
}
}
