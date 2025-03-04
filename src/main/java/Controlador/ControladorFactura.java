/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Factura;
import Singleton.Singleton;
import excepciones.ClienteNoAutorizadoException;
import java.util.ArrayList;

/**
 *
 * @author ANDRES FELIPE
 */
public class ControladorFactura {
    ArrayList<Factura> listaFactura;

    public ControladorFactura() {
        listaFactura = Singleton.getInstancia().getListaFactura();
    }
     public boolean GuardarHistorial(Factura Factura){
         listaFactura.add(Factura);
         Singleton.getInstancia().escribirObjectoFactura();
         return true;
     }
  public ArrayList<Factura> obtenerFacturasPorCliente(String nombreUsuario) {
    ArrayList<Factura> facturasCliente = new ArrayList<>();
    for (Factura factura : listaFactura) {
        if (factura.getCliente().getNombre().equals(nombreUsuario)) {
            facturasCliente.add(factura);
        }
    }
    return facturasCliente;
}
  
  public Factura Buscar (int Idventa){
      for(Factura factura: listaFactura){
          if(factura.getIdVenta()==Idventa){
              return factura;
              
          }
      }
      return null;
  }
  public ArrayList<Factura> obtenerFacturasPorIdVenta(int idVenta, String nombreUsuario) {
    ArrayList<Factura> facturasPorIdVenta = new ArrayList<>();
    for (Factura factura : listaFactura) {
        if (factura.getIdVenta() == idVenta) {
            facturasPorIdVenta.add(factura);
        }
    }
    return facturasPorIdVenta;
}

}
