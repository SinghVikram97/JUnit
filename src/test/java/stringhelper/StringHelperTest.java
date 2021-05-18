package stringhelper;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    StringHelper stringHelper=new StringHelper();

    @Test
    public void truncateAInFirst2Positions() {
        // AACD => CD  , ACD => CD , CDEF => CDEF  , CDAA => CDAA

        String actualValue = stringHelper.truncateAInFirst2Positions("AACD");
        String expectedValue="CD";
        assertEquals(expectedValue,actualValue);

    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame() {
    }
}