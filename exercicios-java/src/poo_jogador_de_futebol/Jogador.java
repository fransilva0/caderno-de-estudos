package poo_jogador_de_futebol;

public class Jogador {
	private String nome;
	private String posicao;
	private int anoDeNascimento;
	private String nacionalidade;
	private double altura;
	private double peso;
	
	private int idade;
	private int anoAtual;
	private String respostaAposentadoria;
	
	public Jogador() {
		this.nome = "-";
		this.posicao = "-";
		this.anoDeNascimento = 0;
		this.nacionalidade = "-";
		this.altura = 0;
		this.peso = 0;
	}
	
	public Jogador(String nome, String posicao, int anoDeNascimento, String nacionalidade, double altura, double peso) {
		this.nome = nome;
		this.posicao = posicao;
		this.anoDeNascimento = anoDeNascimento;
		this.nacionalidade = nacionalidade;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}

	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public int getAnoAtual() {
		return anoAtual;
	}

	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}
	
	public String getRespostaAposentadoria() {
		return respostaAposentadoria;
	}

	public void setRespostaAposentadoria(String respostaAposentadoria) {
		this.respostaAposentadoria = respostaAposentadoria;
	}

	
	public int idadeDoJogador() {
		
		this.idade = this.anoAtual - this.anoDeNascimento;
		
		return this.idade;
	}
	
	
	public String aposentadoria() {
		
		
		if (this.posicao.equals("defesa")) {
			if(this.idade < 40 ) {
				this.respostaAposentadoria = "Ainda falta " + (40 - idade) + " ano(s) para se aposentar";
			
				
			} else if (this.idade == 40) {
				this.respostaAposentadoria = "Você já tem 40 anos? Hora de se aposentar...";
			}
		} else if (this.posicao.equals("meio-campo")) {
			if (this.idade < 38 ) {
				this.respostaAposentadoria = "Ainda falta " + (38 - idade) + " ano(s) para se aposentar";
				
				
			} else if (this.idade == 38) {
				this.respostaAposentadoria = "Você já tem 38 anos? Hora de se aposentar...";
			}
		} else if (this.posicao.equals("atacante")) {
			if (this.idade < 35 ) {
				this.respostaAposentadoria = "Ainda falta " + (35 - idade) + " ano(s) para se aposentar";
				
				
			} else if (this.idade == 35) {
				this.respostaAposentadoria = "Você já tem 38 anos? Hora de se aposentar...";
			}
		} else {
			this.respostaAposentadoria = "Voce digitou a sua posicao errada!";
		}
		
	  
		return this.respostaAposentadoria;
	}
	
	public String toString() {
		return "nome: " + this.nome + "\nposicao: " + this.posicao +"\nNacionalidade: " + this.nacionalidade + "\nAltura: " + 
	this.altura + "\nPeso: " + this.peso + "\nIdade: " + this.idade;
	}
	
	
	
}
