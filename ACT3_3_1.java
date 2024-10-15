import java.util.Scanner;

public class ACT3_3_1 {
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] numero;
		numero = new int [10];
		
		for (int i = 0; i < numero.length; i++) {
			numero[i]=i+1;
		} for (int a : numero) {
			System.out.println(a);
		}
			
	}
}
		
		