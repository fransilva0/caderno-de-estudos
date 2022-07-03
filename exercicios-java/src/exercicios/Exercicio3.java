package exercicios;

import java.util.Scanner;

// Faça um Programa que peça as 4 notas bimestrais e mostre a média.

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("Digite a nota do " + i + "º bimestre");
			double nota = Double.parseDouble(sc.nextLine());
			
			soma += nota;
		}
		
		sc.close();
		
		double media = soma / 4;
		
		System.out.println("Sua média foi: " + media);

	}

}
