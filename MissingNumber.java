import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        for (int i = 1; i <= n; i++) {
            num ^= i;
        }
        for (int i = 1; i < n; i++) {
            num ^= sc.nextInt();
        }
        System.out.println(num);
    }
}
