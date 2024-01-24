package proyecto_java;

public abstract class Carrera {
	
	int distancia;
	int ronda;
	long fecha;
	
	public Carrera(int distancia, int ronda, long fecha) {
		this.distancia = distancia;
		this.ronda = ronda;
		this.fecha = fecha;
	}
	
	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public int getRonda() {
		return ronda;
	}

	public void setRonda(int ronda) {
		this.ronda = ronda;
	}

	public long getFecha() {
		return fecha;
	}

	public void setFecha(long fecha) {
		this.fecha = fecha;
	}

	public abstract String calcularDistancia(int a, int b);
	
	public abstract void fechaDeCarrera();
}
