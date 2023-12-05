package arrays;

import java.util.Scanner;

public class Promedio {
	Scanner sc = new Scanner(System.in);
	int[] numeros = new int[10];
	double promedio = 0;
	int med = 0;
	int sum = 0;
	
	public void media () {
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Inserta un número en la posición " + i + " de tu arreglo:");
			numeros[i] = sc.nextInt();
		}
		
		for(int i = 0; i < numeros.length; i++) {
			sum += numeros[i];
		}
		
		promedio = sum/numeros.length;
		System.out.println("El promedio de los numeros es: " + promedio);
	}
	
	public void mediana() {
		med = numeros[numeros.length/2];
		System.out.println("La media de los numeros es: " + med);
	}
	
}
