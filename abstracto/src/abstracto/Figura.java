package abstracto;

public abstract class Figura {
	
	String color;
	String nombre;
	
	public Figura(String color, String nombre) {
		this.color = color;
		this.nombre = nombre;
	}
	
	public String obtenerColor() {
		return color;
	}
	
	public String obtenerNombre() {
		return nombre;
	}
	
	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();
	
	public abstract String leyenda();
}
