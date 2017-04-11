import static org.junit.Assert.*;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class PrimCheckTest.
 */
public class PrimCheckTest {
  
  /** The c. */
  Counter c = new Counter();
  
  /**
   * Test is prime 0.
   */
  @Test
  public void testIsPrime() {
    PrimCheck check = new PrimCheck(c);
    assertEquals(false, check.isPrime(0));
  }

  
  /**
   * Test is prime 1.
   */
  @Test
  public void testIsPrime1() {
    PrimCheck check = new PrimCheck(c);
    assertEquals(false, check.isPrime(1));
  }
  
  /**
   * Test is prime 2.
   */
  @Test
  public void testIsPrime2() {
    PrimCheck check = new PrimCheck(c);
    assertEquals(true, check.isPrime(2));
  }
  
  /**
   * Test is prime 3.
   */
  @Test
  public void testIsPrime3() {
    PrimCheck check = new PrimCheck(c);
    assertEquals(true, check.isPrime(3));
  }
  
  /**
   * Test is prime 4.
   */
  @Test
  public void testIsPrime4() {
    PrimCheck check = new PrimCheck(c);
    assertEquals(false, check.isPrime(4));
  }
  
  /**
   * Test is prime 2147483647.
   */
  @Test
  public void testIsPrime2147483647() {
    PrimCheck check = new PrimCheck(c);
    assertEquals(true, check.isPrime(2147483647));
  }
  
  

  /**
   * Test is prime 2 59.
   */
  @Test
  public void testIsPrime2_59() {
    PrimCheck check = new PrimCheck(c);
    assertEquals(true, check.isPrime2(59));
  }
  
}
