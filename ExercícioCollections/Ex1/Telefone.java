package Ex1;

public class Telefone {
	
	private String nmrTelefone;
	private int tipoTelefone;
	
	public Telefone(String telefone) {
		this.nmrTelefone = telefone;
		
	}
	public void tipoTelefone(int tipoTf) {
		this.tipoTelefone = tipoTf;	
	}
	
	public String getNmrTelefone() {
		return nmrTelefone;
	}
	public void setNmrTelefone(String nmrTelefone) {
		this.nmrTelefone = nmrTelefone;
	}
	public int getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(int tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
}
