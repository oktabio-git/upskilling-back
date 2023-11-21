package estructura_repetitiva;
import java.util.*;

public class While {
	public void test(){
		int count = 1;
		while(count <= 10) {
			System.out.println(count);
			count++;
		}
	}
	
	public void cambio() {
		double conversion = 3.50;
		int dollar = 1;
		while (dollar <= 10) {
			System.out.println(dollar + " dolar vale " + (dollar * conversion) + " pesos");
			dollar++;
		}
	}
}
