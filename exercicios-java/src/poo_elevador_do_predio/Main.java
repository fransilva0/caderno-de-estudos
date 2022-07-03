/* Crie	 uma	 classe	 denominada	 Elevador	 para	 armazenar	 as	 informações	 de	 um	
elevador	dentro	de	um	prédio.	A	classe	deve	armazenar	o	andar	atual	(0=térreo),	
total	de	andares	no	prédio,	excluindo	o	térreo,	capacidade	do	elevador,	e	quantas	
pessoas	estão	presentes	nele. A	classe	deve	também	disponibilizar	os	seguintes	
métodos:

a) inicializa:	que	deve	receber	como	parâmetros:	a	capacidade	do	elevador	e	
o	total	de	andares	no	prédio	(os	elevadores	sempre	começam	no	térreo	e	
vazios);
b) entra:	para	acrescentar	uma	pessoa	no	elevador	(só	deve	acrescentar	se	
ainda	houver	espaço);
c) sai:	 para	 remover	 uma	 pessoa	 do	elevador	 (só	 deve	 remover	 se	 houver	
alguém	dentro	dele);
d) sobe:	para	subir	um	andar	(não	deve	subir	se	já	estiver	no	último	andar);
e) desce:	para	descer	um	andar	(não	deve	descer	se	já	estiver	no	térreo);
f) get e	set....:	métodos	para	obter	cada	um	dos	os	dados	armazenados. */

package poo_elevador_do_predio;

public class Main {
	public static void main(String[] args) {
	    Elevador e= new Elevador(5,5);
	    
	    e.setAndarAtual(0);
	    
	    System.out.println(e.entrar() ? "Uma pessoa entrou" : "Não há mais espaço");
	    System.out.println(e.entrar() ? "Uma pessoa entrou" : "Não há mais espaço");
	    System.out.println(e.entrar() ? "Uma pessoa entrou" : "Não há mais espaço");
	    System.out.println(e.entrar() ? "Uma pessoa entrou" : "Não há mais espaço");
	    System.out.println(e.entrar() ? "Uma pessoa entrou" : "Não há mais espaço");

	    
	    System.out.println("O elevador já conta com " + e.getQuatAtualPessoas() + " pessoa(s).");
	    
	    System.out.println(e.entrar() ? "Uma pessoa entrou" : "Não há mais espaço");
	    
	    System.out.println(e.sair() ? "Uma pessoa saiu" : "Não há mais niguém");
	    System.out.println(e.sair() ? "Uma pessoa saiu" : "Não há mais niguém");
	    System.out.println(e.sair() ? "Uma pessoa saiu" : "Não há mais niguém");
	    System.out.println(e.sair() ? "Uma pessoa saiu" : "Não há mais niguém");
	    System.out.println(e.sair() ? "Uma pessoa saiu" : "Não há mais niguém");
	    System.out.println(e.sair() ? "Uma pessoa saiu" : "Não há mais niguém");
	    
	    System.out.println("Dentro do elevador há " + e.getQuatAtualPessoas() + " pessoa(s).");
	    
	    System.out.println(e.entrar() ? "Uma pessoa entrou" : "Não há mais espaço");
	    System.out.println(e.entrar() ? "Uma pessoa entrou" : "Não há mais espaço");
	    
	    e.sobe(1);
	    
	    System.out.println("Você está no andar " + e.getAndarAtual());
	    
	    e.sobe(4);
	    
	    System.out.println("Você está no andar " + e.getAndarAtual());
	    
	    e.sobe(6);
	    
	    System.out.println("Existem apenas " + e.getTotalDeAndares() + " andares");
	    
	    e.desce(2);
	    
	    System.out.println("Você desceu para o andar " + e.getAndarAtual());
	    
	    e.desce(-1);
	    
	    
	    
	    

	  }
}

