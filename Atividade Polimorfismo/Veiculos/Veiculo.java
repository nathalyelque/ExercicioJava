package Veiculos;

public abstract class Veiculo {

	private int peso;
	
	private int velocMax;
	
	private float preco;
	
	public void entrVeic(int peso, int velocMax, float preco) {
		this.peso = peso;
		this.velocMax = velocMax;
		this.preco = preco;
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(int velocMax) {
		this.velocMax = velocMax;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String mostrVeic() {
		return "Veiculo de peso " + this.getPeso() + "Kg, com velocidade máxima " + this.getVelocMax() + "Km/h, preço " + this.getPreco() + "R$";
	}
}
