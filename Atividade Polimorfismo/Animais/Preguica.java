package Animais;

public class Preguica extends Animal {
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emitirSom() {
		return "wiiiiiiii";
	}

	@Override
	public String exibirHabilidade() {
		return "subindo em árvore";
	}

}
