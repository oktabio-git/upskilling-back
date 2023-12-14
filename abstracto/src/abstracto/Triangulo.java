package abstracto;

public class Triangulo extends Figura {
	int base;
	int altura;
	int lado;
	
	public Triangulo(String color, String nombreFigura, int base, int altura, int lado) {
		super(color, nombreFigura);
		
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}
	
	@Override
	public String leyenda() {
		return "Clase Triangulo: ";
	}

	@Override
	public double calcularPerimetro() {
		return lado * 3;
	}
}
