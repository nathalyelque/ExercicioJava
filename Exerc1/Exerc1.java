package Exerc1;

public class Exerc1 {

	public static void main(String[] args) {
		int soma = 0;
		
		for(int i=1; i<=500; i++) {
			if(i % 2 > 0 && i % 3 == 0) {
				soma = soma + i;
			}
		}

		System.out.println("A soma �: " + soma);
	}

}
