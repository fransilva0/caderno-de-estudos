/*
  3. Crie uma classe para representar uma pessoa, com os atributos privados de nome, idade e id. Crie os métodos públicos necessários para setters e getters e também um método para imprimir os dados de uma pessoa. Em seguida, escreva um programa main que faça uso da classe Pessoa, preencha as informações da instancia do objeto pessoa.
*/

// importando a classe Pessoa 
import { Pessoa } from './Pessoa'


// chamando a classe Pessoa
let p1 = new Pessoa("Beto", 19, 1);
let p2 = new Pessoa("Rosa", 45, 2);


// Utilizando o toString para mostrar os dados de p1 e p2
console.log(p1.toString())
console.log(p2.toString())
