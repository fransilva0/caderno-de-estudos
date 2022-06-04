export class Pessoa {
  private nome: string;
  private idade: number;
  private id: number;

  public constructor(nome: string, idade: number, id: number) {
  
    this.nome = nome;
    this.idade = idade;
    this.id = id;
  
  }

  public getNome() : string {
    return this.nome;
  }

  public setNome(nome:string) : void {
    this.nome = nome;
  } 

  public getIdade() : number {
    return this.idade;
  }

  public setIdade(idade:number) : void {
    this.idade = idade;
  }

  public getId() : number {
    return this.id;
  }

  public setId(id:number) : void {
    this.id = id;
  }

  public toString() : string {
    return `nome: ${this.nome}\nidade: ${this.idade}\nid: ${this.id}`;
  }
}