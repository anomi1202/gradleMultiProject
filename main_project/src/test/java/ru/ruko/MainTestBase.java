package ru.ruko;/*
  Created by IntelliJ IDEA.
  User: ruslan.kosykh
  Date: 04.09.2018
  Time: 12:06
  To change this template use File | Settings | File Templates.
*/

import org.testng.annotations.BeforeSuite;
import ruko.Main;

public class MainTestBase {
    protected Main main;
    protected int value = 5;

    @BeforeSuite
    public void init(){
        main = new Main();
        main.setSimpleValue(value);
        main.setSimpleTwoValue(value);
    }
}
