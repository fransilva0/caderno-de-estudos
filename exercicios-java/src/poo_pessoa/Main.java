package poo_pessoa;

/*

Crie uma classe	para representar uma pessoa, com os	atributos privados	de	nome,	
idade	 e	 id(rg).	 Crie	 os	 m�todos	 p�blicos	 necess�rios	 para	setters e	 getters e	
tamb�m	um	m�todo	para	imprimir	os	dados	de	uma	pessoa. Em	seguida,	escreva
um	programa	main	que	fa�a	uso	da	classe	Pessoa,	para	isso	crie duas	instancias	da	
classe	pessoa,	preencha	as	informa��es	da	primeira	instancia	do	objeto	pessoa	
utilizando	os	m�todos	setters e	getters	e	as	informa��es	da	segunda	inst�ncia	da	
classe	 Pessoa	deve	 ser	 preenchida	no	momento	 da	 cria��o	 do	 objeto,	 ou	 seja,	
construa	e	utilize	um	m�todo	construtor	para	isso.

*/


public class Main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Beto", 19, 989707);
		Pessoa pessoa2 = new Pessoa();
		
		pessoa2.setNome("Maria");
		pessoa2.setIdade(25);
		pessoa2.setId(770920);
		
		
		System.out.println(pessoa1);
		System.out.println();
		System.out.println(pessoa2);

	}

}
