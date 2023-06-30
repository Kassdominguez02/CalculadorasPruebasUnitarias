package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculadoraTestCase {

	@Test
	void testSumar() {
		int resultado= Calculadora.suma(2,3); 
		
		// para esta prueba, espero que la suma de 5
		Assert.assertEquals(5,resultado); // lo que espero y lo que tengo
		// se puede quitar la palabra assert del inicio
		
	}//testSumar
	
	@Test
	void testMultiplicar() {
		int resultado=Calculadora.multiplicar(2, 3);
		Assert.assertEquals(6, resultado);
	}
	
	@Test
	void testDividir() {
		float resultado=Calculadora.dividir(6.0f, 2.0f);
		assertEquals(3.0,resultado);
		
	}//Test Dividir

}//clase
