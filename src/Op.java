import java.util.Scanner;

public class Op implements Calculadora {


	
	public Op() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public int suma(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int resta(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiplicacion(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	public double operar(String n){
		
		/**
		String Operator = "";
		int numero1 = 0;
		int numero2 =0;
		double result = 0;
		char c;
		numero1 = 0;
		numero2 = 0;
		*/
		
		StackArrayList datos = new StackArrayList();
		Scanner lector = new Scanner(n);
		
		while(lector.hasNext()){
			if(lector.hasNextInt()){
				datos.push(lector.nextInt());
			}
			else{
				int numero1, numero2;
				numero1 = (int) datos.pop();
				numero2 = (int) datos.pop();
				String operando = lector.next();
				
				switch (operando){
				case "+": 
					datos.push(suma(numero1, numero2));
					break;
				case "-": 
					datos.push(resta(numero1, numero2));
				}
				
			}
		}
	
		double respuesta = (int) datos.pop();
		return respuesta;
	
		
	}

}
