package beginner;

import java.util.Scanner;

public class Product_minus_Sum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number for which subtraction of the product and sum of digits is required: ");
	int n = sc.nextInt();
	int sum = 0;
	int product = 1;
	while(n > 0) {
		int digit = n%10;
		product *= digit;
		sum += digit;
		n /= 10;
	}
	System.out.println(product-sum);
}
}
