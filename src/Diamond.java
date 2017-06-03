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

    public String diamond(int num) {
        int width = (num * 2) - 1;
        int height = (num * 2) - 1;

        String result = "";
        for (int i = 1; i <= height; i++) {
            String[] row = new String[width];
            for(int x = 0; x < row.length; x++) {
                row[x] = " ";
            }
            if (i < num) {
                for(int a = num - i; a < width - (num - i); a++) {
                    row[a] = "*";
                }
            } else {
                for(int a = i - num; a < width - (i - num); a++) {
                    row[a] = "*";
                }
            }
            String line = String.join("", row);
            result += line + "\n";
        }
        return result;
    }

    public String diamondName(int num) {
        int width = (num * 2) - 1;
        int height = (num * 2) - 1;

        String result = "";
        for (int i = 1; i <= height; i++) {
            String[] row = new String[width];
            for(int x = 0; x < row.length; x++) {
                row[x] = " ";
            }
            if (i < num) {
                for(int a = num - i; a < width - (num - i); a++) {
                    row[a] = "*";
                }
            } else {
                for(int a = i - num; a < width - (i - num); a++) {
                    row[a] = "*";
                }
            }
            String line;
            if (i == num) {
                line = "Kat";
            } else {
                line = String.join("", row);
            }
            result += line + "\n";
        }
        return result;
    }
}
