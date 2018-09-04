package examples;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestSimpleTwo extends TestSimpleTwoBase{

    @Test
    public void testFail(){
        assertThat(simpleTwo.getValue(), is(value));
    }

    @Test
    public void test2(){
        assertThat(simpleTwo.getValue(), is(value * 2));
    }
}