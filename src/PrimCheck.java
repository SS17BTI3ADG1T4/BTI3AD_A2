
public class PrimCheck {

	private Counter counter;

	public PrimCheck() {
	}

	public PrimCheck(Counter counter) {
		this();
		this.counter = counter;
	}

	public boolean isPrime(int num) {
		if (num % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i < num; i += 2) {
			count();
			if (num % i == 0) {
				return false;
			}
		}
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
}
