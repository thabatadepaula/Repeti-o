package Exercicios;

public class ExercíciosRepetição {
				//Informar todos os números de 1000 a 1999 que quando divididos por 11
				//obtemos resto = 5.
	
	public static void main(String[] args) {
		System.out.println("Os números entre 1000 e 1999 que divididos por 11 restam 5 são: \n");
		for (int i=1000; i < 2000; i++){
		    if (i%11==5) {
		        System.out.println(i);
		    }
		}
	}

}
