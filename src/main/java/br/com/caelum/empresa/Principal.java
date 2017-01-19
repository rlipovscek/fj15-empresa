package br.com.caelum.empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.empresa.modelo.Funcionario;

public class Principal {
public static void main(String[] args) {
	Calendar dataNascimento = new GregorianCalendar(1987, 9, 9);
	Funcionario funcionario = new Funcionario("Rodolpho", 25, dataNascimento);
	
	new Funcionario("ee", 23, dataNascimento);
	
}
}
