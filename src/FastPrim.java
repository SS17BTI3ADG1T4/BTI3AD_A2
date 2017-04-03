import java.util.ArrayList;
import java.util.Scanner;

public class FastPrim {

	private Counter counter;

	public FastPrim() {
	}

	public FastPrim(Counter counter) {
		this();
		this.counter = counter;
	}

	public ArrayList<Integer> primzahlen(int N) {
		boolean a[] = new boolean[N + 1];
		for (int i = 0; i < N; i++) {
			count();
			a[i] = true;
		}

		// Algorithm
		for (int i = 3; i < N; i += 2) {
			count();
			for (int j = 2; j <= Math.sqrt(i); j++) {
				count();
				if ((i % j == 0) && (j != i)) {
					a[i] = false;
					break;// Es genuegt, die innere Schleife abzubrechen, wenn
							// bereits einmal eine Division geklappt hat.
				}
			}
			a[i+1] = false;
		}
		// endAlgorithm
		ArrayList<Integer> list = new ArrayList<>();
		for (int p = 0; p < a.length; p++) {
			count();
			if (a[p]) {
				list.add(p);
			}
		}
		System.out.println(counter.getCounter());
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
		FastPrim test = new FastPrim(count);
		System.out.print("Please input a number for the FastPrim search. ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
/*
		int count1, count2, count3, count4;
		test.slowSearch(n);
		count1 = test.count;
		test.fastSearch(n);
		count2 = test.count - count1;
		test.eratSearch(n);
		count3 = test.count - count2 - count1;
		//test.primeIndentify(n);
		for (int i = 0; i < n; i++) {
			test.primeIndentify(i);
		}
		count4 = test.count - count3 - count2 - count1;
		System.out.format("%d  %d  %d   %d\n", count1, count2, count3, count4);

*/	
		System.out.println("\n" + test.primzahlen(n)+ "");
	}
}
