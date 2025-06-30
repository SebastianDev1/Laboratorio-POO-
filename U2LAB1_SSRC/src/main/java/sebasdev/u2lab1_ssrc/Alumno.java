
package sebasdev.u2lab1_ssrc;

/**
 *
 * @author sebas
 */
public class Alumno extends Persona {
	private String carrera;
	
        public Alumno(String cedula, String nombres, String correo, String carrera) {
    	super(cedula, nombres, correo);
    	this.carrera = carrera;
	}
	public String getCarrera() {
    	return carrera;
	}
	public void setCarrera(String carrera) {
    	this.carrera = carrera;
	}
	@Override
	public String getTipo() {
    	return "Alumno";
	}
}

