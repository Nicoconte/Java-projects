package algoritmos;

import static utils.Utils.*;

public class FibonacciSecuencial {
	
	public void firstSolution() {
		int a = 0;
		int b = 1;
		int c = 0;
		
		for(int i = 0; i < 7; i++) {
			print(a);
			c = a + b;
			a = b;
			b = c;
		}
		
		print("Se termino la serie");
	}
	
	public static void main(String [] args) {
		FibonacciSecuencial bs = new FibonacciSecuencial();
		bs.firstSolution();
	}
	
}
