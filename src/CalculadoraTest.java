/**
 * @author Cristian Pérez Carnet 16011
 * @author Jose Rodolfo Pérez Carnet 16056
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	
	/**
	 * Se hizo un junit test para suma, resta, multiplicacion y division en la calculadora que se llama Op
	 * Algo importante que hay en todos los métodos es que a la par de result está el 0.0, esto es porque
	 * con doubles pide especificar cantidad de decimales si no la prueba da error
	 */

	@Test
	public void testSuma() {
		
	iCalculadora test = new Op(); 
		double result = test.suma(5,2);
		
		assertEquals(7.0, result,0.0);
	}
	
	@Test
	public void testMultiplicacion() {
	iCalculadora test = new Op(); 
		double result = test.multiplicacion(3,8);
		
		assertEquals(24.0, result,0.0);
	}
	
	@Test
	public void testResta() {
	iCalculadora test = new Op(); 
		double result = test.resta(5,2);
		
		assertEquals(3.0, result,0.0);
	}
	
	@Test
	public void testDivision() {
	iCalculadora test = new Op(); 
		double result = test.division(2,9);
		
		assertEquals(4.5, result,0.0);
	}

}
