import java.util.Scanner;

public class Practice1 {
public static double AreaCircle(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius of circle");
	double r = sc.nextDouble();
	return Math.PI*Math.pow(r,2);
}
public static void main(String[] args) {
	System.out.println(AreaCircle());
}
}