package io.jenkinsdemo.app;

/**
 * Created by prasantabiswas on 17/11/17.
 */
public class App {

    public static void main(String[] args)
    {
        System.out.println("Main method running");
        Calculator calc = new Calculator(10,20);
        System.out.println("Addition of 10 & 20: "+calc.add());
        System.out.println("Subtraction of 20 from 10: "+calc.subtract());
        System.out.println("Multiplication of 10 & 20: "+calc.multiply());
        System.out.println("Integer Division of 10 by 20: "+calc.divide());
    }
}
