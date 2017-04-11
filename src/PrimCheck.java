import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class PrimCheck.
 */
public class PrimCheck {

	/** The counter. */
	private Counter counter;

	/**
	 * Instantiates a new prim check.
	 */
	public PrimCheck() {
	}

	/**
	 * Instantiates a new prim check.
	 *
	 * @param counter the counter
	 */
	public PrimCheck(Counter counter) {
		this();
		this.counter = counter;
	}
	
	/**
	 * Checks if is prime.
	 *
	 * @param num the number to be checked
	 * @return true, if is prime
	 */
	public boolean isPrime(int num) {
    if(num<=1){
      return false;
    }
    if(num==2){
      count();
      System.out.print("\t" + counter.getCounter() + "\n");
      return true;
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
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Counter count = new Counter();
		PrimCheck test = new PrimCheck(count);
		System.out.print("Please input a number for the PrimCheck. ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		System.out.println("\n" + test.isPrime(n)+ "");
	}
	
	/**
	 * Checks if is prime 2.
	 * Has a much more narrow amount of Numbers to be checkable
	 * @param n the n
	 * @return true, if is prime 2
	 */
	//Source: http://stackoverflow.com/questions/2385909/what-would-be-the-fastest-method-to-test-for-primality-in-java
	public boolean isPrime2(int n) {
    return !new String(new char[n]).matches(".?|(..+?)\\1+");
}

}