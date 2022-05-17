// 1) Faça operações matemáticas básicas com os número 4 e 8

// A seguir, arrow functions armazenadas em constantes
// No TypeScript as variáveis presicam ter um tipo definido, neste caso todos são do tipo "number"

const soma = (a : number, b : number) => {
  return a + b
}

const subtrai = (a : number, b : number) => {
  return a - b
}

const multiplica = (a : number, b : number) => {
  return a * b
}

const divide = (a : number, b : number) => {
  return a / b
}

const restoDaDivisao = (a : number, b : number) => {
  return a % b
}

const potencia = (a : number, b : number) => {
  return a ** b
}

// Realizando as operações

console.log(`4 + 8 = ${soma(4, 8)}`)
console.log(`8 - 4 = ${subtrai(8, 4)}`)
console.log(`4 * 8 = ${multiplica(4, 8)}`)
console.log(`8 / 4 = ${divide(8, 4)}`)
console.log(`4 % 8 = ${restoDaDivisao(4, 8)}`)
console.log(`8 ** 4 = ${potencia(8, 4)}`)
