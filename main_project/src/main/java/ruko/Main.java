package ruko;

import examples.SimpleTwo;
import ru.ruko.examples.Simple;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class);
    private Simple simple;
    private SimpleTwo simpleTwo;

    public Main() {
        this.simple = new Simple();
        this.simpleTwo = new SimpleTwo();
    }

    public int getSimpleValue() {
        return simple.getValue();
    }

    public void setSimpleValue(int value) {
        this.simple.setValue(value);
    }

    public int getSimpleTwoValue() {
        return simpleTwo.getValue();
    }

    public void setSimpleTwoValue(int value) {
        this.simpleTwo.setValue(value);
    }

    public static void main(String[] args) {
        LOG.info("Application started");
        System.out.println("I'm the main project");
        Simple simple = new Simple();
        simple.setValue(10);
        System.out.println("Value from Simple: " + simple.getValue());
        LOG.info("Application finished");
    }
}
