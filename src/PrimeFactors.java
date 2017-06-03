import java.util.ArrayList;

public class PrimeFactors {

    public ArrayList<Integer> generate(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        int tracker = n;
        for (int i = 2; i <= tracker; i++) {
            if (tracker % i == 0) {
                result.add(i);
                tracker /= i;
            }
        }
        return result;
    }
}
