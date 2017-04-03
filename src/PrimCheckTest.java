import static org.junit.Assert.*;

import org.junit.Test;

public class PrimCheckTest {
  Counter c = new Counter();
  @Test
  public void testIsPrime() {
    PrimCheck check = new PrimCheck(c);
    assertEquals(false, check.isPrime(0));
  }

  
  @Test
  public void testIsPrime1() {
    PrimCheck check = new PrimCheck(c);
    assertEquals(false, check.isPrime(1));
  }
  
  @Test
  public void testIsPrime2() {
    PrimCheck check = new PrimCheck(c);
    assertEquals(true, check.isPrime(2));
  }
  
  @Test
  public void testIsPrime3() {
    PrimCheck check = new PrimCheck(c);
    assertEquals(true, check.isPrime(3));
  }
  
  @Test
  public void testIsPrime4() {
    PrimCheck check = new PrimCheck(c);
    assertEquals(false, check.isPrime(4));
  }
  @Test
  public void testIsPrime2147483647() {
    PrimCheck check = new PrimCheck(c);
    assertEquals(true, check.isPrime(2147483647));
  }
  
  

  @Test
  public void testIsPrime2_59() {
    PrimCheck check = new PrimCheck(c);
    assertEquals(true, check.isPrime2(59));
  }
  
}
