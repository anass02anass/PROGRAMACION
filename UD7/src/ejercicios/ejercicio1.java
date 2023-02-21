package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio1 {

	public static void calcularSumaYMedia(String nombreArchivo) throws NumberFormatException, IOException {
		BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
		double suma = 0;
		double contador = 0;
		String linea;
		while ((linea = lector.readLine()) != null) {
			double numero = Double.parseDouble(linea);
			suma = suma + numero;
			contador ++;
		}
		lector.close();

		if (contador == 0) {
			throw new ArithmeticException("El archivo está vacio ");
		}

		double media = suma / contador;
		System.out.println("la suma de los números en el archivo es " + suma);
		System.out.println("la media de los numeros en el archivo es " + media);

	}

	public static void main(String[] args) throws IOException  {
			String fl = "Nombres\\numero.txt";
			calcularSumaYMedia(fl);
		}
}
