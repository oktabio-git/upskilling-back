package arrays;

import java.util.Scanner;

public class Ordenamiento {
	Scanner sc = new Scanner(System.in);
	int[] numeros = new int[10];
	int temp = 0;  
	
	public void ordena() {
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Inserta un número en la posición " + i + " de tu arreglo:");
			numeros[i] = sc.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < (numeros.length - i); j++) {
				if (numeros[j - 1] > numeros[j]) {
					temp = numeros[j - 1];
					numeros[j - 1] = numeros[j];
					numeros[j] = temp;
				}

			}
		}
		
		System.out.print("El arreglo ordenado es: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		} 
	}
}
