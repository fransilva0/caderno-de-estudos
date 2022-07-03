package exercicios;

import java.util.Scanner;

// Tendo como dados de entrada a altura de uma pessoa
// construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua altura: ");
		
		double altura = Double.parseDouble(sc.nextLine());
		
		double pesoCalculado = (72.7 * altura) - 58;
		
		System.out.println("O peso ideal para você é: " + pesoCalculado);
		
		sc.close();

	}

}
