import java.util.Scanner;

public class NumPrim {
	
	public static void main(String [] args) {
		int  numero;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println ("Introduzca un numero");
		numero = scanner.nextInt();
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println (" El resultado es " + i);
			}
	}
	}
}