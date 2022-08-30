package examen1;

import java.util.Scanner;

public class pregunta1 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num , contador  = 0 , suma = 0  ;
		System.out.println("introduce cuantos números desea obtener :");
		num = sc.nextInt();
		
		for ( int i =1;i<num;i++) {
			suma = suma+i;
			contador ++;
				System.out.println("el triangular de n  "+contador + " es "+suma );
		}
		
	}

}
