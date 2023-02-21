package ejercicios;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ejercicio7 {
	static Scanner s = new Scanner(System.in);

	public static void insertar(String nombre1) {
		try {
			String cadena = "1 Agosto 2021";
			DataOutputStream dis = new DataOutputStream(new FileOutputStream("Nombres\\" + nombre1 + ".dat"));
			dis.writeUTF(cadena);
			for (int i = 0; i < 23; i++) {
				dis.writeInt(i);
			}
			dis.close();
		} catch (Exception e) {
			System.out.println("Ocurrio un problema en el metodo " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Introduce el nombre del nuevo fichero: ");
		String nombre = s.nextLine();
		insertar(nombre);

		
		
		
	}

}
