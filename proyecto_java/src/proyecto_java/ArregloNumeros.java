package proyecto_java;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArregloNumeros {

	public void main() {
		try {
			ArrayList<Integer> numeros = leerNumeros();
			mostrarResultados(numeros);
		} catch (InputMismatchException e) {
			System.out.println("Error: Ingresa solo números enteros.");
		}
	}

	private static ArrayList<Integer> leerNumeros() {
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa números enteros. Termina con -99:");

		int numero;
		do {
			System.out.print("Número: ");
			numero = sc.nextInt();

			if (numero != -99) {
				numeros.add(numero);
			}

		} while (numero != -99);

		return numeros;
	}

	private static void mostrarResultados(ArrayList<Integer> numeros) {
		int cantidad = numeros.size();
		int suma = sumarNumeros(numeros);
		double media = calcularMedia(suma, cantidad);

		StringBuilder listaFormateada = new StringBuilder();
		for (int i = 0; i < numeros.size(); i++) {
			listaFormateada.append(numeros.get(i));
			if (i < numeros.size() - 1) {
				listaFormateada.append(", ");
			}
		}
		System.out.println("\nValores introducidos: \n" + listaFormateada);

		System.out.println("\nResultados:");
		System.out.println("Número de valores: " + cantidad);
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);

		System.out.println("\nValores mayores que la media:");
		for (int valor : numeros) {
			if (valor > media) {
				System.out.println(valor);
			}
		}
	}

	private static int sumarNumeros(ArrayList<Integer> numeros) {
		int suma = 0;
		for (int numero : numeros) {
			suma += numero;
		}
		return suma;
	}

	private static double calcularMedia(int suma, int cantidad) {
		if (cantidad == 0) {
			return 0;
		}
		return (double) suma / cantidad;
	}

}
