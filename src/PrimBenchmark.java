public class PrimBenchmark {

	/** The counter. */
	static Counter counter;

	private final static int PRIM1 = 3;
	private final static int PRIM2 = 7;
	private final static int PRIM3 = 13;
	private final static int PRIM4 = 31;
	private final static int PRIM5 = 61;
	private final static int PRIM6 = 127;
	private final static int PRIM7 = 251;
	private final static int PRIM8 = 509;
	private final static int PRIM9 = 1021;
	private final static int PRIM10 = 2039;
	private final static int PRIM11 = 4093;
	private final static int PRIM12 = 8191;
	private final static int PRIM13 = 16381;
	private final static int PRIM14 = 32719;
	private final static int MAXINTEGERPRIM = 2147483647;
	
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
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
		
		doBenchMarkTestPrimCheck(PRIM1);

		doBenchMarkTestPrimCheck(PRIM2);

		doBenchMarkTestPrimCheck(PRIM3);

		doBenchMarkTestPrimCheck(PRIM4);

		doBenchMarkTestPrimCheck(PRIM5);
		
		doBenchMarkTestPrimCheck(PRIM6);

		doBenchMarkTestPrimCheck(PRIM7);

		doBenchMarkTestPrimCheck(PRIM8);

		doBenchMarkTestPrimCheck(PRIM9);
		
		doBenchMarkTestPrimCheck(PRIM10);

		doBenchMarkTestPrimCheck(PRIM11);

		doBenchMarkTestPrimCheck(PRIM12);

		doBenchMarkTestPrimCheck(PRIM13);
		
		doBenchMarkTestPrimCheck(PRIM14);
System.out.println("\nGroesste Integer Primzahl");
		doBenchMarkTestPrimCheck(MAXINTEGERPRIM);

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
		System.out.print("\t" + size);
		testSlowPrim.primzahlen(size);

	}

	private static void doBenchMarkTestFastPrim(int n) {
		// int size = (int) Math.pow(10, n);
		int size = n;
		Counter countFast = new Counter();
		FastPrim testFastPrim = new FastPrim(countFast);
		System.out.print("\t" + size);
		testFastPrim.primzahlen(size);

	}

	private static void doBenchMarkTestEratosthenes(int n) {
		// int size = (int) Math.pow(10, n);
		int size = n;
		Counter countEratosthenes = new Counter();
		Eratosthenes testEratosthenes = new Eratosthenes(countEratosthenes);
		System.out.print("\t" + size);
		testEratosthenes.primzahlen(size);

	}

	private static void doBenchMarkTestPrimCheck(int N) {

		Counter countPrimCheck = new Counter();
		PrimCheck testPrimCheck = new PrimCheck(countPrimCheck);
		System.out.print("\t" + N);
		testPrimCheck.isPrime(N);

	}
}