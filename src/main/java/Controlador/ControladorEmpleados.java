/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Empleados;

import Singleton.Singleton;
import excepciones.ContraseñaInvalidaException;
import excepciones.NombreInvalidoException;
import java.util.ArrayList;

/**
 *
 * @author ANDRES FELIPE
 */
public class ControladorEmpleados {
    private ArrayList<Empleados> listaEmpleados;

    public ControladorEmpleados() {
        listaEmpleados = Singleton.getInstancia().getListaEmpleados();
    }

    public boolean guardar(Empleados empleado) throws NombreInvalidoException, ContraseñaInvalidaException {
         for (Empleados personaExistente : listaEmpleados) {
        if (personaExistente.getNombre().equals(empleado.getNombre()) &&
            personaExistente.getRol().equals(empleado.getRol())) {
            throw new NombreInvalidoException("Ya existe un usuario con el mismo nombre y rol. Por favor ingrese un nombre o rol diferente.");
        }
    }
         String contraseña = empleado.getContraseña();
    if (!(contraseña.matches(".*[a-zA-Z]+.*") && contraseña.matches(".*\\d+.*"))) {
        throw new ContraseñaInvalidaException("La contraseña debe contener al menos una letra y al menos un número.");
    }
        listaEmpleados.add(empleado);
        Singleton.getInstancia().agregarEmpleado(empleado);
        return true;
    }

    public Empleados buscarPersonaPorNombre(String nombreUsuario) {
        for (Empleados persona : listaEmpleados) {
            if (persona.getNombre().equals(nombreUsuario)) {
                return persona;
            }
        }
        return null;
    }

    public ArrayList<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }

}
