package ejercicios;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio5 {
//	public static void guardar(String cadena , String NombreArchivo) throws IOException {
//		FileWriter file = new FileWriter(NombreArchivo );
//		for(int i =cadena.length() -1; i>=0; i--) {
//			file.write(cadena.charAt(i));
//		}
//		System.out.println("cadena guardada al reves en el archivo "+NombreArchivo);
//		
//	}

	public static void main(String[] args) throws IOException {
			String cad = args[0];
	        StringBuilder builder = new StringBuilder(cad);
	        String cadRev = builder.reverse().toString();
	        String fich = args[1];
	        FileWriter fw = new FileWriter(fich);
	        fw.write(cadRev);
	        fw.close();
	    } 
}
