package proyecto_java;

import java.util.Scanner;

public class ImprimirNumeros {

	public static void main() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Por favor, introduce un número entero positivo: ");
		// do {} while ()
		try {
			num = sc.nextInt();
			comprobandoNumero(num);
		} catch (Exception e) { // Cosas que no pueda controlar.
			System.out.println("Número introducido inválido, intente nuevamente");
			main();
		}
	}

	public static void comprobandoNumero(int num) {
		if (num > 0) {
			String longitud = Integer.toString(num);
			for (int i = 0; longitud.length() > i; i++) {
				String letra = Character.toString(longitud.charAt(i));
				// switch (cifra) {}
				if (letra.equals("0")) {
					System.out.print("cero");
				} else if (letra.equals("1")) {
					System.out.print("uno");
				} else if (letra.equals("2")) {
					System.out.print("dos");
				} else if (letra.equals("3")) {
					System.out.print("tres");
				} else if (letra.equals("4")) {
					System.out.print("cuatro");
				} else if (letra.equals("5")) {
					System.out.print("cinco");
				} else if (letra.equals("6")) {
					System.out.print("seis");
				} else if (letra.equals("7")) {
					System.out.print("siete");
				} else if (letra.equals("8")) {
					System.out.print("ocho");
				} else if (letra.equals("9")) {
					System.out.print("nueve");
				}
				if (longitud.length() != (i + 1)) {
					System.out.print(" - ");
				}
			}
		} else {
			System.out.println("El numero debe ser entero positivo, intente nuevamente");
			main();
		}
	}

}
