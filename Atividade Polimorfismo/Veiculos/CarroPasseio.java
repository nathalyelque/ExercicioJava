package Veiculos;

public class CarroPasseio extends Veiculo {

	private String cor;
	
	private String modelo;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void entrPass(int peso, int velocMax, float preco, String cor, String modelo) {
		super.entrVeic(peso, velocMax, preco);
		
		this.cor = cor;
		this.modelo = modelo;
	}
	
	public String mostrPass() {
		return super.mostrVeic() + ", de cor " + this.getCor() + ", modelo " + this.getModelo();
	}
}
