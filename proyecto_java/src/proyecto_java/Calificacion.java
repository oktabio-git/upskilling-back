package proyecto_java;

import java.util.Scanner;

public class Calificacion {

	public void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIngresa una calificación numérica entre 0 y 10: ");

        try {
            double nota = scanner.nextDouble();
            // if superior para no recorrer todos en caso de nota incorrecta
            if (nota >= 0 && nota < 5) {
                System.out.println("Nota Alfabética: Insuficiente");
            } else if (nota >= 5 && nota < 6) {
                System.out.println("Nota Alfabética: Suficiente");
            } else if (nota >= 6 && nota < 7) {
                System.out.println("Nota Alfabética: Bien");
            } else if (nota >= 7 && nota < 9) {
                System.out.println("Nota Alfabética: Notable");
            } else if (nota >= 9 && nota <= 10) {
                System.out.println("Nota Alfabética: Sobresaliente");
            } else {
                System.out.println("La nota es incorrecta");
                main();
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida. Debes ingresar un número.");
        } finally {
            scanner.close();
        }
    }
}
