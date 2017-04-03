public class PrimBenchmark {

	/** The counter. */
	static Counter counter;

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		counter = new Counter();
		int expsize = 3;
		System.out.println("SlowPrim\tN\t\tT(N)");
		for (int exp = 1; exp <= expsize; exp++) { 
			doBenchMarkTestSlowPrim(exp);
		}
		System.out.println("\nFastPrim\tN\t\tT(N)"); // leere Zeile
		for (int exp = 1; exp <= expsize; exp++) { 
			doBenchMarkTestFastPrim(exp);
		}
		System.out.println("\nEratosthenes\tN\t\tT(N)");
		for (int exp = 1; exp <= expsize; exp++) { 
			doBenchMarkTestEratosthenes(exp);
		}
		System.out.println("\nPrimCheck\tN\t\tT(N)");
		for (int exp = 1; exp <= expsize; exp++) { 
			doBenchMarkTestPrimCheck(exp);
		}
	}

	private static void doBenchMarkTestSlowPrim(int exp) {
		int size = (int) Math.pow(10, exp);
		Counter countSlow = new Counter();
		SlowPrim testSlowPrim = new SlowPrim(countSlow);
		System.out.print("\t\t" + size);
		testSlowPrim.primzahlen(size);

	}

	private static void doBenchMarkTestFastPrim(int exp) {
		int size = (int) Math.pow(10, exp);
		Counter countFast = new Counter();
		FastPrim testFastPrim = new FastPrim(countFast);
		System.out.print("\t\t" + size);
		testFastPrim.primzahlen(size);

	}

	private static void doBenchMarkTestEratosthenes(int exp) {
		int size = (int) Math.pow(10, exp);
		Counter countEratosthenes = new Counter();
		Eratosthenes testEratosthenes = new Eratosthenes(countEratosthenes);
		System.out.print("\t\t" + size);
		testEratosthenes.primzahlen(size);

	}

	private final static int MAXPRIM= 2147483647;
	private static void doBenchMarkTestPrimCheck(int exp) {
		int size = (int) Math.pow(10, exp);
		Counter countPrimCheck = new Counter();
		PrimCheck testPrimCheck = new PrimCheck(countPrimCheck);
		System.out.print("\t\t" + size);
		testPrimCheck.isPrime(MAXPRIM);

	}
}