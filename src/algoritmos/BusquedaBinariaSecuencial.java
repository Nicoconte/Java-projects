package algoritmos;

import static utils.Utils.*;

import java.util.Arrays;

public class BusquedaBinariaSecuencial {
	
	
	/*
	 * Busqueda binaria secuencial
	 * @task: Busca un elemento proporcionado dentro de un array proporcionado tambien
	 * @Precon: El array debe estar ordenado
	 * @param int elemento, int[] arreglo
	 * @return pos. -1 si no lo encontro, de lo contrario, retorna la pos del elemento
 	 * */
	
	public int buscar(int datoABuscar, int[] arr) {
		int izq = 0;
		int der = arr.length - 1;
		
		int medio = 0;
		int elementoDelMedio = 0;
		
		while(izq <= der) {
			medio = (int) Math.floor((izq + der) / 2);
			elementoDelMedio = arr[medio];
			
			if (elementoDelMedio == datoABuscar) {
				return medio;
			}
			
			if (datoABuscar < elementoDelMedio) {
				der = medio - 1;
			} else {
				izq = medio + 1;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String [] args) {
		BusquedaBinariaSecuencial bbs = new BusquedaBinariaSecuencial();
		
		int[] arr = {5, 27, 11, 21, 20, 7, 80, 85, 90, 95, 97, 98, 115, 500, 510, 512, 1019, 1020, 1021, 1024};
		
		Arrays.sort(arr);
		
		print(bbs.buscar(1020, arr));
	
	}
}
