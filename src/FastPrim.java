import java.util.ArrayList;

public class FastPrim {
  
  private Counter counter;
  
  
  
  public FastPrim() {
  }
  
  
  public FastPrim(Counter counter) {
    this();
    this.counter = counter;
  }


  
  
  
  public ArrayList<Integer> primzahlen(int N) {
    boolean a[] = new boolean[N];
    count();
    for ( int i = 0; i < N ; i++){
      count();
      a[i] = true; 
    }
    
    //Algorithm
    for ( int i = 2; i < N; i++) {
      count();
      for ( int j = 2; j < Math.sqrt(i); j++){
        count();
        if ( (i%j == 0) && (j!=i) ){
          a[i] = false; 
          count();
          break;// Es genuegt, die innere Schleife abzubrechen, wenn bereits einmal eine Division geklappt hat. 
        }
      }
      }
    //endAlgorithm
    ArrayList<Integer> list = new ArrayList<>();
    for(int p =0; p<a.length;p++){
      count();
      if(a[p]){
        list.add(p);
        count();
      }
    }
    return list;
    
    }
  
  
  
  /**
   * Count.
   */
  private void count() {
        if(counter != null){
            counter.counterUp(1);
        }
    }
}
