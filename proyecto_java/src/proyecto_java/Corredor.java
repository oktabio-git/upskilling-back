package proyecto_java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Corredor extends Carrera {

	String nombre;
	int edad;
	
	public Corredor(int distancia, int ronda, long fecha, String nombre) {
		super(distancia, ronda, fecha);
		
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String letras(String nombre) {
		if (nombre.length() >= 3) {
            char primerLetra = Character.toUpperCase(nombre.charAt(0));
            char tercerLetra = Character.toUpperCase(nombre.charAt(2));

            return "Las letras son: " + primerLetra + tercerLetra;
        } else {
            return "El nombre debe tener al menos 3 caracteres.";
        }
	}
	
	@Override
	public String calcularDistancia(int a, int b) {
		// TODO Auto-generated method stub
		return "El corredor " + nombre + " recorrio una distancia de " + a * b + " metros.";
	}

	@Override
	public void fechaDeCarrera() {
		// TODO Auto-generated method stub
		Date tempFecha = new Date(fecha);
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formato.format(tempFecha);
        
		System.out.println("El corredor " + nombre + " debera presentarse el día " + fechaFormateada + " para la carrera."); 
	}
}
