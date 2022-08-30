package examen1;

import java.util.Scanner;

public class pregunta2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero, maximo =0, contadorNumeros =0, contadorPares=0;
		System.out.println("Introduzca n�mero (0 para finalizar)");
		numero = s.nextInt();
		while (numero !=0) {
			contadorNumeros++;
			if (contadorNumeros==1)
					maximo = numero;
			else
				if (maximo<numero)
					maximo=numero;
			if (numero%2==0) {
				contadorPares++;
			}
			System.out.println("Introduzca numero (0 para finalizar)");
			numero = s.nextInt();
		}
		System.out.println("Total numeros: " + contadorNumeros);
		System.out.println("Total numeros pares: " + contadorPares);
		if (contadorNumeros==0)
			System.out.println("No existe maximo");
		else
			System.out.println("El maximo es: " + maximo);
			
	}

}
