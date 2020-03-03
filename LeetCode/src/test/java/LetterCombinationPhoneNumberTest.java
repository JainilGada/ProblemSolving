import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LetterCombinationPhoneNumberTest {

    @Test
    public void letterCombinations() {
        Assert.assertEquals(LetterCombinationPhoneNumber.letterCombinations("23").size(),9);
        Assert.assertEquals(LetterCombinationPhoneNumber.letterCombinations("").size(),0);
    }
}
