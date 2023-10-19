package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.CiudadesService;

class TestCiudadesService {
	CiudadesService service;//Declaramos
	@BeforeEach
	void setUp() throws Exception {
		service=new CiudadesService();//Iniciamos la lista antes de cada prueba
		service.nuevaCiudad("c1", "p1", 100_000, 23.5);
		service.nuevaCiudad("c2", "p1", 200_000, 15.4);
		service.nuevaCiudad("c3", "p2", 800_000, 22.0);
		service.nuevaCiudad("c4", "p2", 70_000, 19.4);
		service.nuevaCiudad("c5", "p2", 140_000, 15.6);
	}

	@Test
	void testExisteCiudadTempInf() {
		assertTrue(service.existeCiudadTempInf(20));
		assertFalse(service.existeCiudadTempInf(5));
	}

	@Test
	void testCiudadMasPoblada() {
		assertEquals("c3", service.ciudadMasPoblada().getNombre());
	}
	
	@Test
	void testTotalPaises() {
		assertEquals(2, service.totalPaises());
	}
	
	@Test
	void testMediaHabitantesPorPais() {
		assertEquals(150_000, service.mediaHabitantesPorPais("p1"),0.5);//assertEquals(double, double,delta)para ajustar la respuesta
	}
	
	@Test
	void testTempMaxima() {
		assertEquals(23.5, service.temperaturaMasAlta());
	}

}
