package Chapter1.연습문제;

import java.util.Scanner;

//n단의 피라미드를 출력하는 메서드를 작성해라
public class Q15_StarPira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("피라미드를 출력합니다.");

        do {
            System.out.print("단수는 : ");
            n = sc.nextInt();
        } while (n <= 0);

        spria(n);
    }


    static void spria(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
* 먼저 n이 4라고 하면 1단은 공백 3개와 별 1개
* 2단은 공백 2개와 별 3개
* 3단은 공백 1개와 별 5개
* 4단은 공백 0개와 별 7개
* ------> 따라서 공백은 n-i개 씩 출력, 별은 (n-1) * 2 + 1개 씩 출력하면 된다.
* */