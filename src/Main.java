/**
 * @author Cristian Pérez Carnet 16011
 * @author Jose Rodolfo Pérez Carnet 16056
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	 
	//private static final String FILENAME = "C:/Users/Cristian/Desktop/Prueba.txt";
	//private static final String FILENAME = "C:/Users/Jose/Documents/GitHub/Hoja-2/src/Prueba.txt";
	
	public static void main(String[] args) throws IOException {
		
	    System.out.println("Bienvenido al programa de calculadora!");
		
		BufferedReader file = new BufferedReader(new FileReader("Prueba.txt"));
		
/**
 * crea la calculadora y llama al metodo de operación en ella
 */
		Op calculadora = new Op();
		String operacion = file.readLine();
		System.out.println(operacion);
		System.out.println(calculadora.operar(operacion));
		
		
		
			
				
	}

}
	
