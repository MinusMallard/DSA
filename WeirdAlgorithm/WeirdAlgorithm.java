package WeirdAlgorithm;

import java.util.*;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.print(STR."\{n} ");
        while (n != 1) {
            if (n%2 == 0) {
                System.out.print(STR."\{n / 2} ");
                n = n/2;
            } else {
                n = n * 3 + 1;
                System.out.print(STR."\{n} ");
            }
        }
    }
}