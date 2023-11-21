package estructura_repetitiva;
import estructura_repetitiva.*;

public class Main {
	
	
	public static void main(String[] args) {
		While loop = new While();
		System.out.println("Ejercicio while: ");
		loop.test();
		DoWhile doLoop = new DoWhile();
		System.out.println("Ejercicio do while: ");
		doLoop.test();
		For forLoop = new For();
		System.out.println("Ejercicio for: ");
		forLoop.test();
		System.out.println("Ejercicio de conversion: ");
		loop.cambio();
		// System.out.println("Ejercicio de reloj: ");
		// forLoop.reloj();
		Switch switchLoop = new Switch();
		System.out.println("Ejercicio switch: ");
		switchLoop.estaciones();
		switchLoop.estaciones2();
		System.out.println("Ejercicio estaciones 3: ");
		switchLoop.estaciones3();
	}

}
