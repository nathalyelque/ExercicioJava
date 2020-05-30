package Animais;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emitirSom() {
		return "hinn in in";
	}

	@Override
	public String exibirHabilidade() {
		return "correndo";
	}

}
