## Exercícios em Java

<p>
	O seguinte repositório foi desenvolvido para armazenamento de respostas de  exercícios disponibilizados livremente na internet utilizando a linguagem Java. 
	Na pasta src se encontram todos os códigos dos exercícios. 
</p>


- ### Questões Simples
    1) Faça um Programa que mostre a mensagem "Alo mundo" na tela.
    2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela.
    3) Faça um Programa que peça as 4 notas bimestrais e mostre a média.
    4) Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e 		mostre a temperatura em graus Celsius. | C = 5 * ((F-32) / 9).
    5) Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

- ### Programação Orientada a Objetos
	1) Crie	uma	classe	para	representar	uma	pessoa,	com	os	atributos	privados	de	nome, idade	 e	 id(rg).	 Crie	 os	 métodos	 públicos	 necessários	 para setters e	 getters e também	um	método	para	imprimir	os	dados	de	uma	pessoa. Em	seguida,	escreva um	programa	main	que	faça	uso	da	classe	Pessoa,	para	isso	crie duas	instancias	da classe	pessoa,	preencha	as	informações	da	primeira	instancia	do	objeto	pessoa utilizando	os	métodos	setters e	getters	e	as	informações	da	segunda	instância	da classe	 Pessoa	deve	 ser	 preenchida	no	momento	 da	 criação	 do	 objeto,	 ou	 seja, construa	e	utilize	um	método	construtor	para	isso.
	2) Crie	 uma	 classe	 denominada	 Elevador	 para	 armazenar	 as	 informações	 de	 um	elevador	dentro	de	um	prédio.	A	classe	deve	armazenar	o	andar	atual	(0=térreo),	total	de	andares	no	prédio,	excluindo	o	térreo,	capacidade	do	elevador,	e	quantas	pessoas	estão	presentes	nele. A	classe	deve	também	disponibilizar	os	seguintes	métodos:
    
		a) inicializa:	que	deve	receber	como	parâmetros:	a	capacidade	do	elevador	e	o	total	de	andares	no	prédio	(os	elevadores	sempre	começam	no	térreo	e	vazios);<br>
		b) entra:	para	acrescentar	uma	pessoa	no	elevador	(só	deve	acrescentar	se	ainda	houver	espaço);<br>
		c) sai:	 para	 remover	 uma	 pessoa	 do	elevador	 (só	 deve	 remover	 se	 houver	alguém	dentro	dele);<br>
		d) sobe:	para	subir	um	andar	(não	deve	subir	se	já	estiver	no	último	andar);<br>
		e) desce:	para	descer	um	andar	(não	deve	descer	se	já	estiver	no	térreo;<br>
		f) get e	set....:	métodos	para	obter	cada	um	dos	os	dados	armazenados.
  3) Implemente	uma	televisão.	A	televisão	tem	um	controle	de	volume	do	som	e um	controle	de	seleção	de	canal. No	programa	principal,	crie	uma	televisão	e	troque	de	canal	algumas	vezes.	Aumente	um	pouco	o	volume,	e	exiba	o	valor	de	ambos	os	atributos. Para	isso,	considere	as	seguintes	especificações:

		a) O	controle	de	volume	permite	aumentar	ou	diminuir	a	potência	do	volume	de	som	em	uma	unidade	de	cada	vez.<br>
		b) O	controle	de	canal	 também	permite	aumentar	e	diminuir	o	número	do	canal	em	uma	unidade,	porém,	 também	possibilita	 trocar	para	um	canal	indicado.<br>
		c) Também	devem	existir	métodos	para	consultar	o	valor	do	volume	de	som	e	o	canal	selecionado.
	4) Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho. Escreva os seguintes métodos para esta classe: 
   
   		a) media = calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)<br>
			b) final = calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)
	5) Crie uma classe para representar um jogador de futebol, com os atributos nome, posição, data de nascimento, nacionalidade, altura e peso. Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos os dados do jogador. Crie um método para calcular a idade do jogador e outro método para mostrar quanto tempo falta para o jogador se aposentar. Para isso, considere que os jogadores da posição de defesa se aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35.
	6)