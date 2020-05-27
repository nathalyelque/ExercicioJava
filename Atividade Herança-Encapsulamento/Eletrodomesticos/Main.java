package Eletrodomesticos;

public class Main {

	public static void main(String[] args) {

		Eletrodomestico fogao = new Eletrodomestico("fogao", "branco", 127);
		
		System.out.println(fogao.dadosCompletos());
	}

}
