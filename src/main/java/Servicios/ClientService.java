package Servicios;

import java.sql.SQLException;

import Modelo.Cliente;
import Repositories.ClientRepo;
import Validator.ClientValidator;
import excepciones.ClienteNoAutorizadoException;
import excepciones.ContraseñaInvalidaException;
import excepciones.NombreInvalidoException;

public class ClientService {
	
	
	private ClientRepo clientRepo = new ClientRepo();

    public Cliente getClienteById(int id) throws SQLException {
        return clientRepo.findById(id);
    }

    public void createClient(String nombre, String contraseña) 
            throws SQLException, ClienteNoAutorizadoException, ContraseñaInvalidaException, NombreInvalidoException {
        if (!ClientValidator.validateNombre(nombre) || 
            !ClientValidator.validateContraseña(contraseña)) {
            throw new ClienteNoAutorizadoException("Cliente no autorizado");
            throw new ContraseñaInvalidaException("Contraseña erronea");
            throw new NombreInvalidoException("Nombre erroneo");
        }
        Cliente cliente = new Cliente(nombre,contraseña);
        clientRepo.guardar(cliente);
    }
    
    public void deleteClient(int id) throws SQLException {
        Cliente existingClient = clientRepo.findById(id);
        if (existingClient == null) {
            throw new SQLException("Cliente no encontrada");
        }
        clientRepo.eliminar(id);
    }

}
