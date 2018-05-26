package testing;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		System.out.println("input height: ");
		double height = reader.nextDouble();
		System.out.println("input length: ");
		double length = reader.nextDouble();
		System.out.println("input width: ");
		double width = reader.nextDouble();

		double volume = height * width * length;
		System.out.println("Result is: " + volume);
		reader.close();
	}

}
