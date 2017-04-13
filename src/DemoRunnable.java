
/**@Program to check prime number by thread class and RUNNALE interface.*/

/**@Import scanner package.*/
import java.util.Scanner;

/** @Implement interface runnable */
public class DemoRunnable implements Runnable {
	/** @Counter flag to 0 */
	int flag = 0;

	/** @Override run method */
	public void run() {
		System.out.println("Enter the no to check whether prime or not using RUNNABLE interface.");
		Scanner obj = new Scanner(System.in);
		/** @User input */
		int a = obj.nextInt();
		/** @Condition to check for prime number */
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				/** @Show Message for user input for number is not prime */
				System.out.println("Number is not prime.");
				flag++;
				break;
			}
		}
		/** @if counter remain unchanged */
		if (flag == 0) {
			/** @Show Message for user input for number is prime */
			System.out.println("Number is prime.");
		}
	}

	/** @Main method */
	public static void main(String[] args) {
		/** @DemoClass object */
		DemoRunnable obj1 = new DemoRunnable();
		/** @Thread class object */
		/** @Passing object */
		Thread t1 = new Thread(obj1);
		/** @Run method for t1 object */
		t1.run();
		/** @DemoThread object */
		DemoThread obj2 = new DemoThread();
		/** @Object passing */
		Thread t2 = new Thread(obj2);
		/** @Method to start thread t2 */
		t2.start();

	}
}