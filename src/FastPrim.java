import java.util.ArrayList;

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
			for (int j = 2; j < Math.sqrt(i); j++) {
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
