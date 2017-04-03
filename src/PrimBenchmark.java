public class PrimBenchmark {

	/** The counter. */
	static Counter counter;

	private final static int PRIM1=7;
  private final static int PRIM2=97;
  private final static int PRIM3=997;
  private final static int PRIM4=9973;
  private final static int PRIM5=99991;
  private final static int MAXPRIM= 2147483647;
	
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

    doBenchMarkTestPrimCheck(MAXPRIM);


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

	
private static void doBenchMarkTestPrimCheck(int N) {
    
    Counter countPrimCheck = new Counter();
    PrimCheck testPrimCheck = new PrimCheck(countPrimCheck);
    System.out.print("\t\t" + N);
    testPrimCheck.isPrime(N);

  }
}