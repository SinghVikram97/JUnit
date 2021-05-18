package stringhelper;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    StringHelper stringHelper=new StringHelper();

    @Test
    public void truncateAInFirst2Positions() {

        // AACD => CD  , ACD => CD , CDEF => CDEF  , CDAA => CDAA

        // Expected, Actual
        assertEquals("CD",stringHelper.truncateAInFirst2Positions("AACD"));
        assertEquals("CD",stringHelper.truncateAInFirst2Positions("ACD"));
        assertEquals("CDEF",stringHelper.truncateAInFirst2Positions("CDEF"));
        assertEquals("CDAA",stringHelper.truncateAInFirst2Positions("CDAA"));


    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame() {
    }
}