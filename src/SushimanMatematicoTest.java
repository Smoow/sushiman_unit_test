import junit.framework.TestCase;
import org.junit.Rule;

import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.Arrays;
import java.util.Collections;


public class SushimanMatematicoTest extends TestCase {

	public void testEhPrimo() {
        // assert statements
        assertTrue(SushimanMatematico.ehPrimo(7));
        assertTrue(SushimanMatematico.ehPrimo(11));
		assertTrue(SushimanMatematico.ehPrimo(71));
		assertTrue(SushimanMatematico.ehPrimo(233));
		assertFalse(SushimanMatematico.ehPrimo(12));
		assertFalse(SushimanMatematico.ehPrimo(16));
		assertFalse(SushimanMatematico.ehPrimo(200));
		assertEquals("ehPrimo(400) deve retornar false", false, SushimanMatematico.ehPrimo(400));
		assertEquals("ehPrimo(73) deve retornar true", true, SushimanMatematico.ehPrimo(73));
	}

	public void testGetPrimos() {
		// assert statements
		assertAll("Teste unitário para a função getPrimos(0), getPrimos(1), getPrimos(15), getPrimos(19), getPrimos(22) e getPrimos(55)",
				() -> assertEquals(Arrays.asList(2, 3, 5, 7), SushimanMatematico.getPrimos(0)),
				() -> assertEquals(Arrays.asList(11, 13, 17, 19), SushimanMatematico.getPrimos(1)),
				() -> assertEquals(Arrays.asList(151, 157), SushimanMatematico.getPrimos(15)),
				() -> assertEquals(Arrays.asList(191, 193, 197, 199), SushimanMatematico.getPrimos(19)),
				() -> assertEquals(Arrays.asList(223, 227, 229), SushimanMatematico.getPrimos(22)),
				() -> assertEquals(Collections.singletonList(557), SushimanMatematico.getPrimos(55))
		);
	}

	public void testGetSuperPrimos() {
		// assert statements
		assertEquals("getSuperPrimos(-1) deve retornar vazio", Arrays.asList(), SushimanMatematico.getSuperPrimos(-1));
		assertEquals("getSuperPrimos(0) deve retornar vazio", Arrays.asList(), SushimanMatematico.getSuperPrimos(0));
		assertEquals("getSuperPrimos(1) deve retornar os super-primos de 1 digitos entre 1 e 9", Arrays.asList(2, 3, 5, 7), SushimanMatematico.getSuperPrimos(1));
		assertEquals("getSuperPrimos(2) deve retornar os super-primos de 2 digitos entre 10 e 99", Arrays.asList(23, 29, 31, 37, 53, 59, 71, 73, 79), SushimanMatematico.getSuperPrimos(2));
		assertEquals("getSuperPrimos(3) deve retornar os super-primos de 3 digitos entre 100 e 999", Arrays.asList(233, 239, 293, 311, 313, 317, 373, 379, 593, 599, 719, 733, 739, 797), SushimanMatematico.getSuperPrimos(3));
		assertEquals("getSuperPrimos(4) deve retornar os super-primos de 4 digitos entre 1000 e 9999", Arrays.asList(2333,2339,2393,2399,2939,3119,3137,3733,3739,3793,3797,5939,7193,7331,7333,7393), SushimanMatematico.getSuperPrimos(4));
		assertEquals("getSuperPrimos(5) deve retornar os super-primos de 5 digitos entre 10000 e 99999", Arrays.asList(23333, 23339, 23399, 23993, 29399, 31193, 31379, 37337, 37339, 37397, 59393, 59399, 71933, 73331, 73939), SushimanMatematico.getSuperPrimos(5));
		assertEquals("getSuperPrimos(6) deve retornar os super-primos de 6 digitos entre 100000 e 999999", Arrays.asList(233993, 239933, 293999, 373379, 373393, 593933, 593993, 719333, 739391, 739393, 739397, 739399), SushimanMatematico.getSuperPrimos(6));
		assertEquals("getSuperPrimos(7) deve retornar os super-primos de 5 digitos entre 1000000 e 9999999", Arrays.asList(2339933,2399333,2939999,3733799,5939333,7393913,7393931,7393933), SushimanMatematico.getSuperPrimos(7));
		assertEquals("getSuperPrimos(8) deve retornar os super-primos de 5 digitos entre 10000000 e 9999999", Arrays.asList(23399339,29399999,37337999,59393339,73939133), SushimanMatematico.getSuperPrimos(8));
		assertEquals("getSuperPrimos(9) deve retornar vazio", Collections.emptyList(), SushimanMatematico.getSuperPrimos(9));
	}

}
