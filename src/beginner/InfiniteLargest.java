package beginner;

import java.util.Scanner;

public class InfiniteLargest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int c;
	int largest = 0;
	do {
		System.out.print("Enter number for comparison, 0 to exit: ");
		c = sc.nextInt();
		largest = Math.max(largest, c);
	} while (c != 0);
	System.out.println("Largest number: "+largest);
}
}
