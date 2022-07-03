/*
Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto
dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de
trabalho. Escreva os seguintes métodos para esta classe:

a) media = calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
b) final = calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)

*/

package poo_media_aluno;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Alunos aluno = new Alunos();

		System.out.println("Digite seu nome: ");
		aluno.setNome(sc.next());
		
		System.out.println("Digite sua matricula: ");
		aluno.setMatricula(sc.next());
		
		System.out.println("Digite a nota da prova 1: ");
		aluno.setNotaProva1(Double.parseDouble(sc.next()));
		
		System.out.println("Digite a nota da prova 2: ");
		aluno.setNotaProva2(Double.parseDouble(sc.next()));
		
		System.out.println("Digite a nota do Trabalho: ");
		aluno.setNotaTrabalho(Double.parseDouble(sc.next()));
		
		aluno.media();
		aluno.vaiParafinal();
		
		System.out.println(aluno);
		
		sc.close();
		

	}

}
