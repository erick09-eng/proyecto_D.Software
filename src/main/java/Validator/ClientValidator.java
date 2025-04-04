package Validator;

public class ClientValidator {
	
		public static boolean validateNombre(String nombre) {
		return nombre != null && !nombre.trim().isEmpty();
		}
		
		public static boolean validateContraseña(String contraseña) {
		    return contraseña != null && contraseña.length() >= 8
		        && contraseña.matches(".*[A-Z].*")
		        && contraseña.matches(".*[a-z].*")
		        && contraseña.matches(".*\\d.*")
		        && contraseña.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
		}


}
