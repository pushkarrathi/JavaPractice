package intermediate;

import java.util.Scanner;

public class Average {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num;
	int sum = 0, count = 0;
	System.out.println("Enter numbers for averaging out, x for exit");
	double avg = 0;
	try {
		while (true) {
			num = sc.nextInt();
			sum += num;
			count++;
			avg = (double) sum / count;
			System.out.println("Average = " + avg);
		}
	} catch (Exception e) {
		System.out.println("Exiting loop.");
	}
	System.out.printf("Average = %.3f", avg);
}
}
