/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Producto;
import Singleton.Singleton;
import excepciones.CodigoProductoDuplicadoException;
import java.util.ArrayList;

/**
 *
 * @author ANDRES FELIPE
 */
public class ControladorProducto {
    private ArrayList<Producto> listaProducto;

    public ControladorProducto() {
        listaProducto = Singleton.getInstancia().getListaProducto();
    }
    
    public ArrayList<Producto> getProducto() {
        return listaProducto;
    }
    
  public boolean GuardarProducto(Producto producto) throws CodigoProductoDuplicadoException {
    for (Producto prodExistente : listaProducto) {
        if (prodExistente.getCodigoProducto() == producto.getCodigoProducto()) {
            if (!prodExistente.getNombreProducto().equals(producto.getNombreProducto())) {
                throw new CodigoProductoDuplicadoException("El código de producto ya existe con un nombre diferente.");
            }
            prodExistente.setCantidadProducto(prodExistente.getCantidadProducto() + producto.getCantidadProducto());
            Singleton.getInstancia().escribirObjecto(); 
            return true;
        }
    }

    listaProducto.add(producto);
    Singleton.getInstancia().escribirObjecto(); 
    return true;
}
  
  public Producto BuscarProducto(int codigo){
      for (Producto persona : listaProducto) {
            if (persona.getCodigoProducto()==codigo) {
                return persona;
            }
        }
        return null;
    }
  
  public boolean EliminarProducto(int codigo){
      for(Producto producto:listaProducto){
          if(producto.getCodigoProducto()==codigo){
              listaProducto.remove(producto);
                Singleton.getInstancia().escribirObjecto();
              return true;
          }
      }
      return false;
  }
  
  public boolean EditarProducto(Producto nuevoProducto) {
    for (int i = 0; i < listaProducto.size(); i++) {
        Producto producto = listaProducto.get(i);
        if (producto.getCodigoProducto() == nuevoProducto.getCodigoProducto()) {
            listaProducto.set(i, nuevoProducto);
            Singleton.getInstancia().escribirObjecto();
            return true;
        }
    }
    return false;
}
}
