package Veiculos;

public class Main {

	public static void main(String[] args) {
		CarroPasseio carroDePasseio = new CarroPasseio();
		
		carroDePasseio.entrPass(300, 260, 3400.40f, "Branco", "Fusca");
		
		Caminhao caminhao = new Caminhao();
		
		caminhao.entrCam(700, 300, 1200.50f, 1230, 1222, 111);
		
		System.out.println("CarroDePasseio mostrPass: " + carroDePasseio.mostrPass());
		System.out.println("Caminhao mostrCam: " + caminhao.mostrCam());
		
	}

}
