package com.geometry;
import java.util.Scanner;
public class Line {
	public static void main(String[] args) {
//		Welcome Message
		System.out.println("Welcome to line comparison computation");
		double x1, y1, x2, y2; // variable define
		double length1, length2;
		// taking input from the user
		System.out.println("Enter the coordinate for line1");
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		// compution
		 length1 = Math.sqrt(Math.pow(x2, x1), 2 + Math.pow(y2, y1), 2);
		System.out.println("Enter the coordinate for line2");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		 length2 = Math.sqrt(Math.pow(x2, x1), 2 + Math.pow(y2, y1), 2);
		System.out.println("Line1 Length" + "" + length1);
		System.out.println("Line2 Length" + "" + length2);
		Double line1 = Double.valueOf(length1);
		Double line2 = Double.valueOf(length2);
		int val = line1.compareTo(line2); // compare operator for line
		if (val == 0) {
			System.out.println("Two line are eqaul");
		} else if (val > 0) {
			System.out.println("Line 1 is greater than line2");
		} else
			System.out.println("Line 1 is less than line2");

	}

}
	