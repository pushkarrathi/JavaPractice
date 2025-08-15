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
public static void main(String[] args) {
	System.out.println(volumeCone());
	System.out.println(volumePrism());
}
}
