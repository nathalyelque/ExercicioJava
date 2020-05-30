package Veiculos;

public class Caminhao extends Veiculo {

	private float toneladas;
	
	private int alturaMaxima;
	
	private int comprimento;
	
	public float getToneladas() {
		return toneladas;
	}

	public void setToneladas(float toneladas) {
		this.toneladas = toneladas;
	}

	public int getAlturaMaxima() {
		return alturaMaxima;
	}

	public void setAlturaMaxima(int alturaMaxima) {
		this.alturaMaxima = alturaMaxima;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public void entrCam(int peso, int velocMax, float preco, float toneladas, int alturaMaxima, int comprimento) {
		super.entrVeic(peso, velocMax, preco);
		
		this.toneladas = toneladas;
		this.alturaMaxima = alturaMaxima;
		this.comprimento = comprimento;
	}
	
	public String mostrCam() {
		return super.mostrVeic() + ", com carga máxima " + this.getToneladas() + ", altura máxima " + this.getAlturaMaxima() + "m, comprimento " + this.getComprimento() + "m";
	}
}
