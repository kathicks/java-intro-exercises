public class FizzBuzz {

    public String fizzBuzz(int num) {
        String result = "";
        for (int i = 1; i < num + 1; i++) {
            if (i % 15 == 0) {
                result += "FizzBuzz";
            }
            else if (i % 3 == 0) {
                result += "Fizz";
            }
            else if (i % 5 == 0) {
                result += "Buzz";
            }
            else {
                result += Integer.toString(i);
            }
            result += "\n";
        }
        return result;
    }
}
