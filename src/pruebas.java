import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pruebas {

	Array array = new Array();
	@Test
	void test() {
		int resultado = array.size();
		int esperado = 0;
		assertEquals(esperado,resultado);
	}

}
