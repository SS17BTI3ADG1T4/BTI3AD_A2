import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class EratosthenesTest.
 */
public class EratosthenesTest {
  
  /** The c. */
  Counter c = new Counter();
  
  /**
   * Tests for 0
   */
  @Test
  public void testPrimzahlen() {
  Eratosthenes prim = new Eratosthenes(c);
  
  assertEquals(new ArrayList<>(), prim.primzahlen(0));
}


/**
 * Tests for 1
 */
@Test
public void testPrimzahlen1() {
  Eratosthenes prim = new Eratosthenes(c);
  ArrayList list = new ArrayList<>();
  
    assertEquals(list, prim.primzahlen(1));
}


/**
 * Remove this one
 */
@Test
public void testPrimzahlen2() {
  Eratosthenes prim = new Eratosthenes(c);
  ArrayList list = new ArrayList<>();
  
    assertEquals(list, prim.primzahlen(1));
}

/**
 * Tests a real amount of numbers
 */
@Test
public void testPrimzahlen3() {
  Eratosthenes prim = new Eratosthenes(c);
  ArrayList list = new ArrayList<>();

  list.add(2);
  list.add(3);
  list.add(5);
  list.add(7);
    assertEquals(list, prim.primzahlen(10));
}

/**
 * Test for negative value
 */
@Test
public void testPrimzahlen4() {
  Eratosthenes prim = new Eratosthenes(c);
ArrayList list = new ArrayList<>();
  assertEquals(list, prim.primzahlen(-1));
}
}
