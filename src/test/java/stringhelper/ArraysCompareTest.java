package stringhelper;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraysCompareTest {

    // Arrays.sort test

    @Test
    public void arraySort_RandomArray(){

        int[] numbers={12,3,4,1};
        int[] expectedValue={1,3,4,12};

        Arrays.sort(numbers);

        // False since they are reference/objects so we are comparing the addresses of the arrays
        // So it will fail
        /*assertEquals(expectedValue,numbers);*/

        // Passes
        assertArrayEquals(expectedValue,numbers);

    }

    @Test(expected = NullPointerException.class)
    // Testing for exception, we expect null pointer exception
    public void arraySort_NullArray(){
        int[] numbers=null;
        Arrays.sort(numbers);
    }

    @Test(timeout=1000)
    // Check for performance, we want them sorted in 1 second (1000 milliseconds)
    public void arraySort_Performance(){

        // Sort million arrays withing a particular period of time

        int array[]={12,23,4};

        for(int i=1;i<=1000000;i++){
            array[0]=i;
            Arrays.sort(array);
        }

    }

}
