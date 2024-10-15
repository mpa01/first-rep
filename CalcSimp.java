import java.util.Scanner;

public class CalcSimp {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero1, numero2, operacion;
		float resultado;
		
		System.out.println ("operacion");
		System.out.println ("1. Suma (+)");
		System.out.println ("2. Resta (-)");
		System.out.println ("3. Multiplicacion (*)");
		System.out.println ("4. Division (/)");
		
		operacion = scanner.nextInt();
		
		System.out.println ("Introduzca primer numero");
		numero1 = scanner.nextInt();
		
		System.out.println ("Introduzca segundo numero"); 
		numero2	= scanner.nextInt();
		
		if (operacion == 1 ) {
			resultado = numero1 + numero2;
		 System.out.println (" El resultado es " + resultado);
		} else if (operacion == 2 ) {
			resultado = numero1 - numero2;
		 System.out.println (" El resultado es " + resultado);
		} else if (operacion == 3 ) {
			resultado = numero1 * numero2;
		 System.out.println (" El resultado es " + resultado);
		} else if (operacion == 4 ) {
			if (numero2 != 0) {
			resultado = numero1 / numero2;
		 System.out.println (resultado);
		} else {
			System.out.println (" Error: no se puede dividir entre 0 ");
		} 
		
		}
	}
}
		
