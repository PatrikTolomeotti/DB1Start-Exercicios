package br.com.db1;

import java.text.DateFormat;
import java.util.Calendar;

public class ExerciciosData {

	public Boolean identificarAnoBisexto(Integer ano) {
		if(ano%400 == 0){
			return true;
		} else if(ano%4 == 0 && ano%100 !=0){
			return true;
		}
		else {
		return false;
		}
	}

	public Boolean identificarDiaUtil(Calendar calendario) {
		if(calendario.get(Calendar.DAY_OF_WEEK) == 6 && calendario.get(Calendar.DAY_OF_WEEK) == 7){
			return false;
		}
		else{
			return true;
		}
	}
}
