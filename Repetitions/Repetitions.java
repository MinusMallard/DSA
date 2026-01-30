import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = 0;
        int ans = 1;
        char prev = ' ';
        for (char c : s.toCharArray()) {
            if (len == 0) len++;
            else if (c == prev) {
                len++;
                ans = Math.max(len, ans);
            } else {
                len = 1;
            }
            prev = c;
        }
        System.out.println(ans);
    }
}
