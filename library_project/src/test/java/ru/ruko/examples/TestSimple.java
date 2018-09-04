package ru.ruko.examples;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestSimple extends TestSimpleBase {

    @Test
    public void test1(){
        assertThat(simple.getValue(), is(value));
    }

    @Test
    public void testFail(){
        assertThat(simple.getValue(), is(value * 2));
    }
}