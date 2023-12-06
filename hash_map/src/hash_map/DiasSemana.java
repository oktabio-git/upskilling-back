package hash_map;

import java.util.ArrayList;
import java.util.List;

public class DiasSemana {
	public void dias() {
		List<String> listDias = new ArrayList<String>();
		
		listDias.add("lunes");
		listDias.add("martes");
		listDias.add("miércoles");
		listDias.add("jueves");
		listDias.add("viernes");
		listDias.add("sábado");
		listDias.add("domingo");
		
		System.out.println(listDias);
		
		listDias.add(4, "valor_agreado");
		
		System.out.println(listDias);
		
		System.out.println(listDias.get(2));
		
		if(listDias.contains("lunes")) {
			System.out.println("Sí existe el lunes");
		} else {
			System.out.println("No existe");
		}
		
		listDias.clear();
		
		System.out.println(listDias);
	}
}
