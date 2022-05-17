// 1) Faça operações matemáticas básicas com os número 4 e 8

// A seguir, arrow functions armazenadas em constantes

const soma = (a, b) => {
  return a + b
}

const subtrai = (a, b) => {
  return a - b
}

const multiplica = (a, b) => {
  return a * b
}

const divide = (a, b) => {
  return a / b
}

const restoDaDivisao = (a, b) => {
  return a % b
}

const potencia = (a, b) => {
  return a ** b
}

// Realizando as operações

console.log(`4 + 8 = ${soma(4, 8)}`)
console.log(`8 - 4 = ${subtrai(8, 4)}`)
console.log(`4 * 8 = ${multiplica(4, 8)}`)
console.log(`8 / 4 = ${divide(8, 4)}`)
console.log(`4 % 8 = ${restoDaDivisao(4, 8)}`)
console.log(`8 ** 4 = ${potencia(8, 4)}`)
