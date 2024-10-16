import java.util.Scanner;	

public class ACT3_3_2 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		int i;
		int [] numeros;
		numeros = new int [10];
		
		for ( i = 0; i < numeros.length; i++) {
			numeros[i] = 100 + (int) (Math.random() * ((200 - 100) + 1));
		}
		for (int a : numeros) {
			System.out.println (a);
		}
	}
}
	
		
		