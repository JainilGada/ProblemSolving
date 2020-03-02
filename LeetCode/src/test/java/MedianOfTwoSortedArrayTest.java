import org.junit.Assert;
import org.junit.Test;


public class MedianOfTwoSortedArrayTest {

    @Test
    public void findMedianSortedArrays() {
        Assert.assertEquals(MedianOfTwoSortedArray.findMedianSortedArrays(new int[]{1,3},new int[]{2}),2,0);
        Assert.assertEquals(MedianOfTwoSortedArray.findMedianSortedArrays(new int[]{1,2},new int[]{3,4}),2.5,0);
    }
}
