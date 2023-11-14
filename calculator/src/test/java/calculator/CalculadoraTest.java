package calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
		
		private Calculadora calculadora = new Calculadora();

	    @Test
	    public void testSubtrairInteiros() {
	        assertEquals(4, calculadora.subtrairInteiros(6, 2));
	    }
	    @Test
	    public void testMultiplicarInteiros() {
	        assertEquals(15, calculadora.multiplicarInteiros(3, 5));
	    }
	    @Test
	    public void testDividirInteiros() {
	        assertEquals(3, calculadora.dividirInteiros(9, 3));
	    }
	    @Test
	    public void testDividirInteirosPorZero() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            calculadora.dividirInteiros(10, 0);
	        });
	    }
		@Test
		void doisSomaDoisEsperaQuatro() {
			assertEquals(4, calculadora.SomaInteiros(2, 2));
		}
		@Test
		void tresSomaSeteEsperaDez() {
			assertTrue(calculadora.SomaInteiros(3, 7)==10);
			
		}
	

}
