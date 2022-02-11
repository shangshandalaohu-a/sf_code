package 简单;

public class 有效的括号 {
    public static void main(String[] args) {
        int a = 3;
        for (int i = 0; i < 10; i++) {
            System.out.println("i");
            if (i == a) {
                break;
            }
        }

    }

    public static boolean isValid(String s) {
        int len = s.length() / 2;
        for (int i = 0; i < len - 1; i++) {
            s = s.replace("{}", "").replace("[]", "").replace("()", "");
        }

        return s.length() == 0;
    }

}
