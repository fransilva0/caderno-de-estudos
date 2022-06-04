/* 
  O programa percorre uma string recebida no parâmetro de um método e recria 
  outra atribuindo o valor de cada carácter dessa string original ao seu 
  respectivo carácter contido em um dicionário.
*/

let cifraCesar = str => {
  let tabela = {
    a: 'n',
    b: 'o',
    c: 'p',
    d: 'q',
    e: 'r',
    f: 's',
    g: 't',
    h: 'u',
    i: 'v',
    j: 'w',
    k: 'x',
    l: 'y',
    m: 'z',
    n: 'a',
    o: 'b',
    p: 'c',
    q: 'd',
    r: 'e',
    s: 'f',
    t: 'g',
    u: 'h',
    v: 'i',
    w: 'j',
    x: 'k',
    y: 'l',
    z: 'm',
    ' ': ' '
  }

  str = str.toLowerCase()
  let mensagem = ''
  for (let i = 0; i < str.length; i++) {
    mensagem += tabela[str[i]]
  }

  return mensagem
}

// descodificando
console.log(cifraCesar('cnenoraf'))

// codificando
console.log(
  cifraCesar('a ligeira raposa marrom saltou sobre o cachorro cansado')
)
