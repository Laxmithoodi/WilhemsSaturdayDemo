import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class DiTest {

    @Test
    public void testRoll() {
        // fakeRandom.nextInt(6) returns 3 (+1 makes the expected value 4)
        Random fakeRandom = new Random(1L);
        Di di = new Di(fakeRandom);

        Integer value = di.roll();

        Assert.assertEquals(new Integer(4), value);
    }
}
