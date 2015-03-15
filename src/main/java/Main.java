
/**
 * Created by hugo on 14/03/15.
 */

public class Main {
    public static void main(String[] args) {
        FizzBuzz unFizzBuzz = new FizzBuzz();

        for (int i = 1; i < 100; i++) {
            System.out.println(unFizzBuzz.GetResult(i));
        }

    }
}
