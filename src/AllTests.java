import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 * Test suite to run all test after each other
 * @author peter
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ EratosthenesTest.class, FastPrimTest.class, PrimCheckTest.class, SlowPrimTest.class })
public class AllTests {

}
