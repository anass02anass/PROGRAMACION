package examen1;

import java.util.Scanner;

public class pregunta2_1 {

	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int max = 0,num ,contador = 0 , contadorPares = 0 ;
	System.out.println("introduzca un numero ( 0 para finalizar ):");
	num = sc.nextInt();
	while(num !=0 ) {
		
		contador++;
		if (contador == 1)
			max = num ;
		if (num>max)
			max = num 	;
		if ( num %2== 0 ) 
			contadorPares++;
	
		System.out.println("Introduzca numero (0 para finalizar)");
		num = sc.nextInt();
}
	System.out.println("Total números : "+contador);
	System.out.println("Total numeros pares :"+contadorPares);
	System.out.println("El maximo es "+max);
}
}
