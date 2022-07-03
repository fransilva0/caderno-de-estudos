package exercicios;

import java.util.Scanner;

// Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
// C = 5 * ((F-32) / 9).

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura atual em Fahrenheit:");
		double temperaturaF = Double.parseDouble(sc.nextLine());
		
		double converterTemperatura = 5 * ((temperaturaF - 32) / 9);
		
		System.out.println("A temperatura em graus Celsius é: " + converterTemperatura);
		
		sc.close();

	}

}
