package abstracto;

public class Rectangulo extends Figura {
	int base;
	int altura;

	public Rectangulo(String color, String nombreFigura, int base, int altura) {
		super(color, nombreFigura);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base * altura;
	}

	@Override
	public String leyenda() {
		return "Clase Rectangulo: ";
	}

	@Override
	public double calcularPerimetro() {
		return (base + altura) * 2;
	}
}
