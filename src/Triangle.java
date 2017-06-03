public class Triangle {

    public String easy() {
        return "*";
    }

    public String horizontalLine(int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += "*";
        }
        return result;
    }

    public String verticalLine(int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += "*\n";
        }
        return result;
    }

    public String rightTriangle(int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += buildString(i + 1);
            result += "\n";
        }
        return result;
    }

    private static String buildString(int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append("*");
        }
        return sb.toString();
    }
}
