package errores;

public class FaltaPagoException extends Exception {

	public String nombreUsaurio;
	
	public FaltaPagoException(String mensaje, String nombreUsuario) {
		super(mensaje);
		this.nombreUsaurio = nombreUsuario;
	}
	
}
