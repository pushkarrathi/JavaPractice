package beginner;

import java.util.Scanner;

public class Perimeters {
public static double perimeterCircle() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius of circle");
	double r = sc.nextDouble();
	return Math.PI*2*r;
}
public static double perimeterEquilateralTriangle() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter side of equilateral triangle:");
	double s = sc.nextDouble();
	return 3*s;
}
public static double perimeterParallelogram() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter both sides of parallelogram");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	return 2*(a + b);
}
public static double perimeterRectangle() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter both sides of Rectangle");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	return 2*(a + b);
}
public static double perimeterSquare() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter side of square:");
	double s = sc.nextDouble();
	return 4*s;
}
public static double perimeterRhombus() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter side of rhombus:");
	double s = sc.nextDouble();
	return 4*s;
}
public static void main(String[] args) {
	System.out.println(perimeterCircle());
	System.out.println(perimeterEquilateralTriangle());
	System.out.println(perimeterParallelogram());
	System.out.println(perimeterRectangle());
	System.out.println(perimeterSquare());
	System.out.println(perimeterRhombus());
}
}
