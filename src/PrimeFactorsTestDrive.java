import java.util.*;

public class PrimeFactorsTestDrive {

    public static void main (String[] args) {
        PrimeFactors primeFactors = new PrimeFactors();

        ArrayList<Integer> expectation = new ArrayList<Integer>();
        expectation.add(2);
        expectation.add(3);
        expectation.add(5);

        System.out.print("Prime Factors: ");
        check(primeFactors.generate(30), expectation);
        System.out.println(primeFactors.generate(30));
    }

    private static void check(ArrayList<Integer> method, ArrayList<Integer> result) {
        if (Objects.equals(method, result)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
