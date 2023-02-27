package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio16 {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Cliente> arr = new ArrayList<Cliente>();

	public static void menu() {
		int opcion = 0;

		while (opcion != 6) {
			System.out.println("Por favor introduzca un numero :");
			System.out.println("1-Añadir clientes ");
			System.out.println("2-Consultar clinetes ");
			System.out.println("3-consultar clientes morosos");
			System.out.println("4-modificar clientes");
			System.out.println("5-borrar Clientes por NIF");
			System.out.println("6-Guardar Clientes y salir del programa");
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 1:

				añadirCliente();
				break;

			case 2:
				ConsultarClientes();
				break;
			case 3:
				ConsultarClientesMor();
				
			case 4:
			case 5:
			case 6:
			}

		}

		System.out.println("Fin del programa");
	}

	public static void añadirCliente() {
		System.out.println(" nombre del cliente ");
		String nombre = sc.nextLine();
		System.out.println("numero del telefono ");
		String tele = sc.nextLine();
		System.out.println("direccion ");
		String dir = sc.nextLine();
		System.out.println("Introduzca el nif ");
		String nif = sc.nextLine();
		System.out.println("es moroso (true/false)");
		boolean moroso = sc.nextBoolean();
		 Cliente cli = new Cliente(nombre, tele, dir, nif, moroso);
		for (Cliente cliente : arr) {
			if (cliente.getNif().equalsIgnoreCase(cli.getNif()))
				System.out.println("el cliente ya existe ");
			else
				arr.add(cli);
		}

	}

	public static void ConsultarClientes() {
		for (Cliente cliente : arr) {
			System.out.println(cliente.toString());
		}
	}
	public static void ConultarClientesMor() {
		Cliente cl = new Cliente ();
		System.out.println("Morosos");
		for (Cliente cliente : arr) {
			if(cl.isMoroso()==true)
				System.out.println(cliente);
		}
	}

	public static void main(String[] args) {
		menu();

	}

}
