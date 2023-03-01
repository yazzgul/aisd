import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teamName = scanner.nextLine();
        String[] ar = new String[3];
        for (int i = 0; i < 3; i++) {
            ar[i] = scanner.nextLine();
        }
//        это место позже подредактирую, не универсальный (либо сортировка пузырьком)
        if (check(ar[0], ar[2]) == ar[2]) {
            String t = ar[2];
            ar[2] = ar[0];
            ar[0] = t;
        }
        if (check(ar[0], ar[1]) == ar[1]) {
            String t = ar[1];
            ar[1] = ar[0];
            ar[0] = t;
        }
        if (check(ar[1], ar[2]) == ar[2]) {
            String t = ar[2];
            ar[2] = ar[1];
            ar[1] = t;
        }
        System.out.println(teamName + ": " + ar[0] + ", " + ar[1] + ", " + ar[2]);
    }

    public static String check(String f, String s) {
        if (f.length() < s.length()) {
            String t;
            t = s;
            s = f;
            f = t;
        }
        for (int i = 0; i < s.length(); i++) {
            int t = f.charAt(i) - s.charAt(i);
            if (t > 0) {
//                1)s 2)f
                return s;
            }
            if (t < 0) {
//                1)f 2)s
                return f;
            }
        }
        return s;
    }
}