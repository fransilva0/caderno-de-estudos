/*

Implemente	uma	televisão.	A	televisão	tem	um	controle	de	volume	do	som	e	um	
controle	de	seleção	de	canal. No	programa	principal,	crie	uma	televisão	e	troque	
de	canal	algumas	vezes.	Aumente	um	pouco	o	volume,	e	exiba	o	valor	de	ambos	
os	atributos. Para	isso,	considere	as	seguintes	especificações:
a) O	controle	de	volume	permite	aumentar	ou	diminuir	a	potência	do	volume	
de	som	em	uma	unidade	de	cada	vez.
b) O	controle	de	canal	 também	permite	aumentar	e	diminuir	o	número	do	
canal	em	uma	unidade,	porém,	 também	possibilita	 trocar	para	um	canal	
indicado.
c) Também	devem	existir	métodos	para	consultar	o	valor	do	volume	de	som	
e	o	canal	selecionado.

*/

package poo_controle_da_televisao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Volume vol = new Volume();
		Canal can = new Canal();
		int choose = 0;
		Scanner sc = new Scanner(System.in);
		
		
		while(choose != 7) {
			
			System.out.println("- MENU -\n1 - próximo canal\n2 - canal anterior\n3 - digitar canal\n4 - aumentar volume\n5 - diminiur volume\n6 - display\n7 - sair");
			choose = sc.nextInt();
			
			switch (choose) {
			case 1: 
				
				System.out.println(can.proxCanal() ? can : "Você já está no último canal");
				System.out.println();
			break;
			
			case 2:
				
				System.out.println(can.voltarCanal() ? can : "Você já está no primeiro canal");
				System.out.println();
				
			break;
			
			case 3:
				
				System.out.println("Digite o número do canal:\n");
				can.setCanal(sc.nextInt());
				System.out.println();
				
			break;
				
			case 4:
				
				System.out.println(vol.aumentarVolume() ? vol : "Volume está no máximo");
				System.out.println();
				
			break;
				
			case 5:
				
				System.out.println(vol.diminuirVolume() ? vol : "Volume está no minímo");
				System.out.println();
				
			break;
			
			case 6:
				
				System.out.println(can);
				System.out.println(vol);
				System.out.println();
				
			break;
				
			default:
				throw new IllegalArgumentException("Você saiu do programa...");
			
			}
		}
	
	sc.close();

	}
}
