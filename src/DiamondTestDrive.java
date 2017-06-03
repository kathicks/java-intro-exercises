import java.util.Objects;

public class DiamondTestDrive {

    public static void main (String[] args) {
        Diamond diamond = new Diamond();

        System.out.print("Exercise 5: ");
        check(diamond.isosceles(3), "  *  \n *** \n*****\n");
        System.out.println(diamond.isosceles(3));

        System.out.print("Exercise 6: ");
        check(diamond.diamond(3), "  *  \n *** \n*****\n *** \n  *  \n");
        System.out.println(diamond.diamond(3));
    }

    private static void check(String method, String result) {
        if (Objects.equals(method, result)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
