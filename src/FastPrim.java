import java.util.ArrayList;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class FastPrim.
 */
public class FastPrim {

	/** The counter. */
	private Counter counter;

	/**
	 * Instantiates a new fast prim.
	 */
	public FastPrim() {
	}

	/**
	 * Instantiates a new fast prim.
	 * with a counter.
	 * @param counter the counter
	 */
	public FastPrim(Counter counter) {
		this();
		this.counter = counter;
	}

	/**
   * Algorithm that calculates all prime numbers from 1 to N
   *
   * @param N max number to be checked
   * @return the array list of all primes in 1 to N
   */
	public ArrayList<Integer> primzahlen(int n) {
	  if(n<=1){
		  System.out.print("\t" + counter.getCounter() + "\n");
      return new ArrayList<Integer>();
    }
    if(n==2){
      ArrayList<Integer> temp = new ArrayList<Integer>();
      temp.add(2);
	  System.out.print("\t" + counter.getCounter() + "\n");
      return temp;
    }
		boolean a[] = new boolean[n + 1];
		for (int i = 0; i < n; i++) {
			count();
			a[i] = true;
		}
		a[0]=false;
		a[1]=false;
		// Algorithm
		for (int i = 3; i < n; i += 2) {
			count();
			for (int j = 2; j <= Math.sqrt(i); j++) {
				count();
				if ((i % j == 0) && (j != i)) {
					a[i] = false;
					break;// Es genuegt, die innere Schleife abzubrechen, wenn
							// bereits einmal eine Division geklappt hat.
				}
			}
			a[i + 1] = false;
		}
		// endAlgorithm
		ArrayList<Integer> list = new ArrayList<>();
		for (int p = 0; p < a.length; p++) {
			count();
			if (a[p]) {
				list.add(p);
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
		FastPrim test = new FastPrim(count);
		System.out.print("Please input a number for the FastPrim search. ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		System.out.println("\n" + test.primzahlen(n) + "");
	}
}
