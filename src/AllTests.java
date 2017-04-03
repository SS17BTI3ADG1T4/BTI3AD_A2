import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EratosthenesTest.class, FastPrimTest.class, PrimCheckTest.class, SlowPrimTest.class })
public class AllTests {

}
