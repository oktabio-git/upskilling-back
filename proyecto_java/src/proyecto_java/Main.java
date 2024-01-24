package proyecto_java;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		ImprimirNumeros imprimir = new ImprimirNumeros();
		imprimir.main();
		
		ContarCaracter contar = new ContarCaracter();
		contar.main();
		
		ArregloNumeros arreglo = new ArregloNumeros();
		arreglo.main();
		
		Calificacion calificacion = new Calificacion();
		calificacion.main();
		
		Categoria categoria = new Categoria(10, 3, System.currentTimeMillis(), 30, "Adultos");
		double raiz = categoria.raizCuadrada(categoria.getPersonas());
		System.out.println("\nLa raiz cuadrada de los participantes es: " + raiz);
		Corredor corredor = new Corredor(10, 3, System.currentTimeMillis(), "Lilian");
		String frase = corredor.letras(corredor.getNombre());
		System.out.println(frase);
		categoria.fechaDeCarrera();
		corredor.fechaDeCarrera();
	}
	
}
