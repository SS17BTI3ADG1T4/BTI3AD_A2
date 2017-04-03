import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class FastPrimTest {
  Counter c = new Counter();
  
  
  @Test
    public void testPrimzahlen() {
    FastPrim prim = new FastPrim(c);
    
    assertEquals(new ArrayList<>(), prim.primzahlen(0));
  }
  
  
  @Test
  public void testPrimzahlen1() {
    FastPrim prim = new FastPrim(c);
    ArrayList list = new ArrayList<>();
    
      assertEquals(list, prim.primzahlen(1));
  }
  
  
  @Test
  public void testPrimzahlen2() {
    FastPrim prim = new FastPrim(c);
    ArrayList list = new ArrayList<>();
    
      assertEquals(list, prim.primzahlen(1));
  }
  
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
  
  @Test
  public void testPrimzahlen4() {
    FastPrim prim = new FastPrim(c);
  ArrayList list = new ArrayList<>();
    assertEquals(list, prim.primzahlen(-1));
  }

}
