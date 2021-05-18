package stringhelper;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    StringHelper stringHelper=new StringHelper();

    // AACD => CD  , ACD => CD , CDEF => CDEF  , CDAA => CDAA

    // name_condition(in which are testing)
    @Test
    public void truncateAInFirst2Positions_AInFirst2Positions() {
        // Expected, Actual
        assertEquals("CD",stringHelper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    // One condition should be checked per function
    public void truncateAInFirst2Positions_AInFirstPosition(){
        assertEquals("CD",stringHelper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void truncateAInFirst2Positions_ANotInFirst2Positions(){
        assertEquals("CDAA",stringHelper.truncateAInFirst2Positions("CDAA"));
    }

    @Test
    public void truncateAInFirst2Positions_ANotInString(){
        assertEquals("CDEF",stringHelper.truncateAInFirst2Positions("CDEF"));
    }

    // ABCD => false , ABAB => true , AB => true , A => false

    @Test
    public void areFirstAndLastTwoCharactersTheSame_BasicNegativeScenario(){
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame_BasicPositiveScenario(){
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame_StringLengthTwo(){
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame_StringLengthOne(){
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
    }
}