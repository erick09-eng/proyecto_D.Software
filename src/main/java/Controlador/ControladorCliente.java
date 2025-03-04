/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Producto;
import Modelo.Venta;
import Singleton.Singleton;
import excepciones.ContraseñaInvalidaException;
import excepciones.NombreInvalidoException;
import java.util.ArrayList;

/**
 *
 * @author ANDRES FELIPE
 */
public class ControladorCliente {
    private ArrayList<Cliente> listaCliente;

    public ControladorCliente() {
         listaCliente = Singleton.getInstancia().getListaCliente();
    }
    
     public ArrayList<Cliente> getCliente() {
        return listaCliente;
    }
     
    public boolean guardar(Cliente cliente) throws NombreInvalidoException, ContraseñaInvalidaException {
        // Verificar si el nombre de usuario ya existe en la lista
        for (Cliente personaExistente : listaCliente) {
            if (personaExistente.getNombre().equals(cliente.getNombre())) {
                throw new NombreInvalidoException("Ya existe un usuario con el mismo nombre. Por favor ingrese un nombre diferente.");
            }
        }

        // Validar la contraseña
        String contraseña = cliente.getContraseña();
        if (!(contraseña.matches(".*[a-zA-Z]+.*") && contraseña.matches(".*\\d+.*"))) {
            throw new ContraseñaInvalidaException("La contraseña debe contener al menos una letra y al menos un número.");
        }

        // Agregar el cliente a la lista y guardar
        listaCliente.add(cliente);
        Singleton.getInstancia().escribirObjectoCliente();
        return true;
    }
    
     public Cliente buscarPersonaPorNombre(String nombreUsuario) {
        for (Cliente persona : listaCliente) {
            if (persona.getNombre().equals(nombreUsuario)) {
                return persona;
            }
        }
        return null;
    }
    
}
