package javacondicionais;

import java.util.Scanner;

public class mediaalunos {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Entre com a nota 1");
		double n1 = valor.nextDouble();
		
		System.out.println("Entre com a nota 2");
		double n2 = valor.nextDouble();
		
		System.out.println("Entre com a nota 3");
		double n3 = valor.nextDouble();
		
		System.out.println("Entre com a nota 4");
		double n4 = valor.nextDouble();
		
		double res = (n1 + n2 + n3 + n4)/4;
		
		System.out.println("A media do aluno é:" + res);
		
		if(res >= 6) {
			System.out.println("passou");
		}else if (res >= 5) {
			System.out.println("recuperação");
		}else {
			System.out.println("reprovou");
		}
				valor.close();
	}
	

}
