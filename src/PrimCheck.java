import java.util.Scanner;

public class PrimCheck {

	private Counter counter;

	public PrimCheck() {
	}

	public PrimCheck(Counter counter) {
		this();
		this.counter = counter;
	}
	
	public boolean isPrime(int num) {

		for (int i = 2; i <= Math.sqrt(num); i ++) {
			count();
			if (num % i == 0) {
				System.out.println(counter.getCounter());
				return false;
			}
		}
		System.out.println(counter.getCounter());
		return true;
	}

	/**
	 * Count.
	 */
	private void count() {
		if (counter != null) {
			counter.counterUp(1);
		}
	}
	public static void main(String[] args) {
		Counter count = new Counter();
		PrimCheck test = new PrimCheck(count);
		System.out.print("Please input a number for the PrimCheck. ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		System.out.println("\n" + test.isPrime(n)+ "");
	}

}
