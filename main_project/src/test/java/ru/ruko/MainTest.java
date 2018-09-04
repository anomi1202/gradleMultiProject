package ru.ruko;/*
  Created by IntelliJ IDEA.
  User: ruslan.kosykh
  Date: 04.09.2018
  Time: 12:06
  To change this template use File | Settings | File Templates.
*/

import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MainTest extends MainTestBase{

    @Test
    public void testSimple1(){
        MatcherAssert.assertThat(main.getSimpleValue(), is(value));
    }

    @Test
    public void testSimpleFail(){
        MatcherAssert.assertThat(main.getSimpleValue(), is(value * 2));
    }

    @Test
    public void testSimpleTwoFail(){
        MatcherAssert.assertThat(main.getSimpleTwoValue(), is(value));
    }

    @Test
    public void testSimpleTwo2(){
        MatcherAssert.assertThat(main.getSimpleTwoValue(), is(value * 2));
    }
}
