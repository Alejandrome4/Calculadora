package org.example;/*import java.util.Scanner;

private Scanner sc = new Scanner ( System.in);
*/

public class UI {
    public static String PrintHeader() {
        return ("-----------BIENVENIDO A TU CALCULADORA-------------");

    }

    public static String OperationRequest() {
        System.out.println("Inidica la operacion entre las siguientes ");
        return Keyboards.ReadString();
    }

    public static double FirstNumberRequest() {
        while (true) {
            System.out.println("Introduce el nmero:");
            String s = Keyboards.ReadString();
            if (Calculator.IsReal(s)) {
                return Double.parseDouble(s);
            }
            System.out.println("Numero no valido");
        }
    }
        public static double SECONDNumberRequest() {
            while (true) {
                System.out.println("Introduce el segundo nmero:");
                String s = Keyboards.ReadString();
                if (Calculator.IsReal(s)) {
                    return Double.parseDouble(s);
                }
                System.out.println("Numero no valido");
            }

        }
        public static void PrintResult(double result){
        System.out.println("Resultado"+ result);
        
        }
}
