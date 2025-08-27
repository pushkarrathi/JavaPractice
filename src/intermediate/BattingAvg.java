package intermediate;

import java.util.Scanner;

public class BattingAvg {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean no;
	int score, count = 0, sum = 0;
	double avg = 0;
	try {
		while (true) {
			System.out.print("Enter the score (x to exit): ");
			score = sc.nextInt();
			System.out.print("Was the batsman out in this inning (true/false): ");
			no = sc.nextBoolean();
			if (no) count++;
			sum += score;
			avg = (double) sum /count;
			System.out.printf("Current average: %.2f\n", avg);
		}
	} catch (Exception e) {
		System.out.println("Exiting loop.\n");
	}
	System.out.printf("The batsman's average is %.2f\n", avg);
}
}
