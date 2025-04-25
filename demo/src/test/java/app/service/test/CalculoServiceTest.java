package app.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import app.service.CalculoService;

@SpringBootTest
public class CalculoServiceTest {
	
	@Autowired
	CalculoService calculoService;

	// Testes para soma()
	@Test
	@DisplayName("Cena 01 - Testando soma com números positivos")
	void cenario01() {
		List<Integer> lista = new ArrayList<>();
		lista.add(3);
		lista.add(5);
		lista.add(2);
		assertEquals(10, this.calculoService.soma(lista));
	}

	@Test
	@DisplayName("Cena 02 - Testando soma com números negativos")
	void cenario02() {
		List<Integer> lista = new ArrayList<>();
		lista.add(-3);
		lista.add(-5);
		lista.add(-2);
		assertEquals(-10, this.calculoService.soma(lista));
	}

	@Test
	@DisplayName("Cena 03 - Testando soma com valores nulos")
	void cenario03() {
		List<Integer> lista = new ArrayList<>();
		lista.add(3);
		lista.add(null);
		lista.add(2);
		assertThrows(RuntimeException.class, () -> this.calculoService.soma(lista));
	}

	// Testes para mediana()
	@Test
	@DisplayName("Cena 04 - Testando mediana com número ímpar de elementos")
	void cenario04() {
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(3);
		lista.add(5);
		assertEquals(3, this.calculoService.mediana(lista));
	}

	@Test
	@DisplayName("Cena 05 - Testando mediana com número par de elementos")
	void cenario05() {
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(3);
		lista.add(5);
		lista.add(7);
		assertEquals(4, this.calculoService.mediana(lista));
	}

	@Test
	@DisplayName("Cena 06 - Testando mediana com elementos iguais")
	void cenario06() {
		List<Integer> lista = new ArrayList<>();
		lista.add(3);
		lista.add(3);
		lista.add(3);
		assertEquals(3, this.calculoService.mediana(lista));
	}

	// Testes para maior()
	@Test
	@DisplayName("Cena 07 - Testando maior valor em lista com números positivos")
	void cenario07() {
		List<Integer> lista = new ArrayList<>();
		lista.add(3);
		lista.add(5);
		lista.add(2);
		assertEquals(5, this.calculoService.maior(lista));
	}

	@Test
	@DisplayName("Cena 08 - Testando maior valor em lista com números negativos")
	void cenario08() {
		List<Integer> lista = new ArrayList<>();
		lista.add(-3);
		lista.add(-5);
		lista.add(-2);
		assertEquals(-2, this.calculoService.maior(lista));
	}

	@Test
	@DisplayName("Cena 09 - Testando maior valor em lista com números iguais")
	void cenario09() {
		List<Integer> lista = new ArrayList<>();
		lista.add(3);
		lista.add(3);
		lista.add(3);
		assertEquals(3, this.calculoService.maior(lista));
	}

	// Testes para menor()
	@Test
	@DisplayName("Cena 10 - Testando menor valor em lista com números positivos")
	void cenario10() {
		List<Integer> lista = new ArrayList<>();
		lista.add(3);
		lista.add(5);
		lista.add(2);
		assertEquals(2, this.calculoService.menor(lista));
	}

	@Test
	@DisplayName("Cena 11 - Testando menor valor em lista com números negativos")
	void cenario11() {
		List<Integer> lista = new ArrayList<>();
		lista.add(-3);
		lista.add(-5);
		lista.add(-2);
		assertEquals(-5, this.calculoService.menor(lista));
	}

	@Test
	@DisplayName("Cena 12 - Testando menor valor em lista com números iguais")
	void cenario12() {
		List<Integer> lista = new ArrayList<>();
		lista.add(3);
		lista.add(3);
		lista.add(3);
		assertEquals(3, this.calculoService.menor(lista));
	}

	// Testes para numElementos()
	@Test
	@DisplayName("Cena 13 - Testando número de elementos com lista positiva")
	void cenario13() {
		List<Integer> lista = new ArrayList<>();
		lista.add(3);
		lista.add(5);
		lista.add(2);
		assertEquals(3, this.calculoService.numElementos(lista));
	}

	@Test
	@DisplayName("Cena 14 - Testando número de elementos com lista negativa")
	void cenario14() {
		List<Integer> lista = new ArrayList<>();
		lista.add(-3);
		lista.add(-5);
		lista.add(-2);
		assertEquals(3, this.calculoService.numElementos(lista));
	}

	// Testes para moda()
	@Test
	@DisplayName("Cena 16 - Testando moda com valores repetidos")
	void cenario16() {
		List<Integer> lista = new ArrayList<>();
		lista.add(3);
		lista.add(3);
		lista.add(2);
		assertEquals(3, this.calculoService.moda(lista));
	}

	@Test
	@DisplayName("Cena 17 - Testando moda com elementos diferentes")
	void cenario17() {
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		assertEquals(1, this.calculoService.moda(lista)); // Retorna o primeiro encontrado
	}

	@Test
	@DisplayName("Cena 18 - Testando moda com uma única moda")
	void cenario18() {
		List<Integer> lista = new ArrayList<>();
		lista.add(3);
		lista.add(3);
		lista.add(3);
		lista.add(2);
		assertEquals(3, this.calculoService.moda(lista));
	}

	// Testes para primeiro()
	@Test
	@DisplayName("Cena 19 - Testando primeiro valor com lista positiva")
	void cenario19() {
		List<Integer> lista = new ArrayList<>();
		lista.add(3);
		lista.add(5);
		lista.add(2);
		assertEquals(3, this.calculoService.primeiro(lista));
	}

	@Test
	@DisplayName("Cena 20 - Testando primeiro valor com lista negativa")
	void cenario20() {
		List<Integer> lista = new ArrayList<>();
		lista.add(-3);
		lista.add(-5);
		lista.add(-2);
		assertEquals(-3, this.calculoService.primeiro(lista));
	}

	@Test
	@DisplayName("Cena 21 - Testando primeiro valor com lista de 1 elemento")
	void cenario21() {
		List<Integer> lista = new ArrayList<>();
		lista.add(3);
		assertEquals(3, this.calculoService.primeiro(lista));
	}

	// Testes para ultimo()
	@Test
	@DisplayName("Cena 22 - Testando último valor com lista positiva")
	void cenario22() {
		List<Integer> lista = new ArrayList<>();
		lista.add(3);
		lista.add(5);
		lista.add(2);
		assertEquals(2, this.calculoService.ultimo(lista));
	}

	@Test
	@DisplayName("Cena 23 - Testando último valor com lista negativa")
	void cenario23() {
		List<Integer> lista = new ArrayList<>();
		lista.add(-3);
		lista.add(-5);
		lista.add(-2);
		assertEquals(-2, this.calculoService.ultimo(lista));
	}

	@Test
	@DisplayName("Cena 24 - Testando último valor com lista de 1 elemento")
	void cenario24() {
		List<Integer> lista = new ArrayList<>();
		lista.add(3);
		assertEquals(3, this.calculoService.ultimo(lista));
	}
}
