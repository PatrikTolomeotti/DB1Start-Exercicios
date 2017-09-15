package br.com.db1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class ExerciciosData {

	public Boolean identificarAnoBisexto(Integer ano) {
		if(ano%400 == 0 | ano%4 == 0 && ano%100 !=0){
			return true;
		}
		else {
		return false;
		}
	}

	public boolean identificarDiasUteis(Calendar calendario) {
		if((calendario.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) | (calendario.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)) {
			return false;
		}
		else {
			return true;
		}
	}

	public Integer retornaIdade(LocalDate dataNascimento, LocalDate dataAtual) {
		return Period.between(dataNascimento, dataAtual).getYears();
	}

	public Integer quantidadeDiasEntreDuasDatas(LocalDate primeiraData, LocalDate segundaData) {
		return Period.between(primeiraData, segundaData).getDays();
	}

	public Integer quantidadeMesesEntreDuasDatas(LocalDate primeiraData, LocalDate segundaData) {
		return Period.between(primeiraData, segundaData).getMonths();
	}

	public Integer quantidadeAnosEntreDuasDatas(LocalDate primeiraData, LocalDate segundaData) {
		return Period.between(primeiraData, segundaData).getYears();
	}

	public Double retornaDoubleDeDiferencaEntreDuasHorasDistintas(LocalTime primeiraHora, LocalTime segundaHora) {
		Double segundos = (double) Duration.between(primeiraHora, segundaHora).getSeconds();
		Double minutos = segundos/60;
		Double horas = minutos/60;
		return horas;
	}
}
