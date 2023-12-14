package abstracto;

public class Cuadrado extends Figura {
	int lado;

	public Cuadrado(String color, String nombreFigura, int lado) {
		super(color, nombreFigura);
		
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}
	
	@Override
	public String leyenda() {
		return "Clase Cuadrado: ";
	}

	@Override
	public double calcularPerimetro() {
		return lado * 4;
	}
}
