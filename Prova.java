import java.util.Scanner;

	public class Prova {

	public static void main(String[] args) {
		int numero1, numero2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número:");
		numero1 = scanner.nextInt();
		System.out.print("Introduzca el segundo número:");
		numero2 = scanner.nextInt();
		if (numero1 > numero2) {
			System.out.println("(num1) es mayor que(num2)");
		} else if (numero2 > numero1) {
			System.out.println("(num2) es mayor que (num1)");
		} else {
			System.out.println("(num1) y (num2) son iguales");
		}
	}
}

