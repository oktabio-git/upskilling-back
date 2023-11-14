package estructura_condicional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Introduce el primer número:");
		/*a = sc.nextInt();
		System.out.println("Introduce el segundo número:");
		b = sc.nextInt();
		if(a > b) {
			System.out.println("El número " + a + " es mayor a " + b);
		} else if (b > a) {
			System.out.println("El número " + b + " es mayor a " + a);
		} else {
			System.out.println("Ambos numeros son iguales");
		}*/
		
		// EJERCICIO 2
		
		int c;
		int d;
		System.out.println("Introduce el primer número:");
		c = sc.nextInt();
		System.out.println("Introduce el segundo número:");
		d = sc.nextInt();
		int z = c/100;
		int w = d/100;
		System.out.println("Z: " + z + " W: " + w );
		if(((c / 100) == 0) || ((d / 100) == 0)) {
			System.out.println("Lo siento, tus numeros deben ser de 3 cifras");
		} else {
			if(c % 10 == d % 10) {
				System.out.println("Los numeros acaban en la misma cifra");
			} else {
				System.out.println("No terminan en la misma cifra");
			}
		}
		
		String conversion = String.valueOf(c);
		if(conversion.length() == 3) {
			System.out.println("Tu longitud es de 3");
		} else {
			System.out.println("Tu longitud NO es de 3");
		}
		
	}

}
