package Chapter2;

import java.util.Scanner;

public class Chp2_9_PrimeNumberPlus {
    public static void main(String[] args) {
//        System.out.println(Math.sqrt(17));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sqrt = (int) Math.sqrt(n);
        System.out.println(sqrt);

        boolean flag = true;
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
