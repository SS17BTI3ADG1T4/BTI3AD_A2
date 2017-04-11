import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class FastPrimTest.
 */
public class FastPrimTest {
  
  /** The c. */
  Counter c = new Counter();
  
  
  /**
   * Tests 0
   */
  @Test
    public void testPrimzahlen() {
    FastPrim prim = new FastPrim(c);
    
    assertEquals(new ArrayList<>(), prim.primzahlen(0));
  }
  
  
  /**
   * Tests 1
   */
  @Test
  public void testPrimzahlen1() {
    FastPrim prim = new FastPrim(c);
    ArrayList list = new ArrayList<>();
    
      assertEquals(list, prim.primzahlen(1));
  }
  
  
  /**
   * again useless?
   */
  @Test
  public void testPrimzahlen2() {
    FastPrim prim = new FastPrim(c);
    ArrayList list = new ArrayList<>();
    
      assertEquals(list, prim.primzahlen(1));
  }
  
  /**
   * Tests funktionality with an Interval
   */
  @Test
  public void testPrimzahlen3() {
    FastPrim prim = new FastPrim(c);
    ArrayList list = new ArrayList<>();
  
 
    list.add(2);
    list.add(3);
    list.add(5);
    list.add(7);
      assertEquals(list, prim.primzahlen(10));
  }
  
  /**
   * Tests for negative numbers
   */
  @Test
  public void testPrimzahlen4() {
    FastPrim prim = new FastPrim(c);
  ArrayList list = new ArrayList<>();
    assertEquals(list, prim.primzahlen(-1));
  }

}
