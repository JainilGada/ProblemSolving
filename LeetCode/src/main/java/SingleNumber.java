import java.util.Arrays;

public class SingleNumber {

    /*
    * https://leetcode.com/problems/single-number/
    * */

    public static int singleNumber(int[] nums) {
        //Find Bitwise XOR of each number, same number gets cancelled of
        return Arrays.stream(nums).reduce((i1,i2)->i1^i2).getAsInt();
    }
}
