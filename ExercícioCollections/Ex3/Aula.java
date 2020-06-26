package Ex3;
import java.util.ArrayList;


public class Aula {

	    private String titulo;
	    private int tempo;

	    public Aula() {
	    	//construtor
	        this.titulo = titulo;
	        this.tempo = tempo;
	    }
	    	//getters
	    public String getTitulo() {
	        return titulo;
	    }

	    public int getTempo() {
	        return tempo;
	    }


	

	    public static void main(String[] args) {
	    	//declaração e inicialização de strings
	        String aula1 = "Modelando a classe Aula";
	        String aula2 = "Conhecendo mais de listas";
	        String aula3 = "Trabalhando com Cursos e Sets";
	        
	        //instanciando objetos da classe ArrayList
	        ArrayList<String> aulas = new ArrayList<>();
	        aulas.add(aula1);
	        aulas.add(aula2);
	        aulas.add(aula3);        

	        System.out.println(aulas);//mostrando na tela os arrays
	        System.out.println(aulas.size());//mostrando tamanho do array

	        // cuidado! <= faz sentido aqui? ocorre um erro na posição do array, onde um array conta a partir de 0 e array size a partir de 1
	        for (int i = 0; i <= aulas.size(); i++) {
	            System.out.println("Aula: " + aulas.get(i));
	        }
	        
	    }
	}


