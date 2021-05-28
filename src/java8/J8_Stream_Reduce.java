package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class J8_Stream_Reduce {

	public static void main(String[] args) {
		// Reduce de multiplicação
		List<Integer> listaNum = Arrays.asList(1,5,9,1,4,7,5,5,8,8);
		Optional<Integer> redNum = listaNum.stream().reduce((n1, n2) -> n1 * n2);
		System.out.println(redNum.get());
		
		// Reduce de concatenação
		List<String> listaStr = Arrays.asList("R","E","D","U","C","E");
		Optional<String> redStr = listaStr.stream().reduce((s1, s2) -> s1.concat(s2));
		System.out.println(redStr.get());
	}
}
