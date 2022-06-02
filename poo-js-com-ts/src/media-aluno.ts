/*
  2. Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto
dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de
trabalho. Escreva os seguintes métodos para esta classe:
a) media = calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
b) final = calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)

*/

class Aluno {
  private nome : string;
	private matricula : string ;
	private notaProva1 : number;
	private notaProva2 : number;
	private notaTrabalho : number;
	private mediaResult : number;

  public constructor(nome:string, matricula:string, notaProva1:number, notaProva2:number, notaTrabalho:number, mediaResult:number) {
		this.nome = nome;
		this.matricula = matricula;
		this.notaProva1 = notaProva1;
		this.notaProva2 = notaProva2;
		this.notaTrabalho = notaTrabalho;
		this.mediaResult = mediaResult;
	}

  public get Nome() : string {
    return this.nome;
  }

  public get Matricula() : string {
    return this.matricula;
  }

  public get NotaProva1() : number {
    return this.notaProva1;
  }

  public get NotaProva2() : number {
    return this.notaProva2;
  }

  public get NotaTrabalho() : number {
    return this.notaTrabalho;
  }


  public get MediaResult() : number {
    return this.mediaResult;
  }



  public media() {
    this.mediaResult = (this.notaProva1 + this.notaProva2 + this.notaTrabalho);
	
    return this.mediaResult;
  }

  public vaiParaFinal() : void {
    console.log(this.mediaResult >= 7 ? "Voce foi aprovado" : "Voce esta repovado, precisa de: " + (7 - this.mediaResult));
  }
}

// ----------MAIN----------------

let aluno = new Aluno("Beto", "00-1", 2.5, 2.5, 2,0);
let aluno2 = new Aluno("Arthur", "00-1", 1.5, 1, 1.5,0);

console.log(`Média do ${aluno.Nome}: ${aluno.media()}`);

aluno.vaiParaFinal();


console.log(`Média do ${aluno2.Nome}: ${aluno2.media()}`);

aluno2.vaiParaFinal();