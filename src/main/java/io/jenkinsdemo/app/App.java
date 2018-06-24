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
        System.out.println("Subtraction of 10 from 20: "+calc.subtract());
        System.out.println("Multiplication of 10 & 20: "+calc.multiply());
        System.out.println("Division of 20 by 10: "+calc.divide());
    }
}
