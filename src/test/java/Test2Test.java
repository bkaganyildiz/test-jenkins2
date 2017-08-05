import org.junit.Ignore;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * @author Omer Ozkan
 * @version 16/03/16
 */
public class Test2Test {

    @Test
    public void test4() throws Exception {
        String unstable = System.getenv("UNSTABLE");
        if("true".equals(unstable)) {
            fail("failing test");
        }
    }

    @Test
    @Ignore
    public void test5() throws Exception {


    }
}
