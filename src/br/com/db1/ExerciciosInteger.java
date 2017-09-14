package br.com.db1;

public class ExerciciosInteger {

	// Fun��o que soma dois numeros
	public Integer somar(Integer valor1, Integer valor2) {
		return valor1+valor2;
	}

	// Fun��o que subtrai dois numeros
	public Integer subtrair(Integer valor1, Integer valor2) {
		return valor1-valor2;
	}

	// Fun��o que multiplica dois numeros
	public Integer multiplicar(Integer valor1, Integer valor2) {
		return valor1*valor2;
	}

	// Fun��o que divide dois numeros
	public Integer dividir(Integer valor1, Integer valor2) {
		return valor1/valor2;
	}
	
	// Fun��o que diz se o n�mero � par
	public boolean checarPar(Integer valor1){
		if (valor1 % 2 == 0) {
			System.out.println("O numero " + valor1 + " � par");
			return true;
		}
		else {
		return false;
		}
	}
	
	// Fun��o que recebe dois n�meros e diz qual � o maior
	public boolean numeroMaior(Integer valor1, Integer valor2){
		if (valor1 > valor2){
			System.out.println(valor1+" � maior que " + valor2);
			return true;
		}
		else {
			System.out.println(valor2+" � maior que " + valor1);
			return false;
		}
	}

	// Fun��o que � partir de um valor inicial, mostra n�meros at� cem
	public Integer imparesAteCem(Integer valorInicial) {
		Integer quantidaDeImpares = 0;
		for (int numero = valorInicial; numero <= 100; numero++) {
			if(numero%2 !=0){
				System.out.println(numero);
				quantidaDeImpares++;
			}
		}
		return quantidaDeImpares;
	}
}