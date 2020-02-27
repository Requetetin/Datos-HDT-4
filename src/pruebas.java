import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pruebas {

	Calculadora calcu = new Calculadora();
	@Test
	void test() {
		int resultado = calcu.dividir(20, 5);
		int esperado = 4;
		assertEquals(esperado,resultado);
	}

}
