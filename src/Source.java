public class Source {
    public static void main(String[] args) {
        String str = "+";
        int a = 4;
        int b = 7;
        System.out.println(basicMath(str, a, b) == 11);
    }

    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> 0;
        };
    }
}
