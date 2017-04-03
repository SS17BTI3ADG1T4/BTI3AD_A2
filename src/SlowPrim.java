import java.util.ArrayList;
import java.util.Scanner;

public class SlowPrim {

	private Counter counter;

	public SlowPrim() {
	}

	public SlowPrim(Counter counter) {
		this();
		this.counter = counter;
	}

	public ArrayList<Integer> primzahlen(int N) {
		boolean a[] = new boolean[N];
		for (int i = 0; i < N; i++) {
			a[i] = true;
			count();
		}
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
		System.out.print("\t"+counter.getCounter() + "\n");
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
		SlowPrim test = new SlowPrim(count);
		System.out.print("Please input a number for the SlowPrim search. ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		System.out.println("\n" + test.primzahlen(n)+ "");
	}
}
