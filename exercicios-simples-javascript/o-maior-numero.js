// 3) Faça um Programa que leia três números e mostre o maior deles.

const oMaiorNumero = (num1, num2, num3) => {
  let maior

  if (num1 > num2 && num1 > num3) {
    maior = num1
  } else if (num2 > num3 && num2 > num1) {
    maior = num2
  } else if (num3 > num1 && num3 > num2) {
    maior = num3
  }

  console.log(`O maior número é ${maior}`)
}

oMaiorNumero(18, 7, 9)
oMaiorNumero(18, 20, 9)
oMaiorNumero(18, 7, 33)
