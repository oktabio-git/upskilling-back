package proyecto_java;

import java.io.IOException;
import java.util.Scanner;

public class ContarCaracter {

	public void main() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIntroduce una frase: ");
		String texto = sc.nextLine();
		System.out.print("Introduce el caracter a buscar: ");
		char caracter = (char) System.in.read();
		int resultado = contarCaracteres(texto, caracter);

		System.out.println("El caracter " + caracter + " aparece " + resultado + " veces.");
	}

	public static int contarCaracteres(String texto, char caracter) {
		int contador = 0;

		for (int i = 0; i < texto.length(); i++) {
			char caracterActual = texto.charAt(i);

			if (caracterActual == caracter) {
				contador++;
			}
		}

		return contador;
	}
	
}
