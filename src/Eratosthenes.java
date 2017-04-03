import java.util.ArrayList;
import java.util.Scanner;

public class Eratosthenes {

	private Counter counter;

	public Eratosthenes() {
	}

	public Eratosthenes(Counter counter) {
		this();
		this.counter = counter;
	}

	public ArrayList<Integer> primzahlen(int N) {

		boolean[] a = new boolean[N];
		for (int i = 0; i < N; i++) {
			a[i] = true;
			count();
		}
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
