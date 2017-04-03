import java.util.ArrayList;

public class Eratosthenes {

	private Counter counter;

	public Eratosthenes() {
	}

	public Eratosthenes(Counter counter) {
		this();
		this.counter = counter;
	}

	public ArrayList<Integer> allPrimes(int N) {

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
}
