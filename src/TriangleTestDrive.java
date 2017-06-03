import java.util.Objects;

public class TriangleTestDrive {

    public static void main (String[] args) {
        Triangle triangle = new Triangle();

        System.out.print("Exercise 1: ");
        check(triangle.easy(), "*");
        System.out.println(triangle.easy());

        System.out.print("Exercise 2: ");
        check(triangle.horizontalLine(8), "********");
        System.out.println(triangle.horizontalLine(8));

        System.out.print("Exercise 3: ");
        check(triangle.verticalLine(3), "*\n*\n*\n");
        System.out.print(triangle.verticalLine(3));
    }

    private static void check(String method, String result) {
        if (Objects.equals(method, result)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

}
