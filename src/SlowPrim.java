import java.util.ArrayList;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class SlowPrim.
 */
public class SlowPrim {

	/** The counter. */
	private Counter counter;

	/**
	 * Instantiates a new slow prim.
	 */
	public SlowPrim() {
	}

	/**
	 * Instantiates a new slow prim.
	 *
	 * @param counter the counter
	 */
	public SlowPrim(Counter counter) {
		this();
		this.counter = counter;
	}


  /**
   * Algorithm that calculates all prime numbers from 1 to N
   *
   * @param N max number to be checked
   * @return the array list of all primes in 1 to N
   */
	public ArrayList<Integer> primzahlen(int N) {
		if (N <= 1) {
			System.out.print("\t" + counter.getCounter() + "\n");
			return new ArrayList<Integer>();
		}
		if (N == 2) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(2);
			System.out.print("\t" + counter.getCounter() + "\n");
			return temp;
		}

		boolean a[] = new boolean[N];
		for (int i = 0; i < N; i++) {
			a[i] = true;
			count();
		}
		a[0] = false;
		a[1] = false;
		for (int i = 2; i < N; i++) {
			count();
			for (int j = 2; j < N; j++) {
				count();
				if ((i % j == 0) && (j != i)) {
					a[i] = false;
				}
			}
		}
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
		SlowPrim test = new SlowPrim(count);
		System.out.print("Please input a number for the SlowPrim search. ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		System.out.println("\n" + test.primzahlen(n) + "");
	}
}
