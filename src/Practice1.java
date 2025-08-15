import java.util.Scanner;

public class Practice1 {
public static double areaCircle(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius of circle");
	double r = sc.nextDouble();
	return Math.PI*Math.pow(r,2);
}
public static double areaTriangle(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter height and base length of triangle");
	double h = sc.nextDouble();
	double b = sc.nextDouble();
	return h*b/2;
}
public static double areaRectangle() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length and width of rectangle");
	double l = sc.nextDouble();
	double w = sc.nextDouble();
	return l*w;
}
public static double areaIsoceles() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Isoceles side and base side length");
	double i = sc.nextDouble();
	double b = sc.nextDouble();
	return b*Math.pow(i*i - (b*b/4),0.5)/2;
}
public static double areaParallelogram() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter base and height of parallelogram");
	double b = sc.nextDouble();
	double h = sc.nextDouble();
	return b*h;
}
public static double areaRhombus() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter diagonals of rhombus");
	double d1 = sc.nextDouble();
	double d2 = sc.nextDouble();
	return d1*d2;
}
public static double areaEquilateralTriangle() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter side of equilateral triangle:");
	double s = sc.nextDouble();
	return Math.pow(3,0.5)*s*s/4;
}
public static void main(String[] args) {
	//System.out.println(areaCircle());
	//System.out.println(areaTriangle());
	//System.out.println(areaRectangle());
	//System.out.println(areaIsoceles());
	//System.out.println(areaParallelogram());
	//System.out.println(areaRhombus());
	System.out.println(areaEquilateralTriangle());
}
}