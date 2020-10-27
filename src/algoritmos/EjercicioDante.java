package algoritmos;

import java.util.Arrays;
import java.util.HashMap;


import static utils.Utils.*;

public class EjercicioDante {
	
	public int [] obtenerMinimos(int [][] matriz) {
		
		int size = matriz.length;
		int [] a = new int [ size ];
	
		for (int i = 0; i < size; i++) {
			a[i] = min(matriz[i]);
		}
		
		return a;
	}
	
	
	public HashMap<String, Integer> discriminarMinimos(int [] arr) {
		HashMap<String, Integer> minimos = new HashMap<String, Integer>();
		
		for (int n : arr) {
			minimos.put(String.valueOf(n), (int) Arrays.stream(arr).filter(i -> i == n).count());
		}
		
		return minimos;
	}
	
	
	public void mostrarMinimosPorPantalla(HashMap<String, Integer> mapa) {
		for (String n : mapa.keySet()) {
			print("Clave => " + n + " | Apariciones => " + mapa.get(n));
		}
	}
	
	public static void main(String [] args) {
		
		HashMap<String, Integer> aux;
		
		EjercicioDante ed = new EjercicioDante();	
		int [][] a = {{1,2,3,4}, {0,5,6,7,8}, {9,10,11,15,1}, {0, 3, 4, 6}};
		
		aux = ed.discriminarMinimos(ed.obtenerMinimos(a));
		
		ed.mostrarMinimosPorPantalla(aux);
		
	}
	
}
