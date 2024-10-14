import java.util.Scanner;

	public class Prova3{
	

	public static void main(String[] args) {
		int num, resultado;
		Scanner scanner = new  Scanner(System.in);
		//
		System.out.print("Introduzca su calificacion: ");
		num = scanner.nextInt();
		//
		for (int i = 0; i <= 20; i=i+1) {
			resultado = i * num;
			System.out.print(i + " x " + num + " = " + resultado); 
		}
		
		
		
		scanner.close();
	}
}
	