package ruko;/*
  Created by IntelliJ IDEA.
  User: ruslan.kosykh
  Date: 04.09.2018
  Time: 11:41
  To change this template use File | Settings | File Templates.
*/

import ru.ruko.examples.Simple;

public class SimpleSettter {

    public static Simple newInstanceWitValue(int value){
        Simple simple = new Simple();
            simple.setValue(value);
        return simple;
    }
}
