package java8;

import java.util.Optional;

public class J8_Optional {

	public static void main(String[] args) {
		/**
		 * OPTIONAL
		 */
		
		// Antigo
		String numStg = "1";
		Integer num = converteInteger(numStg);
		System.out.println(num);
		
		//novo
		converteOptionalInteger(numStg).ifPresent(e -> System.out.println(e));
		
		Integer num2 = converteOptionalInteger(numStg).orElse(4);
		System.out.println(num2);
	}
	
	public static Integer converteInteger(String numStg) {
		try {
			return Integer.valueOf(numStg);
		} catch (NumberFormatException e) {
			return null;
		}
		
	}
	
	public static Optional<Integer> converteOptionalInteger(String numStg) {
		try {
			return Optional.of(Integer.valueOf(numStg));
		} catch (NumberFormatException e) {
			return Optional.empty();
		}
		
	}
}
