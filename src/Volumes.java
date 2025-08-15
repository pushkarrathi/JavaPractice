import java.util.Scanner;

public class Volumes {
public static double volumeCone() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius and height of cone");
	double r = sc.nextDouble();
	double h = sc.nextDouble();
	return Math.PI*Math.pow(r,2)*h/3;
}
public static void main(String[] args) {
	System.out.println(volumeCone());
}
}
