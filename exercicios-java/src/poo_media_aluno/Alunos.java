package poo_media_aluno;

public class Alunos {
	private String nome;
	private String matricula;
	private double notaProva1;
	private double notaProva2;
	private double notaTrabalho;
	private double mediaResult;
	
	public Alunos() {
		this.nome = "-";
		this.matricula = "-";
		this.notaProva1 = 0;
		this.notaProva2 = 0;
		this.notaTrabalho = 0;
		this.mediaResult = 0;
	}
	
	public Alunos(String nome, String matricula, double notaProva1, double notaProva2, double notaTrabalho,
			double mediaResult) {
		this.nome = nome;
		this.matricula = matricula;
		this.notaProva1 = notaProva1;
		this.notaProva2 = notaProva2;
		this.notaTrabalho = notaTrabalho;
		this.mediaResult = mediaResult;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double getNotaProva1() {
		return notaProva1;
	}
	public void setNotaProva1(double notaProva1) {
		this.notaProva1 = notaProva1;
	}
	
	public double getNotaProva2() {
		return notaProva2;
	}
	public void setNotaProva2(double notaProva2) {
		this.notaProva2 = notaProva2;
	}
	
	public double getNotaTrabalho() {
		return notaTrabalho;
	}
	public void setNotaTrabalho(double notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	
	public double getMediaResult() {
		return mediaResult;
	}
	public void setMediaResult(double mediaResult) {
		this.mediaResult = mediaResult;
	}
	
	public double media() {
		double resolucao = (this.notaProva1 + this.notaProva2 + this.notaTrabalho);
		this.mediaResult = resolucao;
		
		return resolucao;
	}
	
	public void vaiParafinal() {
		
		System.out.println(mediaResult >= 7 ? "Voce foi aprovado" : "Voce esta repovado, precisa de: " + (7 - mediaResult));
	
	}
	
	public String toString() {
		return "\nAluno: " + nome + "\n" + "matricula: " + matricula + "\n" 
				+ "Prova 1: " + notaProva1 + "\n" + "Prova 2: " + notaProva2 + "\n" 
				+ "Trabalho: " + notaTrabalho + "\n" + "Media: " + mediaResult;
	}

	
}
