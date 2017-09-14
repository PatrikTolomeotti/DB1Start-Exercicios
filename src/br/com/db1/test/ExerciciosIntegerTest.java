package br.com.db1.test;

import static org.junit.Assert.*;
import org.junit.Test;

import br.com.db1.ExerciciosInteger;

public class ExerciciosIntegerTest {

	private ExerciciosInteger exerciciosInteger = new ExerciciosInteger();

	@Test
	public void somarTest() {
		assertTrue(2 == exerciciosInteger.somar(1, 1));
	}

	@Test
	public void subtrairTest() {
		assertTrue(1 == exerciciosInteger.subtrair(2, 1));
	}

	@Test
	public void multiplicarTest() {
		assertTrue(4 == exerciciosInteger.multiplicar(2, 2));
	}

	@Test
	public void dividirTest() {
		assertTrue(5 == exerciciosInteger.dividir(10, 2));
	}

	@Test
	public void checarParTest() {
		assertTrue(true == exerciciosInteger.checarPar(2));
	}

	@Test
	public void numeroMaiorTest() {
		assertTrue(true == exerciciosInteger.numeroMaior(3, 2));
	}
	
	@Test
	public void imparesAteCemTest() {
		assertTrue(5 == exerciciosInteger.imparesAteCem(90));
	}
}
