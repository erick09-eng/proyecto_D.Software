/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author ANDRES FELIPE
 */
public class ClienteNoAutorizadoException extends Exception {
    public ClienteNoAutorizadoException(String mensaje) {
        super(mensaje);
    }
}
