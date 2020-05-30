package Animais;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emitirSom() {
		return "au au au";
	}

	@Override
	public String exibirHabilidade() {
		return "correndo";
	}
}
