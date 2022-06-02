/*
  1. Crie um programa em JavaScript que simula uma calculadora. Ou seja, recebe 
  dois valores e retorna a soma, multiplicação, subtração ou divisão desses valores. No caso da divisão deve-se verificar se o segundo valor é diferente de zero. (calculadora.ts)
*/

class Calculadora {
  private number1 : number;
  private number2 : number;

  public constructor(number1:number, number2:number) {
    this.number1 = number1;
    this.number2 = number2;
  }

  public getNumber1() : number {
    return this.number1;
  }

  public setNumber1(number1:number) : void {
    this.number1 = number1;
  }

  public getNumber2() : number {
    return this.number2;
  }

  public setNumber2(number2:number) : void {
    this.number2 = number2;
  }

  public somar() {
    return this.number1 + this.number2;
  }

  public multiplicar() {
    return this.number1 * this.number2;
  }

  public subtrair() {
    return this.number1 - this.number2;
  }

  public dividir() {
    if(this.number2 != 0) {
      return this.number1 / this.number2;
    } else {
      return `é impossível, pois, o número ${this.number2} é igual ou menor que 0`
    }
  }
}

// ------------ MAIN -------------------
let c = new Calculadora(10, 5);

// Chamada dos métodos da classe Calculadora

console.log(`${c.getNumber1()} + ${c.getNumber2()} = ${c.somar()}`)
console.log(`${c.getNumber1()} - ${c.getNumber2()} = ${c.subtrair()}`)
console.log(`${c.getNumber1()} * ${c.getNumber2()} = ${c.multiplicar()}`)
console.log(`${c.getNumber1()} / ${c.getNumber2()} = ${c.dividir()}`)