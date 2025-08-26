import java.util.Scanner;

public class InfiniteSum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum = 0;
	int num;
	do {
		System.out.print("Enter number for addition, 0 to exit: ");
		num = sc.nextInt();
		sum += num;
	} while (num != 0);
	System.out.println("Sum: "+sum);
}
}
