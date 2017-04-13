
/**@Import scanner package*/
import java.util.Scanner;

/** @DemoThread using Thread class */
public class DemoThread extends Thread {
	/** @Counter */
	int flag = 0;

	/** @Override run method */
	public void run() {
		/** @Try and catch block to handle interrupt */
		try {
			sleep(6000);
		} catch (InterruptedException e) {

		}
		/** @A message for user to input */
		System.out.println("Enter the no to check whether prime or not by THREAD class.");
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		/** @Logic for prime number */
		for (int i = 2; i < a - 1; i++) {
			/** @if condition */
			if (a % i == 0) {
				System.out.println(" ");
				/** @Show Message for user input for number is not prime */
				System.out.println("Number is not prime.");
				flag++;
				/** @Break statement */
				break;
			}
		}
		if (flag == 0) {
			/** @Show Message for user input for number is prime */
			System.out.println("Number is  prime.");
		}
	}
}