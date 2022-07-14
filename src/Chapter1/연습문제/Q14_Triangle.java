package Chapter1.연습문제;

import java.util.Scanner;

//직각이등변삼각형을 메서드로 작성
public class Q14_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이등변삼각형을 출력합니다.");
        int n;

        do {
            System.out.print("몇단 삼각형입니까? : "); n =sc.nextInt();
        } while (n <= 0);

        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");
        triangleLB(n);

        System.out.println("왼쪽 위가 직각인 이등변삼각형을 출력합니다.");
        triangleLU(n);

        System.out.println("오른쪽 위가 직각인 이등변삼각형을 출력합니다.");
        triangleRU(n);

        System.out.println("오른쪽 아래가 직각인 이등변삼각형을 출력합니다.");
        triangleRB(n);

    }

    static void triangleLB(int n) {

        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) { //왼쪽 위가 직각인 이등변 삼각형
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) { //오른쪽 위가 직각인 이등변 삼각형
        for (int i = n; i >= 1; i--) {
            System.out.print(" ".repeat(n-i));
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) { //오른쪽 아래가 직각인 이등변삼각형
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n-i));
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
