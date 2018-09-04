package examples;

import org.testng.annotations.BeforeSuite;

public class TestSimpleTwoBase {
    protected SimpleTwo simpleTwo;
    protected int value = 5;

    @BeforeSuite
    public void init(){
        simpleTwo = new SimpleTwo();
        simpleTwo.setValue(value);
    }
}