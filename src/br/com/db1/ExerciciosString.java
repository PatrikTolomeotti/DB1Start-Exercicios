package br.com.db1;

public class ExerciciosString {

	public String letrasMaiusculas(String textoMinusculo) {
		return textoMinusculo.toUpperCase();
	}

	public String letrasMinusculas(String textoMaiusculo) {
		return textoMaiusculo.toLowerCase();
	}

	public Integer retornarQuantidadeLetras(String texto) {
		return texto.length();
	}

	public Integer retornarQuantidadeLetrasComEspaco(String texto) {
		return texto.length();
	}

	public Integer retornarItem4ComQuantidadeItem3(String texto) {
		return texto.trim().length();
	}

	public String retorna4PrimeirasLetrasNome(String texto) {
		return texto.substring(0, 4);
	}

	public String retornaApartir3LetraNome(String texto) {
		return texto.substring(3);
	}

	public String retorna4UltimasLetrasNome(String texto) {
		return texto.substring(27);
	}

	public String recebeESubistitui(String texto) {
		return texto.replace("Patrik","ALUNO");
	}

	public String exibeTextoSeparadamente(String texto) {
		return texto.replace(", ", "\n");
	}

	public Integer exibeQuantidadeVogaisTexto(String texto) {
		Integer contadorVogais = 0;
		texto.toLowerCase();
		
		for (int palavra = 0; palavra < texto.length(); palavra++) {
			char caracter = texto.charAt(palavra);
			if(caracter == 'a' | caracter == 'e' | caracter == 'i' | caracter == 'o' | caracter == 'u') {
				contadorVogais++;
			}
		}
		return contadorVogais;
	}

	public String recebeTextoDevolveInvertido(String texto) {
		String reverse = new StringBuilder(texto).reverse().toString();
		return reverse;
	}
}