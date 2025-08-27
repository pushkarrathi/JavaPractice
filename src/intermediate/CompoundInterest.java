package intermediate;

import java.util.Scanner;

public class CompoundInterest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the principal amount: ");
	double p = sc.nextDouble();
	System.out.print("Enter time of compounding in years: ");
	int t = sc.nextInt();
	System.out.print("Enter rate of interest (%): ");
	double r = sc.nextDouble();
	double pU = p;
	while (t != 0) {
		pU += pU*r/100;
		t--;
	}
	double ci = pU-p;
	System.out.printf("The compound interest is %.2f", ci);
}
}
