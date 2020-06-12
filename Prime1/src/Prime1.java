import java.util.Scanner;

public class Prime1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		boolean flag = false;
		int i;
		
		// integer input
		System.out.println("Enter an integer: ");
		num = input.nextInt();
		
		// prime check
		for (i = 2; i <= num/2; ++i){
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		
		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
		
		input.close();		
	}
}
