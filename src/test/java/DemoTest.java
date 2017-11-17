import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by prasantabiswas on 17/11/17.
 */
public class DemoTest {

    @Test
    public void testAddition()
    {
        int expectedResult = 30;
        Demo demo = new Demo(10,20);
        int actualResult = demo.add();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSubtraction()
    {
        int expectedResult = 15;
        Demo demo = new Demo(20,5);
        int actualResult = demo.subtract();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testMultiplication()
    {
        int expectedResult = 600;
        Demo demo = new Demo(20,30);
        int actualResult = demo.multiply();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testDivision()
    {
        int expectedResult = 4;
        Demo demo = new Demo(20,5);
        int actualResult = demo.divide();
        Assert.assertEquals(actualResult,expectedResult);
    }

}
