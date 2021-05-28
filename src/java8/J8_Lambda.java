package java8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;

public class J8_Lambda {

	public static void main(String[] args) {
		
		/**
		 * FUÇÕES LAMBDA
		 */
		
		// antigo
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Nova Thread!");
			}
		}).run();
		
		// novo 
		new Thread(() -> System.out.println("Nova Thread com lambda!")).run();
		
		
		
		// antigo
		JButton jb = new JButton();
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ação do botão!");
			}
		});
		
		// novo
		JButton jb2 = new JButton();
		jb2.addActionListener(e -> System.out.println("Ação do botão com lambda!"));
		
		
		
		// antigo
		List<Integer> lista = Arrays.asList(1,2,3,4,5);
		for(Integer num: lista) {
			if(num % 2 == 0) {
				System.out.println(num);
			}
		}
		
		// novo
		lista.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e + " com stream e lambda"));
	}
}
