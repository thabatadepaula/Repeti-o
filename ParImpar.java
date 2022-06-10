package Exercicios;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		
		Scanner numero = new Scanner(System.in);
		int valor, contPar = 0, contImpar = 0 ;
		
			for ( int i = 0+1 ; i <= 10 ; i++) {
				System.out.println("Digite o " + i + "º número");
				int entrada = numero.nextInt();
		
		if (entrada % 2 == 0) {
			contPar++;
			
		}
		else contImpar++;
				
				
						
			}
			System.out.println("Dos números digitados, " + contPar + " são pares e " + contImpar + " são ímpares");
			
			
			
			
			
			
	}}
	
