package estructura_secuencial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un valor de 5 cifras:");
		Integer num = sc.nextInt();
		System.out.println(num/10000);
		System.out.println(num/1000);
		System.out.println(num/100);
		System.out.println(num/10);
		System.out.println(num);
		
		System.out.println("Introduce una temperatura en °C:");
		float temp = sc.nextFloat();
		float reamur;
		float kelvin;
		reamur = 80 * temp / 100;
		kelvin = temp + 273;
		System.out.println("Tu temperatura en grados Reamur es: " + reamur);
		System.out.println("Tu temperature en grados Kelvin es: " + kelvin);
	}

}
