package stringhelper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.*;

// Specifying it runs parameterized tests
@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

    StringHelper stringHelper=new StringHelper();

    private final String input;
    private final String expectedOutput;

    public StringHelperParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    // Define parameters
    @Parameters
    public static Collection<String[]> testConditions(){

        // input -> expected output

        String[][] expectedOutputs ={ { "AACD" , "CD" },{ "ACD" , "CD" } };

        return Arrays.asList(expectedOutputs);

    }


    @Test
    public void truncateAInFirst2Positions(){
        System.out.println(input); // traverses the Collection returned and checks for each input
        assertEquals(expectedOutput,stringHelper.truncateAInFirst2Positions(input));
    }

}