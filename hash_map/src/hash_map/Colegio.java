package hash_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Colegio {
	Map<Integer, String> alumno = new HashMap<Integer, String>();
	 
	public void addAlumno() {
		 alumno.put(1, "Mexicana");
		 alumno.put(2, "Estadounidense");
		 alumno.put(3, "Aleman");
		 alumno.put(4, "Frances");
		 alumno.put(5, "Chino");
		 alumno.put(5, "Japones");
		 alumno.put(1, "Coreana");
		 
		 System.out.println(alumno);
		 
		 showAll();
		 
		 System.out.println("La cantidad de alumnos es: " + alumno.size());
	}
	
	public void showAll() {
		Iterator<Integer> it = alumno.keySet().iterator();
		while(it.hasNext()) {
			int key = (int) it.next();
			System.out.println("Numero de alumno: " + key + " Nacionalidad alumno: " + alumno.get(key));
		}
	}
	
	public void deleteAlumno(int id) {
		alumno.remove(id);
		showAll();
	}
}
