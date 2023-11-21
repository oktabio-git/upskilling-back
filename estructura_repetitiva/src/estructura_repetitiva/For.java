package estructura_repetitiva;

public class For {
	public void test() {
		for (int count = 1; count <= 10; count++) {
			System.out.println(count);
		}
	}
	
	public void reloj() {
		for (int horas = 0; horas < 24; horas++) {
			for (int minutos = 0; minutos < 60; minutos++) {
				for (int segundos =0; segundos < 60; segundos++) {
					System.out.println(horas + ":" + minutos + ":" + segundos + " horas");
				}	
			}
		}
	}
}
