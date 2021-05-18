package stringhelper;

import org.junit.*;

public class BeforeAfterTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    // Setting up test data or something before executing tests
    @Before
    public void setup(){
        System.out.println("Before Test");
    }

    @Test
    public void test1(){
        System.out.println("test1 executed");
    }

    @Test
    public void test2(){
        System.out.println("test2 executed");
    }

    // Tear down data/connection after executing test ex. connection to db close
    @After
    public void teardown(){
        System.out.println("After Test");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }
}
