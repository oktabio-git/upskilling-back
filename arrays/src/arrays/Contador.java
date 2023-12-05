package arrays;

import java.util.Scanner;

public class Contador {
	Scanner sc = new Scanner(System.in);
	int[] numeros = new int[10];
	int positivos = 0;
	int negativos = 0;
	int ceros = 0;
	
	public void cuenta() {
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Inserta un número en la posición " + i + " de tu arreglo:");
			numeros[i] = sc.nextInt();
		}
		
		for(int i =0; i<numeros.length; i++) {
			if (numeros[i] < 0) {
				negativos++;
			} else if (numeros[i] == 0) {
				ceros++;
			} else {
				positivos++;
			}
		}
		
		System.out.println("Tienes " + positivos + " numeros positivos");
		System.out.println("Tienes " + negativos + " numeros negativos");
		System.out.println("Tienes " + ceros + " numeros ceros");
	}
	
}
