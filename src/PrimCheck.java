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
	  if(num<=1){
	    return false;
	  }

		for (int i = 2; i <= Math.sqrt(num); i ++) {
			count();
			if (num % i == 0) {
				System.out.print("\t" + counter.getCounter() + "\n");
				return false;
			}
		}
		System.out.print("\t" + counter.getCounter() + "\n");
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
	
	//Source: http://stackoverflow.com/questions/2385909/what-would-be-the-fastest-method-to-test-for-primality-in-java
	public boolean isPrime2(int n) {
    return !new String(new char[n]).matches(".?|(..+?)\\1+");
}

}