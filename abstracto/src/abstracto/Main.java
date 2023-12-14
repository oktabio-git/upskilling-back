package abstracto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("¿Qué figura necesitas? ");
			String figura = sc.next();
			System.out.println("¿De qué color? ");
			String color = sc.next();
			int base;
			int altura;
			int lado;
			// PARA PROBAR EL TRY CATCH, PUEDES INTRODUCIR UNA LETRA A PARTIR DE ESTOS CAMPOS, 
			// LAS OPERACIONES NO PUEDEN SER REALIZADAS CON LETRAS.
			switch(figura) {
			case "cuadrado":
				System.out.println("¿Cuánto mide su lado? ");
				lado = sc.nextInt();
				Cuadrado cuadrado = new Cuadrado(color, figura, lado);
				System.out.println("Información de la " + cuadrado.leyenda() + "su perimetro es: "
						+ cuadrado.calcularPerimetro() + " y su area es: " + cuadrado.calcularArea());
				break;
			case "rectangulo":
				System.out.println("¿Cuánto mide su base? ");
				base = sc.nextInt();
				System.out.println("¿Cuánto mide su altura? ");
				altura = sc.nextInt();
				Rectangulo rectangulo = new Rectangulo(color, figura, base, altura);
				System.out.println("Información de la " + rectangulo.leyenda() + "su perimetro es: "
						+ rectangulo.calcularPerimetro() + " y su area es: " + rectangulo.calcularArea());
				break;
			case "triangulo":
				System.out.println("¿Cuánto mide su base? ");
				base = sc.nextInt();
				System.out.println("¿Cuánto mide su altura? ");
				altura = sc.nextInt();
				System.out.println("¿Cuánto mide su lado? (triangulo equilatero)");
				lado = sc.nextInt();
				Triangulo triangulo = new Triangulo(color, figura, base, altura, lado);
				System.out.println("Información de la " + triangulo.leyenda() + "su perimetro es: "
						+ triangulo.calcularPerimetro() + " y su area es: " + triangulo.calcularArea());
				break;
			default:
				System.out.println("No existe esa figura");;
				break;
			}
		} catch (Exception e) {
			System.out.println("Valores invalidos introducidos, repita la operación");
		}
		
	}

}
