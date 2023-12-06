package hash_map;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Colegio colegio = new Colegio();
		colegio.addAlumno();
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué alumno deseas eliminar?");
//		colegio.deleteAlumno(sc.nextInt());
		
		DiasSemana ds = new DiasSemana();
		ds.dias();
	}

}
