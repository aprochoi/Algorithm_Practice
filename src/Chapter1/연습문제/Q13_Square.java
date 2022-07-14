package Chapter1.연습문제;

import java.util.Scanner;

public class Q13_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정사각형을 출력합니다.");
        int n;
        do {
            System.out.print("변의 길이 : "); n = sc.nextInt();
        } while( n <= 0);


        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(n));
        }

    }
}
