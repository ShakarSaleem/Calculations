package testing;

import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("input 1st number: ");
		int num = reader.nextInt();
		System.out.println("input 2nd number: ");
		int num1 = reader.nextInt();
		System.out.println("input 3rd number: ");
		int num2 = reader.nextInt();
		System.out.println("input 4th number: ");
		int num3 = reader.nextInt();
		System.out.println("input 5th number: ");
		int num4 = reader.nextInt();

		double divide = (num + num1 + num2) / (num3 + num4);
		System.out.println("the division is: " + divide);

		reader.close();
	}
}
