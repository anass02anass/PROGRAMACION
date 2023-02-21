import java.io.*;
//PASADO
public class EjemploEscrituradeByte0 {
	public static void main(String[] args) throws IOException 
	{
//		try {
//		FileOutputStream fos = null;
//			fos = new FileOutputStream("Nombres\\prueba.dat",true);
//			fos.write(67); fos.write(73); fos.write(67); fos.write(76);	fos.write(79);
//			fos.write(32); fos.write(68);fos.write(65); fos.write(77);
//			fos.close();
//		}catch ( IOException ioe ) {
//			System.out.println("ocurrio un error ");
//			System.out.println(ioe.getMessage ());
//		}
		
		FileInputStream fis = null ;
		int aux = 0;
		fis= new FileInputStream("D:\\Prueba.dat");
		aux=fis.read();
		
		while ( aux != -1 ) {
			System.out.println(aux+" - "+ (char) aux);
		}
//		while(aux = fis.read()!=-1)
//			System.out.println(aux +" - "+ (char) aux);
		
	fis.close();
	}
}

