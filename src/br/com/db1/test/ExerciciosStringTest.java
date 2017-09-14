package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosString;

public class ExerciciosStringTest {
	
	ExerciciosString exerciciosString = new ExerciciosString();
	
	@Test
	public void letrasMaiusculasTest(){
		Assert.assertTrue("EXEMPLO".equals(exerciciosString.letrasMaiusculas("exemplo")));
	}
	
	@Test
	public void letrasMinusculasTest(){
		Assert.assertTrue("exemplo".equals(exerciciosString.letrasMinusculas("EXEMPLO")));
	}
	
	@Test
	public void retornarQuantidadeLetrasTest(){
		Assert.assertTrue(8 == exerciciosString.retornarQuantidadeLetras("DB1START"));
	}
	
	@Test
	public void retornarQuantidadeLetrasComEspacoTest(){
		Assert.assertTrue(10 == exerciciosString.retornarQuantidadeLetrasComEspaco(" DB1START "));
	}
	
	@Test
	public void retornarItem4ComQuantidadeItem3Test(){
		Assert.assertTrue(8 == exerciciosString.retornarItem4ComQuantidadeItem3(" DB1START "));
	}
	
	@Test
	public void retorna4PrimeirasLetrasNomeTest(){
		Assert.assertTrue("Patr".equals(exerciciosString.retorna4PrimeirasLetrasNome("Patrik Roger Pereira Tolomeotti")));
	}
	
	@Test
	public void retornaApartir3LetraNomeTest(){
		Assert.assertTrue("rik Roger Pereira Tolomeotti".equals(exerciciosString.retornaApartir3LetraNome("Patrik Roger Pereira Tolomeotti")));
	}
	
	@Test
	public void retorna4UltimasLetrasNomeTest(){
		Assert.assertTrue("otti".equals(exerciciosString.retorna4UltimasLetrasNome("Patrik Roger Pereira Tolomeotti")));
	}
	
	@Test
	public void recebeESubistituiTest() {
		Assert.assertTrue("ALUNO Roger Pereira Tolomeotti".equals(exerciciosString.recebeESubistitui("Patrik Roger Pereira Tolomeotti")));
	}
	
	@Test
	public void exibeTextoSeparadamenteTest() {
		Assert.assertTrue("banana\nmaçã\nmelancia".equals(exerciciosString.exibeTextoSeparadamente("banana, maçã, melancia")));
	}
	
	@Test
	public void exibeQuantidadeVogaisTextoTest() {
		Assert.assertTrue(3 == exerciciosString.exibeQuantidadeVogaisTexto("exemplo"));
	}
	
	@Test
	public void recebeTextoDevolveInvertidoTest() {
		Assert.assertTrue("olpmexe".equals(exerciciosString.recebeTextoDevolveInvertido("exemplo")));
	}
}