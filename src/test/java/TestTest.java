import org.junit.Ignore;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;
/**
 * @author Omer Ozkan
 * @version 16/03/16
 */
public class TestTest {
    @Test
    public void test1() throws Exception {
        assertTrue(true);
    }

    @Test
    public void test2() throws Exception {
        String unstable = System.getenv("UNSTABLE");
        if("true".equals(unstable)) {
            fail("failing test ehe3");
        }
    }

    @Test
    @Ignore
    public void test3() throws Exception {


    }
}
