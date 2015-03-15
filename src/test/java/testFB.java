import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Created by hugo on 13/03/15.
 */
public class testFB
{
    FizzBuzz leFizzbuzz =new FizzBuzz();

    @Test
    public void testRetourneNombre() throws Exception
    {
        String expected = "1";

        String actual = leFizzbuzz.GetResult(1);

        Assert.assertEquals(actual,expected);

    }

    @Test
    public void testRetourneFizzAvec3() throws Exception
    {
        String actual = leFizzbuzz.GetResult(3);
        String expected = "Fizz";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRetournerFizzAvecTriple() throws Exception {
        Random rand = new Random();
        int multiple =1 + (int)(Math.random()* 100);
        int variable = 3 * multiple;
        String actual = leFizzbuzz.GetResult(variable);

        String expected = "Fizz";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testRetournerBuzzAvec5() throws Exception {
        String actual = leFizzbuzz.GetResult(5);
        String expected = "Buzz";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRetournerBuzzAvecQuintuple() throws Exception {
        Random rand = new Random();
        int multiple =1 + (int)(Math.random()* 100);
        int variable = 5 * multiple;

        String actual = leFizzbuzz.GetResult(10);
        String expected = "Buzz";

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRetournerFizzBuzzAvec15() throws Exception {
        String actual = leFizzbuzz.GetResult(15);
        String expected = "FizzBuzz";

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFizzBuzzAvecMultipleDe3Et5() throws Exception {
        Random rand = new Random();
        int multiple =1 + (int)(Math.random()* 100);
        int variable = 15 * multiple;

        String actual = leFizzbuzz.GetResult(variable);
        String expected = "FizzBuzz";

        Assert.assertEquals(expected, actual);

    }
}
