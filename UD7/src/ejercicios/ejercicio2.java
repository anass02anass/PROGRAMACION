package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio2 {

	public static void cuenteVocales(String nombre) throws IOException {
		BufferedReader lector = new BufferedReader(new FileReader(nombre));
		double suma = 0;
		String linea;
	int aux = 0;
		int contador = 0;
		while ((linea = lector.readLine()) != null) {
			if ((char) aux == 65 || (char) aux == 69 || (char) aux == 73 || (char) aux == 79 || (char) aux == 85
					|| (char) aux == 97 || (char) aux == 101 || (char) aux == 105 || (char) aux == 111
					|| (char) aux == 117) {
				contador++;
				
			}
			aux=lector.read();
			System.out.println("los vocales son " + contador);

		}
	}

	public static void main(String[] args) throws IOException {
		cuenteVocales("Nombres\\miguel.txt");

	}
}
