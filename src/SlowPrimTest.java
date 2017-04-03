import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SlowPrimTest {

  Counter c = new Counter();


  @Test
  public void testPrimzahlen() {
    SlowPrim prim = new SlowPrim(c);
  
    assertEquals(new ArrayList<>(), prim.primzahlen(0));
  }
  
  @Test
  public void testPrimzahlen1() {
    SlowPrim prim = new SlowPrim(c);
  ArrayList list = new ArrayList<>();
 
    assertEquals(list, prim.primzahlen(1));
  }
  
  @Test
  public void testPrimzahlen2() {
    SlowPrim prim = new SlowPrim(c);
  ArrayList list = new ArrayList<>();
  list.add(2);
    assertEquals(list, prim.primzahlen(2));
  }
  
  
  @Test
  public void testPrimzahlen10() {
    SlowPrim prim = new SlowPrim(c);
  ArrayList list = new ArrayList<>();
  list.add(2);
  list.add(3);
  list.add(5);
  list.add(7);
    assertEquals(list, prim.primzahlen(10));
  }
  
  @Test
  public void testPrimzahlen4() {
    SlowPrim prim = new SlowPrim(c);
  ArrayList list = new ArrayList<>();
    assertEquals(list, prim.primzahlen(-1));
  }

}
