import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	 private static Scanner s;
	 
	private static final String FILENAME = "C:/Users/Cristian/Desktop/Prueba.txt";
	private static String sCurrentLine;
	
	public static void main(String[] args) {
		

	    s = new Scanner(System.in);
	    System.out.println("Bienvenido al programa de calculadora!");
	    

		BufferedReader br = null;
		FileReader fr = null;

	

			try {
				fr = new FileReader(FILENAME);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			br = new BufferedReader(fr);

			

			try {
				br = new BufferedReader(new FileReader(FILENAME));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				sCurrentLine = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			//primer numero
		System.out.println(sCurrentLine);
		String a =sCurrentLine.trim();
		System.out.println(a);
		char[] b = a.toCharArray();
		char c = b[0];
		System.out.println(c);
		int juan = Integer.parseInt((String.valueOf(c)));
		System.out.println(juan);
		
		char d = b[2];
		System.out.println(d);
		int dos = Integer.parseInt((String.valueOf(d)));
		
		char e = b[4];
				System.out.println(e);
				String operador = String.valueOf(e);
				if(operador == "+"){
					System.out.println(operador);
					int solucion = juan+dos;
					System.out.println(solucion);
				}
			
				
				
			
				
	}

}
	
