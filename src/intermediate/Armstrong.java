package intermediate;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int num = n;
	int digits = 0;
	int sum = 0;
	while (num != 0) {
		digits++;
		num /= 10;
	}
	num = n;
	while (num != 0) {
		int digit = num % 10;
		sum += (int) Math.pow(digit, digits);
		num /= 10;
	}
	if (sum == n) System.out.println("The number is Armstrong");
	else System.out.println("The number is not Armstrong");
}
}