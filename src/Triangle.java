public class Triangle {

    public String easy() {
        return "*";
    }

    public String horizontalLine(int num) {
        String result = "*";
        for (int i = 1; i < num; i++) {
            result += "*";
        }
        return result;
    }
}
