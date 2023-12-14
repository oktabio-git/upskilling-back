package abstracto;

public class Cuadrito extends Cuadrado {
	int ladito;
	
	public Cuadrito(String color, String nombreFigura, int lado) {
		super(color, nombreFigura, lado);
	}
	
	public String obtenerLadito() {
		ladito = 5;
		return "El ladito es: " + ladito;
	}
}
