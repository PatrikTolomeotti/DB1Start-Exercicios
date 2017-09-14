package br.com.db1.test;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosData;

public class ExerciciosDataTest {

	Calendar calendario = Calendar.getInstance();
	ExerciciosData exerciciosData = new ExerciciosData();
	
	@Test
	public void identificarAnoBisextoTest(){
		Assert.assertTrue(true == exerciciosData.identificarAnoBisexto(2016));
	}
	
	@Test
	public void identificarDiaUtilTest(){
		calendario.set(2017, Calendar.SEPTEMBER, 2);
		Assert.assertTrue(true == exerciciosData.identificarDiaUtil(calendario));
	}
}
