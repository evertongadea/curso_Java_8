package j8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,5,5,8,8);
		
		/**
		 * STREAMS
		 */
		
		// antigo
		for(Integer num: lista) {
			System.out.println(num);
		}
		
		// novo
		lista.stream().forEach(e -> System.out.println(e + " com stream"));
		
		lista.stream()
		.skip(6) 	// ignora os 6 primeiros
		.limit(5) 	// limita a 5 itens
		.distinct()	// impede repetições
		.forEach(e -> System.out.println(e + " com operações intermediárias"));
		
		lista.stream()
		.filter(e -> e != 8)
		.forEach(e -> System.out.println(e + " com filtro (!= 8)"));
		
		lista.stream()
		.map(e -> e * 2)
		.forEach(e -> System.out.println(e + " com transformação (*2)"));
		
		List<Integer> lista2 = lista.stream()
		.map(e -> e * 2)
		.collect(Collectors.toList());
		System.out.println("Nova lista transformada:");
		System.out.println(lista2);
	}

}
