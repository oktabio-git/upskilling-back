package proyecto_java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Categoria extends Carrera {

	int personas;
	String nombre;
	
	public Categoria(int distancia, int ronda, long fecha, int personas, String nombre) {
		super(distancia, ronda, fecha);
		
		this.personas = personas;
		this.nombre = nombre;
	}

	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double raizCuadrada(int num) {
		return Math.sqrt(num);
	}

	@Override
	public String calcularDistancia(int a, int b) {
		// TODO Auto-generated method stub
		return "La distancia en la categoria " + nombre + " es de " + a * b + " metros, con una cantidad de " + personas
				+ " participantes.";
	}

	@Override
	public void fechaDeCarrera() {
		// TODO Auto-generated method stub
		Date tempFecha = new Date(fecha);
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formato.format(tempFecha);

		System.out.println("La carrera de " + nombre + " se realizara el día " + fechaFormateada + "."); 
	}
}
