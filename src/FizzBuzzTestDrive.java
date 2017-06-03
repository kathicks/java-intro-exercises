import java.util.Objects;

public class FizzBuzzTestDrive {

    public static void main (String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        System.out.print("FizzBuzz: ");
        check(fizzBuzz.fizzBuzz(15), "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n");
        System.out.println(fizzBuzz.fizzBuzz(100));
    }

    private static void check(String method, String result) {
        if (Objects.equals(method, result)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
