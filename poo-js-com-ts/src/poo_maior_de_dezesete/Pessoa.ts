export class Pessoa {
  private nome : string;
  private anoDeNascimento : number;
  private email : string;

  public constructor(nome : string, anoDeNascimento : number, email : string) {
    this.nome = nome;
    this.anoDeNascimento = anoDeNascimento;
    this.email = email
  }

  public getNome() : string {
    return this.nome;
  }

  public setNome(nome : string) : void {
    this.nome = nome;
  }

  public getAnoDeNascimento() : number {
    return this.anoDeNascimento;
  }

  public setAnoDeNascimento(anoDeNascimento : number) : void {
    this.anoDeNascimento = anoDeNascimento;
  }

  public getEmail() : string {
    return this.email;
  }

  public setEmail(email : string) : void {
    this.email = email;
  }

  public maiorDeDezessete() : void {
    const dataAtual = new Date().getFullYear();
    const anoDeIdade = dataAtual - this.anoDeNascimento;

    console.log(anoDeIdade > 17 ? "Você é maior de idade" : "Você é menor de idade, seu kid!")
  }

  public toString() : string {
    return `nome: ${this.nome}\nano de nascimento: ${this.anoDeNascimento}\ne-mail: ${this.email}`;
  }
}