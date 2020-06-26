package Ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.List;



public class MinhasCollections {
	
	public static void main(String[] args) {
		
		//instancia array list 
        List<Integer> minhaLista = new ArrayList<Integer>();
        
        //adicionar itens ao array
        minhaLista.add(1);
        minhaLista.add(2);
        minhaLista.add(2);
 
        
        //Foreach dos elementos da lista
        for (Integer listaElementos : minhaLista) {
            System.out.println(listaElementos);
        }
        
        //Set responsavel por excluir elementos que se repetem
        Set<Integer> meuSet = new HashSet()<Integer>();
        meuSet.add(1);
        meuSet.add(2);
        meuSet.add(3);
        meuSet.add(1);
        //percorre a lista com o hasNext()
        Iterator<Integer> iMeuSet = meuSet.iterator();
        while(iMeuSet.hasNext()){
            System.out.println(iMeuSet.next());
        }
 
 
 
    }
 


}
