import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EratosthenesTest {
  Counter c = new Counter();
  @Test
  public void testPrimzahlen() {
  Eratosthenes prim = new Eratosthenes(c);
  
  assertEquals(new ArrayList<>(), prim.primzahlen(0));
}


@Test
public void testPrimzahlen1() {
  Eratosthenes prim = new Eratosthenes(c);
  ArrayList list = new ArrayList<>();
  
    assertEquals(list, prim.primzahlen(1));
}


@Test
public void testPrimzahlen2() {
  Eratosthenes prim = new Eratosthenes(c);
  ArrayList list = new ArrayList<>();
  
    assertEquals(list, prim.primzahlen(1));
}

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

@Test
public void testPrimzahlen4() {
  Eratosthenes prim = new Eratosthenes(c);
ArrayList list = new ArrayList<>();
  assertEquals(list, prim.primzahlen(-1));
}
}
