package io.jenkinsdemo.app;

/**
 * Created by prasantabiswas on 17/11/17.
 */
public class Calculator {
    private int v1;
    private int v2;

    public Calculator(int v1, int v2)
    {
        this.v1 = v1;
        this.v2 = v2;
    }

    public int add()
    {
        return v1+v2;
    }

    public int subtract()
    {
        return v1-v2;
    }

    public int multiply()
    {
        return v1*v2;
    }

    public int divide() throws ArithmeticException
    {
        return v1/v2;
    }
}
