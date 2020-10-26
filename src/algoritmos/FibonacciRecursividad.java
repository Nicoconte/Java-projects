package algoritmos;

import static utils.Utils.print;

public class FibonacciRecursividad {
	public int firstSolution(int limite, int contador, int a, int b, int c) {
		if (contador == limite) {
			print("Se termino la serie");
		} else {
			print(a);
			c = a + b;
			a = b;
			b = c;
			contador++;
			return firstSolution(limite, contador, a, b, c);
		}
		
		return -1;
	}
	
	public static void main(String [] args) {
		FibonacciRecursividad br = new FibonacciRecursividad();
		br.firstSolution(7, 0, 0, 1, 0);
	}
	
}
