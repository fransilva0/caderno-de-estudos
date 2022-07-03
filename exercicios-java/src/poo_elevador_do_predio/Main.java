/* Crie	 uma	 classe	 denominada	 Elevador	 para	 armazenar	 as	 informa��es	 de	 um	
elevador	dentro	de	um	pr�dio.	A	classe	deve	armazenar	o	andar	atual	(0=t�rreo),	
total	de	andares	no	pr�dio,	excluindo	o	t�rreo,	capacidade	do	elevador,	e	quantas	
pessoas	est�o	presentes	nele. A	classe	deve	tamb�m	disponibilizar	os	seguintes	
m�todos:

a) inicializa:	que	deve	receber	como	par�metros:	a	capacidade	do	elevador	e	
o	total	de	andares	no	pr�dio	(os	elevadores	sempre	come�am	no	t�rreo	e	
vazios);
b) entra:	para	acrescentar	uma	pessoa	no	elevador	(s�	deve	acrescentar	se	
ainda	houver	espa�o);
c) sai:	 para	 remover	 uma	 pessoa	 do	elevador	 (s�	 deve	 remover	 se	 houver	
algu�m	dentro	dele);
d) sobe:	para	subir	um	andar	(n�o	deve	subir	se	j�	estiver	no	�ltimo	andar);
e) desce:	para	descer	um	andar	(n�o	deve	descer	se	j�	estiver	no	t�rreo);
f) get e	set....:	m�todos	para	obter	cada	um	dos	os	dados	armazenados. */

package poo_elevador_do_predio;

public class Main {
	public static void main(String[] args) {
	    Elevador e= new Elevador(5,5);
	    
	    e.setAndarAtual(0);
	    
	    System.out.println(e.entrar() ? "Uma pessoa entrou" : "N�o h� mais espa�o");
	    System.out.println(e.entrar() ? "Uma pessoa entrou" : "N�o h� mais espa�o");
	    System.out.println(e.entrar() ? "Uma pessoa entrou" : "N�o h� mais espa�o");
	    System.out.println(e.entrar() ? "Uma pessoa entrou" : "N�o h� mais espa�o");
	    System.out.println(e.entrar() ? "Uma pessoa entrou" : "N�o h� mais espa�o");

	    
	    System.out.println("O elevador j� conta com " + e.getQuatAtualPessoas() + " pessoa(s).");
	    
	    System.out.println(e.entrar() ? "Uma pessoa entrou" : "N�o h� mais espa�o");
	    
	    System.out.println(e.sair() ? "Uma pessoa saiu" : "N�o h� mais nigu�m");
	    System.out.println(e.sair() ? "Uma pessoa saiu" : "N�o h� mais nigu�m");
	    System.out.println(e.sair() ? "Uma pessoa saiu" : "N�o h� mais nigu�m");
	    System.out.println(e.sair() ? "Uma pessoa saiu" : "N�o h� mais nigu�m");
	    System.out.println(e.sair() ? "Uma pessoa saiu" : "N�o h� mais nigu�m");
	    System.out.println(e.sair() ? "Uma pessoa saiu" : "N�o h� mais nigu�m");
	    
	    System.out.println("Dentro do elevador h� " + e.getQuatAtualPessoas() + " pessoa(s).");
	    
	    System.out.println(e.entrar() ? "Uma pessoa entrou" : "N�o h� mais espa�o");
	    System.out.println(e.entrar() ? "Uma pessoa entrou" : "N�o h� mais espa�o");
	    
	    e.sobe(1);
	    
	    System.out.println("Voc� est� no andar " + e.getAndarAtual());
	    
	    e.sobe(4);
	    
	    System.out.println("Voc� est� no andar " + e.getAndarAtual());
	    
	    e.sobe(6);
	    
	    System.out.println("Existem apenas " + e.getTotalDeAndares() + " andares");
	    
	    e.desce(2);
	    
	    System.out.println("Voc� desceu para o andar " + e.getAndarAtual());
	    
	    e.desce(-1);
	    
	    
	    
	    

	  }
}

