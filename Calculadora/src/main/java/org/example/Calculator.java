package org.example;

public class Calculator {

    public static boolean IsReal(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
