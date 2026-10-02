package org.example;

public class Engine {

     static  double result =0.0;
        public static double PerformOperation(double num1, double num2, String operation) {

            if (operation.equals('+')) {
                return num1 + num2;
            }
            if (operation.equals('-')) {
                return num1 - num2;
            }
            if (operation.equals('*')) {
                return num1 * num2;
            }
            if (operation.equals('/')){
                return num1 / num2;
            }
            return  0;
        }
     public static void salida(){
            return;
        }



    }




