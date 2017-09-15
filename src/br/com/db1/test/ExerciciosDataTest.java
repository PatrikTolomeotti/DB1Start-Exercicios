package br.com.db1.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosData;

public class ExerciciosDataTest {

	ExerciciosData exerciciosData = new ExerciciosData();
	Calendar calendario = Calendar.getInstance();

	@Test
	public void identificarAnoBisextoTest() {
		Assert.assertTrue(true == exerciciosData.identificarAnoBisexto(2016));
	}

	@Test
	public void identificarDiasUteisTesT() {
		calendario.set(2017, Calendar.SEPTEMBER, 18);
		Assert.assertTrue(true == exerciciosData.identificarDiasUteis(calendario));
	}

	@Test
	public void retornaIdadeTest() {
		LocalDate dataNascimento = LocalDate.of(1997, 11, 27);
		LocalDate dataAtual = LocalDate.of(calendario.get(Calendar.YEAR), calendario.get(Calendar.MONTH), calendario.get(Calendar.DAY_OF_MONTH));
		Assert.assertTrue(19 == exerciciosData.retornaIdade(dataNascimento, dataAtual));
	}
	
	@Test
	public void quantidadeDiasEntreDuasDatasTest() {
		LocalDate primeiraData = LocalDate.of(2017, 11, 10);
		LocalDate segundaData = LocalDate.of(2016, 10, 1);
		Assert.assertEquals((Integer)9 , exerciciosData.quantidadeDiasEntreDuasDatas(primeiraData, segundaData));
		// Assert.assertTrue(9 == exerciciosData.quantidadeDiasEntreDuasDatas(primeiraData, segundaData));
	}
	
	@Test
	public void quantidadeMesesEntreDuasDatasTest() {
		LocalDate primeiraData = LocalDate.of(2017, 9, 1);
		LocalDate segundaData = LocalDate.of(2017, 11, 10);
		Assert.assertTrue(2 == exerciciosData.quantidadeMesesEntreDuasDatas(primeiraData, segundaData));
	}
	
	@Test
	public void quantidadeAnosEntreDuasDatasTest() {
		LocalDate primeiraData = LocalDate.of(2017, 9, 1);
		LocalDate segundaData = LocalDate.of(2017, 11, 10);
		Assert.assertTrue(1 == exerciciosData.quantidadeAnosEntreDuasDatas(primeiraData, segundaData));
	}
	
	@Test
	public void retornaDoubleDeDiferencaEntreDuasHorasDistintasTest() {
		LocalTime primeiraHora = LocalTime.of(10, 00);
		LocalTime segundaHora = LocalTime.of(14, 00);
		Assert.assertTrue(4.00 == exerciciosData.retornaDoubleDeDiferencaEntreDuasHorasDistintas(primeiraHora, segundaHora));
	}
}
