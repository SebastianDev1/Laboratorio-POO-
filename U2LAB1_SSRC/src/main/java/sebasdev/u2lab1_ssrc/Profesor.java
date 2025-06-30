
package sebasdev.u2lab1_ssrc;

/**
 *
 * @author sebas
 */
public class Profesor extends Persona {
	private String titulo;
        
	public Profesor(String cedula, String nombres, String correo, String titulo) {
    	super(cedula, nombres, correo);
    	this.titulo = titulo;
	}
        
	public String getTitulo() {
    	return titulo;
	}
	public void setTitulo(String titulo) {
    	this.titulo = titulo;
	}
	
        @Override
	public String getTipo() {
    	return "Profesor";
	}
}

