package exercicios;

import java.util.Scanner;

// Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela.

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		String nome = sc.next();
		sc.close();
		
		System.out.println("Olá " + nome + ", que nome bonito!");
		

	}

}
