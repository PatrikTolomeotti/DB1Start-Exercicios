package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosDouble;

public class ExerciciosDoubleTest {
	
	private ExerciciosDouble exerciciosDouble = new ExerciciosDouble();
	
	@Test
	public void menorDoubleTest(){
		Assert.assertTrue(1.1 == exerciciosDouble.menorDouble(1.1,1.2));
	}
	
	@Test
	public void menorDoubleEntreTresTest(){
		Assert.assertTrue(1.2 == exerciciosDouble.menorDoubleEntreTres(1.2,1.3,1.4));
		Assert.assertTrue(1.2 == exerciciosDouble.menorDoubleEntreTres(1.3,1.2,1.4));
		Assert.assertTrue(1.2 == exerciciosDouble.menorDoubleEntreTres(1.4,1.3,1.2));
	}
	
	@Test
	public void mediaDeTresNumerosTest(){
		Assert.assertEquals((Double)3.3d,exerciciosDouble.mediaDeTresNumeros(3.3, 3.3, 3.3));
		Assert.assertEquals((Double)6.6d,exerciciosDouble.mediaDeTresNumeros(6.6, 6.6, 6.6));
		Assert.assertEquals((Double)9.9d,exerciciosDouble.mediaDeTresNumeros(9.9, 9.9, 9.9));
	}
	
	@Test
	public void calcularAreaTrianguloTest(){
		Assert.assertTrue(1.0 == exerciciosDouble.calcularAreaTriangulo(2.0, 1.0));
	}
}
