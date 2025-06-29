/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sebasdev.u2lab1_ssrc;

/**
 *
 * @author sebas
 */
public abstract class Persona {
	protected String cedula;
	protected String nombres;
	protected String correo;
	
        public Persona(String cedula, String nombres, String correo) {
    	this.cedula = cedula;
        this.nombres = nombres;
    	this.correo = correo;
	}
	
        public String getCedula() {
    	return cedula;
	}
	
        public String getNombres() {
    	return nombres;
	}
	
        public String getCorreo() {
    	return correo;
	}
	
        public void setCedula(String cedula) {
    	this.cedula = cedula;
	}
	
        public void setNombres(String nombres) {
    	this.nombres = nombres;
	}
	
        public void setCorreo(String correo) {
    	this.correo = correo;
	}
	
        public abstract String getTipo();
}

