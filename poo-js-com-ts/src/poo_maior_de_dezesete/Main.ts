/*
  4. Crie um programa de determine se uma pessoa possui uma idade superior a 17 anos. O usuário deverá informar o nome, ano de nascimento e email da pessoa. É obrigatório utilizar classe para representar a pessoa.
*/

import { Pessoa } from './Pessoa'

const pessoa1 = new Pessoa("Mario", 2002, "Mario@gmail.com")
const pessoa2 = new Pessoa("Diego", 2005, "Diego@gmail.com")

pessoa1.maiorDeDezessete()
console.log("\n")
pessoa2.maiorDeDezessete()
console.log("\n")
console.log(pessoa1.toString())
console.log("\n")
console.log(pessoa2.toString())