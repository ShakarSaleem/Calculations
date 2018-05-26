package testing;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		double pi = 3.14;

		System.out.println("input radius: ");
		double radius = reader.nextDouble();

		double area = pi * (radius * radius);
		System.out.println("Result is: " + area);
		reader.close();
	}

}
