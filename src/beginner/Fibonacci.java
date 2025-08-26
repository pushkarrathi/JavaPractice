package beginner;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter numbers of terms until which fibonacci series is required: ");
	int n = sc.nextInt();
	int first = 0;
	int second = 1;
	int next;
	int count = 0;
	System.out.print("0 1");
	while (count < n-1) {
		next = first + second;
		first = second;
		second = next;
		System.out.print(" "+next);
		count++;
	}
}
}