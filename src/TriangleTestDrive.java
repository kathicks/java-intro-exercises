import java.util.Objects;

public class TriangleTestDrive {

    public static void main (String[] args) {
        Triangle triangle = new Triangle();

        System.out.print("Exercise 1: ");
        check(triangle.easy(), "*");
        System.out.println(triangle.easy());
    }

    private static void check(String method, String result) {
        if (Objects.equals(method, result)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

}
