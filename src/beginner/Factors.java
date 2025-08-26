package beginner;

import java.util.Scanner;

public class Factors {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number for which factors are to be printed: ");
	int num = sc.nextInt();
	for (int i = 1; i < num; i++) {
		if (num % i == 0)
			System.out.print(i+" ");
	}
}
}
