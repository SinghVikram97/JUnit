package stringhelper;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    StringHelper stringHelper=new StringHelper();

    // AACD => CD  , ACD => CD , CDEF => CDEF  , CDAA => CDAA

    // name_condition(in which are testing)
    @Test
    public void testTruncateAInFirst2Positions_AInFirst2Positions() {
        // Expected, Actual
        assertEquals("CD",stringHelper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    // One condition should be checked per function
    public void testTruncateAInFirst2Positions_AInFirstPosition(){
        assertEquals("CD",stringHelper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame() {
    }
}