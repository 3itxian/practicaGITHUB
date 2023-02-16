import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		int num1, num2, num3, numsum;
		
		System.out.println("Introdueix tres numeros:");
		num1 = teclat.nextInt();
		num2 = teclat.nextInt();
		num3 = teclat.nextInt();
		
		numsum = num1 + num2 + num3;
		
		if (numsum % 2 == 0) {
			System.out.println(numsum + " es parell.");
		}
		else {
			System.out.println(numsum + " es imparell");
		}
	}

}
