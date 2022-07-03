/*

Implemente	uma	televis�o.	A	televis�o	tem	um	controle	de	volume	do	som	e	um	
controle	de	sele��o	de	canal. No	programa	principal,	crie	uma	televis�o	e	troque	
de	canal	algumas	vezes.	Aumente	um	pouco	o	volume,	e	exiba	o	valor	de	ambos	
os	atributos. Para	isso,	considere	as	seguintes	especifica��es:
a) O	controle	de	volume	permite	aumentar	ou	diminuir	a	pot�ncia	do	volume	
de	som	em	uma	unidade	de	cada	vez.
b) O	controle	de	canal	 tamb�m	permite	aumentar	e	diminuir	o	n�mero	do	
canal	em	uma	unidade,	por�m,	 tamb�m	possibilita	 trocar	para	um	canal	
indicado.
c) Tamb�m	devem	existir	m�todos	para	consultar	o	valor	do	volume	de	som	
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
			
			System.out.println("- MENU -\n1 - pr�ximo canal\n2 - canal anterior\n3 - digitar canal\n4 - aumentar volume\n5 - diminiur volume\n6 - display\n7 - sair");
			choose = sc.nextInt();
			
			switch (choose) {
			case 1: 
				
				System.out.println(can.proxCanal() ? can : "Voc� j� est� no �ltimo canal");
				System.out.println();
			break;
			
			case 2:
				
				System.out.println(can.voltarCanal() ? can : "Voc� j� est� no primeiro canal");
				System.out.println();
				
			break;
			
			case 3:
				
				System.out.println("Digite o n�mero do canal:\n");
				can.setCanal(sc.nextInt());
				System.out.println();
				
			break;
				
			case 4:
				
				System.out.println(vol.aumentarVolume() ? vol : "Volume est� no m�ximo");
				System.out.println();
				
			break;
				
			case 5:
				
				System.out.println(vol.diminuirVolume() ? vol : "Volume est� no min�mo");
				System.out.println();
				
			break;
			
			case 6:
				
				System.out.println(can);
				System.out.println(vol);
				System.out.println();
				
			break;
				
			default:
				throw new IllegalArgumentException("Voc� saiu do programa...");
			
			}
		}
	
	sc.close();

	}
}
