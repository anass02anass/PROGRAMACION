package ejercicios;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio8 {

	static Scanner sc = new Scanner(System.in);

	public static void ingresar(String n ) throws IOException {
	double max = 0, min = 0,media = 0, suma = 0;
	int contador = 0;
	DataInputStream dis ; 
	
	try {
	
	dis = new DataInputStream(new FileInputStream("Nombres\\"+n+".dat"));	
	String s =dis.readUTF();
	System.out.println(s+"\n");
	int i ; 
	double d ;
	while (true) {
		i = dis.readInt();
		d= dis.readDouble();
		System.out.println("hora :"+i+"- temperatura "+d);
		if(max <d) {
			max=d;
		}
		if(min>d) {
			min = d ;
		}
		suma = suma +d;
		contador ++;
		
	}
	}catch(EOFException eof ) {
		System.out.println("fina del fichero");
	}
	}

	public static void main(String[] args) throws IOException {
		System.out.println("introduce el nombre del fichero :");
		String nombre = sc.nextLine( );
		ingresar(nombre);
	}

}
