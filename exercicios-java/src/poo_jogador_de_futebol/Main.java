/*
Crie uma classe para representar um jogador de futebol, com os atributos nome, posição, data de nascimento, nacionalidade, 
altura e peso. Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos os dados do 
jogador. Crie um método para calcular a idade do jogador e outro método para mostrar quanto tempo falta para o jogador 
se aposentar. Para isso, considere que os jogadores da posição de defesa se aposentam em média aos 40 anos, os jogadores de 
meio-campo aos 38 e os atacantes aos 35.
 */

package poo_jogador_de_futebol;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Jogador j = new Jogador();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		j.setNome(sc.next());
		
		System.out.println("Digite sua posicao (defesa | meio-campo | atacante): ");
		j.setPosicao(sc.next());
		
		System.out.println("Digite o seu ano de nascimento: ");
		j.setAnoDeNascimento(sc.nextInt());
		
		System.out.println("Digite sua nascionalidade: ");
		j.setNacionalidade(sc.next());
		
		System.out.println("Digite sua altura: ");
		j.setAltura(Double.parseDouble(sc.next()));
		
		System.out.println("Digite seu peso: ");
		j.setPeso(Double.parseDouble(sc.next()));
		
		System.out.println("Digite o ano atual: ");
		j.setAnoAtual(sc.nextInt());
		
	    j.idadeDoJogador();
	    
	    System.out.println(j);
	    
	    j.aposentadoria();
	    
	    System.out.println(j.getRespostaAposentadoria());
	    
	    sc.close();
	    
	    

	}

}
