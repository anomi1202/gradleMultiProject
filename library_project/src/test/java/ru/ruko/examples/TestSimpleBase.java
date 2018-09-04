package ru.ruko.examples;

import org.testng.annotations.BeforeSuite;

public class TestSimpleBase {
    protected Simple simple;
    protected int value = 5;

    @BeforeSuite
    public void init(){
        simple = new Simple();
        simple.setValue(value);
    }
}