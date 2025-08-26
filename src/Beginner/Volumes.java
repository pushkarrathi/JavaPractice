package Beginner;

import java.util.Scanner;

public class Volumes {
public static double volumeCone() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius and height of cone");
	double r = sc.nextDouble();
	double h = sc.nextDouble();
	return Math.PI*Math.pow(r,2)*h/3;
}
public static double volumePrism() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter base area and height of cone");
	double ba = sc.nextDouble();
	double h = sc.nextDouble();
	return ba*h;
}
public static double volumeCylinder() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius and height of cylinder");
	double r = sc.nextDouble();
	double h = sc.nextDouble();
	return Math.PI*Math.pow(r,2)*h;
}
public static double volumeSphere() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius of sphere");
	double r = sc.nextDouble();
	return Math.PI*Math.pow(r,3)*4/3;
}
public static double volumePyramid() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter base length, base width and height of pyramid");
	double bl = sc.nextDouble();
	double bw = sc.nextDouble();
	double h = sc.nextDouble();
	return bl*bw*h/3;
}
public static void main(String[] args) {
	System.out.println(volumeCone());
	System.out.println(volumePrism());
	System.out.println(volumeCylinder());
	System.out.println(volumeSphere());
	System.out.println(volumePyramid());
}
}
