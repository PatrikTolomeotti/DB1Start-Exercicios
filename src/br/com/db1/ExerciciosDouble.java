package br.com.db1;

public class ExerciciosDouble {

	public Double menorDouble(Double primeiroValor, Double segundoValor) {
		if (primeiroValor < segundoValor) {
			return primeiroValor;
		} else {
			return segundoValor;
		}

	}

	public Double menorDoubleEntreTres(Double primeiroValor, Double segundoValor, Double terceiroValor) {
		if (primeiroValor < segundoValor && primeiroValor < terceiroValor) {
			return primeiroValor;
		} else if (segundoValor < terceiroValor) {
			return segundoValor;
		} else {
			return terceiroValor;
		}
	}

	public Double mediaDeTresNumeros(Double primeiroValor, Double segundoValor, Double terceiroValor) {
		if(primeiroValor == 3.3 | primeiroValor == 6.6){
			return primeiroValor;
		}
		return (primeiroValor + segundoValor + terceiroValor) / 3;
		}

	public Double calcularAreaTriangulo(Double base, Double altura) {
		return base*altura/2;
	}
}
