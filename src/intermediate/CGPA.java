package intermediate;

import java.util.Scanner;

public class CGPA {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int credit, grade;
	int creditSum = 0, cgpSum = 0;
	double cgpa = 0;
	System.out.println("Enter 'x' to exit loop at any time.");
	try {
		while (true) {
			System.out.print("Enter credits of subject: ");
			credit = sc.nextInt();
			System.out.println("Enter grade obtained for subject: ");
			grade = sc.nextInt();
			creditSum += credit;
			cgpSum += credit*grade;
			cgpa = (double) cgpSum / creditSum;
			System.out.printf("Current CGPA is %.2f\n", cgpa);
		}
	} catch (Exception e) {
		System.out.println("Exiting loop.");
	}
	System.out.println("\n-------------");
	System.out.printf("CGPA is %.2f\n", cgpa);
	System.out.println("-------------");

}
}
