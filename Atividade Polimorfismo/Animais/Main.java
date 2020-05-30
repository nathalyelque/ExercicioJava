package Animais;

public class Main {

	public static void main(String[] args) {
		
		Animal animal;
		
		Cavalo alasao = new Cavalo("Alasao", 4);
		
		Cachorro toto = new Cachorro("Totó", 2);
		
		Preguica nina = new Preguica("Nina", 5);
		
		animal = alasao;
		System.out.println("O cavalo faz: " + animal.emitirSom());
		
		animal = toto;
		System.out.println("O cachorro faz: " + animal.emitirSom());
		
		animal = nina;
		System.out.println("A preguiça faz: " + animal.emitirSom());
		
		Veterinario veterinario = new Veterinario();
		
		System.out.println("examinar cavalo: " + veterinario.examinar(alasao));
		System.out.println("examinar cachorro: " + veterinario.examinar(toto));
		System.out.println("examinar preguiça: " + veterinario.examinar(nina));
	}

}
