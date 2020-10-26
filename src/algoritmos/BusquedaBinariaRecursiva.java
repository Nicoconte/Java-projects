package algoritmos;

import static utils.Utils.print;

import java.util.Arrays;

public class BusquedaBinariaRecursiva {
	
	//https://parzibyte.me/blog/2018/10/31/busqueda-binaria-arreglos-java/
	
	public int buscar(int [] arr, int datoABuscar, int izq, int der) {
		
		if (izq > der) {
			return -1;
		}

		int indiceMedio = (int) Math.floor((izq + der) / 2);
		int elementoDelMedio = arr[indiceMedio];
		
		if (elementoDelMedio == datoABuscar) {
			return indiceMedio;
		}
		
		if (datoABuscar < elementoDelMedio) {
			der = indiceMedio - 1;
			return buscar(arr, datoABuscar, izq, der);
		} else {
			izq = indiceMedio + 1;
			return buscar(arr, datoABuscar, izq, der);
		}
		
	}
	
	public static void main(String [] args) {
		BusquedaBinariaRecursiva bbr = new BusquedaBinariaRecursiva();
		
		int[] arr = {5, 27, 11, 21, 20, 7, 80, 85, 90, 95, 97, 98, 115, 500, 510, 512, 1019, 1020, 1021, 1024};
		
		Arrays.sort(arr);
		
		print(bbr.buscar(arr, 500, 0, arr.length - 1));
		
	}
	
}
