/* 
  3. Faça um Programa que leia 2 números inteiros e um número real. Calcule e mostre:
  
  a) o produto do dobro do primeiro com metade do segundo .
  
  b) a soma do triplo do primeiro com o terceiro.
  
  c) o terceiro elevado ao cubo.
*/

const operacao1 = (number1, number2) => {
  let result = (number2 / 2) * (number1 * 2)

  return result
}

const operacao2 = (number1, number3) => {
  let result = number3 + number1 * 3

  return result
}

const operacao3 = number3 => {
  let result = number3 ** 3

  return result
}

// number1 e number2 = inteiro; number3 = real(float)

console.log(operacao1(5, 10))
console.log(operacao2(5, 3.5))
console.log(operacao3(3.5))
