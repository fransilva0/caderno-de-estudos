package poo_pessoa;

/*

Crie uma classe	para representar uma pessoa, com os	atributos privados	de	nome,	
idade	 e	 id(rg).	 Crie	 os	 métodos	 públicos	 necessários	 para	setters e	 getters e	
também	um	método	para	imprimir	os	dados	de	uma	pessoa. Em	seguida,	escreva
um	programa	main	que	faça	uso	da	classe	Pessoa,	para	isso	crie duas	instancias	da	
classe	pessoa,	preencha	as	informações	da	primeira	instancia	do	objeto	pessoa	
utilizando	os	métodos	setters e	getters	e	as	informações	da	segunda	instância	da	
classe	 Pessoa	deve	 ser	 preenchida	no	momento	 da	 criação	 do	 objeto,	 ou	 seja,	
construa	e	utilize	um	método	construtor	para	isso.

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
