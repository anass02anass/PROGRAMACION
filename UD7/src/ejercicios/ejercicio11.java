package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class ejercicio11 {

	public static void main(String[] args) {
		try {
			String ruta1 = "Fichero\\anass.txt";
			String ruta2 = "Fichero\\anass1.txt";
			String ruta3 = "Fichero\\anass2.txt";

			BufferedReader bfr1 = new BufferedReader(new FileReader(ruta1));
			BufferedReader bfr2 = new BufferedReader(new FileReader(ruta2));

			TreeSet<String> arr = new TreeSet<String>();
			while ((ruta1 = bfr1.readLine()) != null && (ruta2 = bfr2.readLine()) != null) {
				arr.add(ruta1);
				arr.add(ruta2);
				BufferedWriter bfw3 = new BufferedWriter(new FileWriter(ruta3));
				bfw3.write(ruta1);
				bfw3.write("\n");
				bfw3.write(ruta2);
				bfw3.close();

			}

		} catch (IOException ioe) {
			System.out.println(" occurio un error" + ioe.getMessage());
		}

	}

}
