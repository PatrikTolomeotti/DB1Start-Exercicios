package br.com.db1;

public class ExerciciosInteger {

	// Função que soma dois numeros
	public Integer somar(Integer valor1, Integer valor2) {
		return valor1+valor2;
	}

	// Função que subtrai dois numeros
	public Integer subtrair(Integer valor1, Integer valor2) {
		return valor1-valor2;
	}

	// Função que multiplica dois numeros
	public Integer multiplicar(Integer valor1, Integer valor2) {
		return valor1*valor2;
	}

	// Função que divide dois numeros
	public Integer dividir(Integer valor1, Integer valor2) {
		return valor1/valor2;
	}
	
	// Função que diz se o número é par
	public boolean checarPar(Integer valor1){
		if (valor1 % 2 == 0) {
			System.out.println("O numero " + valor1 + " é par");
			return true;
		}
		else {
		return false;
		}
	}
	
	// Função que recebe dois números e diz qual é o maior
	public boolean numeroMaior(Integer valor1, Integer valor2){
		if (valor1 > valor2){
			System.out.println(valor1+" é maior que " + valor2);
			return true;
		}
		else {
			System.out.println(valor2+" é maior que " + valor1);
			return false;
		}
	}

	// Função que à partir de um valor inicial, mostra números até cem
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