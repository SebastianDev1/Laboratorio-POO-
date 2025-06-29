/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sebasdev.u2lab1_ssrc;

/**
 *
 * @author sebas
 */
import java.io.*;
import java.util.*;
 
public class ArchivoHelper {
 
	public static void guardarPersonasCSV(List<Persona> personas, String ruta) {
    	try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
        	for (Persona p : personas) {
            	if (p instanceof Alumno a) {
                	pw.println(a.getTipo() + ";" + a.getCedula() + ";" + a.getNombres() + ";" + a.getCorreo() + ";" + a.getCarrera());
            	} else if (p instanceof Profesor prof) {
                	pw.println(prof.getTipo() + ";" + prof.getCedula() + ";" + prof.getNombres() + ";" + prof.getCorreo() + ";" + prof.getTitulo());
            	}
        	}
    	} catch (IOException e) {
        	e.printStackTrace();
    	}
	}
	public static List<Persona> cargarPersonasCSV(String ruta) {
    	List<Persona> lista = new ArrayList<>();
    	File archivo = new File(ruta);
 
    	if (!archivo.exists()) {
        	System.out.println("No se encontró el archivo: " + ruta);
        	return lista;
    	}
    	try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
        	String linea;
        	while ((linea = br.readLine()) != null) {
            	String[] datos = linea.split(";");
            	switch (datos[0]) {
                	case "Alumno" -> lista.add(new Alumno(datos[1], datos[2], datos[3], datos[4]));
                	case "Profesor" -> lista.add(new Profesor(datos[1], datos[2], datos[3], datos[4]));
            	}
        	}
    	} catch (IOException e) {
        	e.printStackTrace();
    	}
        return lista;
	}
}
