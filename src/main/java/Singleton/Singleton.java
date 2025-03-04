/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import Modelo.Cliente;
import Modelo.Empleados;
import Modelo.Factura;
import Modelo.Producto;
import Modelo.Venta;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author ANDRES FELIPE
 */
public class Singleton {

    private static final Singleton INSTANCIA = new Singleton();
    private ArrayList<Factura> listaFactura;
    private ArrayList<Empleados> listaEmpleados;
    private ArrayList<Cliente> listaCliente;
    private ArrayList<Venta> listaVentas;
    private ArrayList<Producto> listaProducto;

    private Singleton() {
        listaEmpleados = leerEmpleados();
        listaCliente = leerCliente();
        listaVentas = leerVentas();
        listaProducto = leerProducto();
        listaFactura = leerFactura();
    }

    public static Singleton getInstancia() {
        return INSTANCIA;
    }

    public ArrayList<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Factura> getListaFactura() {
        return listaFactura;
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public ArrayList<Venta> getListaVenta() {
        return listaVentas;
    }

    public ArrayList<Producto> getListaProducto() {
        return listaProducto;
    }
//     public void agregaventa (Venta venta) {
//        listaEmpleados.add(venta);
//        escribirEmpleados();
//    }

    public void agregarProducto(Producto producto) {
        listaProducto.add(producto);
        escribirEmpleados();
    }

    public void agregarEmpleado(Empleados empleado) {
        listaEmpleados.add(empleado);
        escribirEmpleados();
    }

    private void escribirEmpleados() {
        try (ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("Empleados.dat"))) {
            escritor.writeObject(listaEmpleados);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private ArrayList<Empleados> leerEmpleados() {
        try (ObjectInputStream lector = new ObjectInputStream(new FileInputStream("Empleados.dat"))) {
            return (ArrayList<Empleados>) lector.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void escribirObjectoCliente() {
        try {
            FileOutputStream archivo
                    = new FileOutputStream("Cliente.dat");
            ObjectOutputStream escritor
                    = new ObjectOutputStream(archivo);
            escritor.writeObject(listaCliente);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Cliente> leerCliente() {
        try {
            FileInputStream archivo
                    = new FileInputStream("Cliente.dat");
            ObjectInputStream lector
                    = new ObjectInputStream(archivo);
            return (ArrayList<Cliente>) lector.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }

//    private void escribirVenta() {
//        try (ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("Venta.dat"))) {
//            escritor.writeObject(listaVentas);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    private ArrayList<Venta> leerVentas() {
//        try (ObjectInputStream lector = new ObjectInputStream(new FileInputStream("Venta.dat"))) {
//            return (ArrayList<Venta>) lector.readObject();
//        } catch (FileNotFoundException e) {
//            return new ArrayList<>();
//        } catch (IOException | ClassNotFoundException ex) {
//            ex.printStackTrace();
//            return new ArrayList<>();
//        }
//    }
    private void escribirProducto() {
        try (ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("Producto.dat"))) {
            escritor.writeObject(listaProducto);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private ArrayList<Producto> leerProducto() {
        try (ObjectInputStream lector = new ObjectInputStream(new FileInputStream("Producto.dat"))) {
            return (ArrayList<Producto>) lector.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void escribirObjecto() {
        try {
            FileOutputStream archivo
                    = new FileOutputStream("Producto.dat");
            ObjectOutputStream escritor
                    = new ObjectOutputStream(archivo);
            escritor.writeObject(listaProducto);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Producto> leerProductos() {
        try {
            FileInputStream archivo
                    = new FileInputStream("Personas.dat");
            ObjectInputStream lector
                    = new ObjectInputStream(archivo);
            return (ArrayList<Producto>) lector.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void escribirObjectoVenta() {
        try {
            FileOutputStream archivo
                    = new FileOutputStream("Venta.dat");
            ObjectOutputStream escritor
                    = new ObjectOutputStream(archivo);
            escritor.writeObject(listaVentas);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Venta> leerVentas() {
        try {
            FileInputStream archivo
                    = new FileInputStream("Venta.dat");
            ObjectInputStream lector
                    = new ObjectInputStream(archivo);
            return (ArrayList<Venta>) lector.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void escribirObjectoFactura() {
        try {
            FileOutputStream archivo
                    = new FileOutputStream("Factura.dat");
            ObjectOutputStream escritor
                    = new ObjectOutputStream(archivo);
            escritor.writeObject(listaFactura);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Factura> leerFactura() {
        try {
            FileInputStream archivo
                    = new FileInputStream("Factura.dat");
            ObjectInputStream lector
                    = new ObjectInputStream(archivo);
            return (ArrayList<Factura>) lector.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }
}
