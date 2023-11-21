package estructura_repetitiva;

public class Switch {
	public void estaciones() {
		int month = 3;
		switch (month) {
		case 1:
			System.out.println("El mes es enero y la estación es invierno");
			break;
		case 2:
			System.out.println("El mes es febrero y la estación es invierno");
			break;
		case 3:
			System.out.println("El mes es marzo y la estación es primavera");
			break;
		default:
			break;
		}
	}
	
	public void estaciones2() {
		int count = 2;
		String estacion = "";
		String mes = "";

		switch (count) {
		case 1:
			mes = "enero";
			estacion = "invierno";
			break;
		case 2:
			mes = "febrero";
			estacion = "invierno";
			break;
		case 3:
			mes = "marzo";
			estacion = "primavera";
			break;
		}
		System.out.println("El mes es " + mes + " y la estación es " + estacion);
	}
	
	public void estaciones3() {
		int numeroMes = 1;
		String estacion = "Enero", mes = "";
		
		switch (numeroMes) {
		case 12:
			mes = "Diciembre";
		case 1:
			mes = "Enero";
		case 2:
			mes = "Febrero";
			estacion = "Invierno";
			break;
		}
		System.out.println("El mes de " + mes + " se encuentra en la estación " + estacion);

	}
}
