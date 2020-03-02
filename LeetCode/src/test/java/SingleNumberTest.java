import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    @Test
    public void singleNumber() {
        Assert.assertEquals(SingleNumber.singleNumber(new int[]{1,1,2,2,3}),3);
        Assert.assertEquals(SingleNumber.singleNumber(new int[]{2,2,1}),1);
    }
}
