//Clase principal

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lectura2v2 {

    public static void main(String[] args) {

        ObjectInputStream entrada = null;
        Persona p;

        try {
        	
            entrada = new ObjectInputStream(new FileInputStream("Fichero\\personas.dat"));
            p = (Persona) entrada.readObject(); //es necesario el casting
            while (true) {
            	System.out.println(p.getNif() + " " + p.getNombre() + " " + p.getEdad());
            	p= (Persona) entrada.readObject();
            }
            
            
            
       
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("clase no encontrado");
        }catch (EOFException eof) {
        	System.out.println("Ya no hay mas ficheros , Final del fichero");
        }
        
        
        
        catch (IOException e) {
            System.out.println("Ocurrió un error de e/s ");
        } finally {
            try {
   
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}