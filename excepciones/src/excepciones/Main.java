package excepciones;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		try {
			int arr[] = new int[]{2, 4, 6};
			System.out.println(Arrays.toString(arr));
			System.out.println(arr[10]);
			System.out.println("aquí continua el codigo");
		} catch(Exception e) {
			System.out.println("Ocurrio un error!");
			//System.out.println(e);
		}
	}

}
