package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class ejercicio6 {

	public static void main(String[] args) throws IOException {
		String cad = args[0 ];
		String mayuscula = cad.toUpperCase();
		StringBuilder builder = new StringBuilder(mayuscula);
		String fich = args[1];
		BufferedWriter fw = new BufferedWriter(new FileWriter(fich));
		fw.write(mayuscula);
		fw.close( );
	
	}

}
