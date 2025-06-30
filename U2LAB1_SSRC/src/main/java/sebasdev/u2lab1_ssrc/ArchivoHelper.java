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
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
 
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
        
        public static <T> void guardarComoJSON(List<T> datos, String rutaArchivo) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(datos, writer);
            System.out.println("Datos guardados en JSON correctamente en: " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar como JSON: " + e.getMessage());
        }
    }
        public static List<Persona> cargarDesdeJSON(String rutaArchivo) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            Type listType = new TypeToken<List<Persona>>(){}.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo JSON: " + e.getMessage());
            return null;
        }
    }
}
