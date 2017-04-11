import java.util.ArrayList;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Eratosthenes.
 */
public class Eratosthenes {
	
	/** The counter. */
	private Counter counter;

	/**
	 * Instantiates a new eratosthenes.
	 */
	public Eratosthenes() {
	}

	/**
	 * Instantiates a new eratosthenes.
	 * with a counter
	 * @param counter the counter
	 */
	public Eratosthenes(Counter counter) {
		this();
		this.counter = counter;
	}

	/**
	 * Algorithm that caalculates all prime numbers from 1 to N
	 *
	 * @param N max number to be checked
	 * @return the array list of all primes in 1 to N
	 */
	public ArrayList<Integer> primzahlen(int N) {
	  if(N<=1){
		  System.out.print("\t" + counter.getCounter() + "\n");
      return new ArrayList<Integer>();
    }
    if(N==2){
      ArrayList<Integer> temp = new ArrayList<Integer>();
      temp.add(2);
	  System.out.print("\t" + counter.getCounter() + "\n");
      return temp;
    }

		boolean[] a = new boolean[N];
		for (int i = 0; i < N; i++) {
			a[i] = true;
			count();
		}
		a[0]=false;
    a[1]=false;
		for (int i = 2; i < Math.sqrt(N); i++) {
			count();
			if (a[i] == true) {
				for (int j = 2; i * j < N; j++) {
					a[i * j] = false;
					count();
				}

			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			count();
			if (a[i]) {
				list.add(i);
			}
		}
		System.out.print("\t" + counter.getCounter() + "\n");
		return list;
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
		Eratosthenes test = new Eratosthenes(count);
		System.out.print("Please input a number for the Eratosthenes search. ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		System.out.println("\n" + test.primzahlen(n)+ "");
	}
}
