package ejercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ejercicio9 {

	public static boolean sonIdenticos(File fichero1, File fichero2) throws IOException {

		if (fichero1.length() != fichero2.length()) {
			return false;
		}
		try (InputStream inputStream1 = new FileInputStream(fichero1);
				InputStream inputStream2 = new FileInputStream(fichero2)) {
			int byte1, byte2;
			do {
				byte1 = inputStream1.read();
				byte2 = inputStream2.read();
			} while (byte1 == byte2 && byte1 != -1);
			return byte1 == byte2;
		}

	}
	public static void main(String[] args) throws IOException {
		
		File fichero = new File("Fichero\\anass.txt");
		File fichero2 = new File("Fichero\\anass1.txt");
		sonIdenticos(fichero , fichero2 );
	}

}
