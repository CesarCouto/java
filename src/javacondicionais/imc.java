package javacondicionais;

import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Qual a sua altura?");
		float altura = valor.nextFloat();
		
		System.out.println("Qual o seu peso?");
		float peso = valor.nextFloat();
		
		float imc = peso / (altura * altura);
		
		if(imc >= 40) {
			System.out.println("Obesidade grau 3 ou morbida");
		}else if(imc >= 35) {
			System.out.println("Obesidade grau 3");
		}else if(imc >= 30) {
			System.out.println("Obesidade grau 1");
		}else if(imc >= 25) {
			System.out.println("Sobrepeso");
		}else if(imc >= 18.5) {
			System.out.println("peso normal");
		}else {
			System.out.println("Abaixo do peso");
		}
		
		valor.close();

	}

}
