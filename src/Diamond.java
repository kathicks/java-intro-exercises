import java.util.Arrays;

public class Diamond {

    public String isosceles(int num) {
        int width = (num * 2) - 1;

        String result = "";
        for (int i = 1; i <= num; i++) {
            String[] row = new String[width];
            for(int x = 0; x < row.length; x++) {
                row[x] = " ";
            }
            for(int a = num - i; a < width - (num - i); a++) {
                row[a] = "*";
            }
            String line = String.join("", row);
            result += line + "\n";
        }
        return result;
    }
}
