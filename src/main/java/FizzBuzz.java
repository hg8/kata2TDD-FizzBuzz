public class FizzBuzz
{
    public String GetResult(int p_value)
    {
        if(p_value % 15 == 0)
        {
            return "FizzBuzz";
        }

        if(p_value % 3 == 0 )
        {
            return "Fizz";
        }
        if(p_value % 5 == 0)
        {
            return "Buzz";
        }

        return Integer.toString(p_value);
    }


}