/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sebasdev.u2lab1_ssrc;


import java.util.ArrayList;
import java.util.List;
public class GestorPersona {
	private List<Persona> lista;
	public GestorPersona() {
    	this.lista = new ArrayList<>();
	}
	public void agregarPersona(Persona p) {
    	lista.add(p);
	}
	public List<Persona> listarPersonas() {
    	return lista;
	}
	public boolean actualizarPersona(String cedula, Persona nuevaInfo) {
    	for (int i = 0; i < lista.size(); i++) {
        	if (lista.get(i).getCedula().equals(cedula)) {
            	lista.set(i, nuevaInfo);
            	return true;
        	}
    	}
    	return false;
	}
	public boolean eliminarPersona(String cedula) {
    	return lista.removeIf(p -> p.getCedula().equals(cedula));
	}
	public void guardarEnArchivo(String ruta) {
    	ArchivoHelper.guardarPersonasCSV(lista, ruta);
	}
	public void cargarDesdeArchivo(String ruta) {
    	lista = ArchivoHelper.cargarPersonasCSV(ruta);
	}
}

