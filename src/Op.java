import java.util.Scanner;

public class Op implements iCalculadora {


	
	public Op() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public double suma(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double resta(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double multiplicacion(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double division(double a, double b) {
		// TODO Auto-generated method stub
		return b/a;
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
				double numero1, numero2;
				numero1 = Double.parseDouble(datos.pop().toString());
				numero2 = Double.parseDouble(datos.pop().toString()) ;
				String operando = lector.next();
				
				switch (operando){
				case "+": 
					datos.push(suma(numero1, numero2));
					break;
				case "-": 
					datos.push(resta(numero1, numero2));
					break;
				case "*":
					datos.push(multiplicacion(numero1, numero2));
					break;
				case "/":
					datos.push(division(numero1, numero2));
					break;
				}
			}
		}
	
		double respuesta = (double) datos.pop();
		return respuesta;
	
		
	}

}
