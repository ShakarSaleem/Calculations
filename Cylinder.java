package testing;

import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		double pi = 3.14;

		System.out.println("input hight: ");
		double height = reader.nextDouble();
		System.out.println("and radius: ");
		double radius = reader.nextDouble();

		double volume = pi * (radius * radius) * height;
		double surfaceArea = 2 * pi * radius * height;
		System.out.println("the volume is: " + volume + " and the surface area is: " + surfaceArea);
		reader.close();

	}

}
