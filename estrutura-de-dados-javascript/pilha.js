let elementos = []
let topo = -1

const MAX = 5

const push = num => {
  if (topo < MAX) {
    topo = topo + 1
    elementos[topo] = num
  } else {
    console.log('Pilha está cheia')
  }
}

const pop = () => {
  if (topo != -1) {
    let num = elementos[topo]
    elementos.pop(topo)
    topo = topo - 1
    return num
  } else {
    console.log('Pilha está vazia')
  }
}

/*

push(4)
push(5)
push(88)
push(90)
push(1)

console.log(elementos)

console.log(pop())
console.log(pop())
console.log(pop())

console.log(elementos)

*/

// Exercício
// Faça um programa que converta um número em binário

let numDecimal = 10
let resto

while (numDecimal != 0) {
  resto = parseInt(numDecimal % 2)
  push(resto)
  numDecimal = parseInt(numDecimal / 2)
}

while (topo != -1) {
  console.log(pop())
}
