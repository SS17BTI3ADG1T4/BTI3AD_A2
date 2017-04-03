public class PrimBenchmark {

	/** The counter. */
	static Counter counter;

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
<<<<<<< HEAD
		// counter = new Counter();
		int expsize = 32786;
		System.out.println("SlowPrim\tN\tT(N)");
		for (int i = 1; i <= expsize; i *= 2) {
			doBenchMarkTestSlowPrim(i);
		}
		System.out.println("\nFastPrim\tN\tT(N)"); // leere Zeile
		for (int i = 1; i <= expsize; i *= 2) {
			doBenchMarkTestFastPrim(i);
		}
		System.out.println("\nEratosthenes\tN\tT(N)");
		for (int i = 1; i <= expsize; i *= 2) {
			doBenchMarkTestEratosthenes(i);
		}
		System.out.println("\nPrimCheck\tN\tT(N)");
		for (int i = 1; i <= expsize; i *= 2) {
			doBenchMarkTestPrimCheck(i);
=======
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
>>>>>>> 687e8127d9591307066bba168b5afcc6642b517b
		}

		// int expsize = 5;
		// System.out.println("SlowPrim\tN\tT(N)");
		// for (int exp = 1; exp <= expsize; exp++) {
		// doBenchMarkTestSlowPrim(exp);
		// }
		// System.out.println("\nFastPrim\tN\tT(N)"); // leere Zeile
		// for (int exp = 1; exp <= expsize; exp++) {
		// doBenchMarkTestFastPrim(exp);
		// }
		// System.out.println("\nEratosthenes\tN\tT(N)");
		// for (int exp = 1; exp <= expsize; exp++) {
		// doBenchMarkTestEratosthenes(exp);
		// }
		// System.out.println("\nPrimCheck\tN\tT(N)");
		// for (int exp = 1; exp <= expsize; exp++) {
		// doBenchMarkTestPrimCheck(exp);
		// }
	}

	private static void doBenchMarkTestSlowPrim(int n) {
		// int size = (int) Math.pow(10, n);
		int size = n;
		Counter countSlow = new Counter();
		SlowPrim testSlowPrim = new SlowPrim(countSlow);
		System.out.print("\t\t" + size);
		testSlowPrim.primzahlen(size);

	}

	private static void doBenchMarkTestFastPrim(int n) {
		// int size = (int) Math.pow(10, n);
		int size = n;
		Counter countFast = new Counter();
		FastPrim testFastPrim = new FastPrim(countFast);
		System.out.print("\t\t" + size);
		testFastPrim.primzahlen(size);

	}

	private static void doBenchMarkTestEratosthenes(int n) {
		// int size = (int) Math.pow(10, n);
		int size = n;
		Counter countEratosthenes = new Counter();
		Eratosthenes testEratosthenes = new Eratosthenes(countEratosthenes);
		System.out.print("\t\t" + size);
		testEratosthenes.primzahlen(size);

	}

<<<<<<< HEAD
	private static void doBenchMarkTestPrimCheck(int n) {
		// int size = (int) Math.pow(10, n);
		int size = n;
=======
	private final static int MAXPRIM= 2147483647;
	private static void doBenchMarkTestPrimCheck(int exp) {
		int size = (int) Math.pow(10, exp);
>>>>>>> 687e8127d9591307066bba168b5afcc6642b517b
		Counter countPrimCheck = new Counter();
		PrimCheck testPrimCheck = new PrimCheck(countPrimCheck);
		System.out.print("\t\t" + size);
		testPrimCheck.isPrime(MAXPRIM);

	}
}