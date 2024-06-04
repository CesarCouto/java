package javacondicionais;

import java.util.Scanner;

public class DiaSemana {
	
	

	public static void main(String[] args) {
		
		Scanner dia = new Scanner(System.in);

		System.out.println("Qual é o dia da semana?");
		
		int numero_dia = dia.nextInt();		
		String nome_dia;
		
		switch(numero_dia){
			case 1:nome_dia = "Domingo";
			break;
			case 2: nome_dia = "Segunda-feira";
			break;
			case 3: nome_dia = "Terça-feira";
			break;
			case 4: nome_dia = "Quarta-feira";
			break;
			case 5: nome_dia = "Quinta-feira";
			break;
			case 6: nome_dia = "Sexta-feira";
			break;
			case 7: nome_dia = "Sabado-feira";
			break;
			default: nome_dia = "Numero invalido";
		}
		
		System.out.println(nome_dia);
		
		dia.close();
		
	}

}
