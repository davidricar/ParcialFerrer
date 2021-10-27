package examen.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Datos {

	public static void escribirFichero(String ruta, String contenido) {
		try {
			BufferedWriter bufferedFile = new BufferedWriter(new FileWriter(ruta));
			bufferedFile.write(contenido);
			bufferedFile.flush();
			bufferedFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no se ha abrir");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al leer el archivo");
			e.printStackTrace();
		}
	}
	
	public static ArrayList<String> leerFichero(String ruta) {
		ArrayList<String> lineasFichero = new ArrayList<String>();
		try {
			BufferedReader bufferedFile = new BufferedReader(new FileReader(ruta));
			String linea = null;
			while((linea = bufferedFile.readLine()) != null) {
				lineasFichero.add(linea);
			}
			bufferedFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no se ha abrir");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al leer el archivo");
			e.printStackTrace();
		}
		return lineasFichero;
	}

}
