package Chapter1;

import java.util.Scanner;

//실습 1-12를 수정
public class Chp1_13_Alternative2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+와 -를 번갈아 n개 출력합니다.");
        System.out.print("n의 값 : "); int n = sc.nextInt();

        for (int i = 1; i <= n / 2; i++) {
            System.out.print("+-");
        }

        if(n % 2 != 0) System.out.print("+");
        }
}

/*
1.for문은 +-를 n/2회 출력 예를들어 n이 12이면 6번 15면 7번 출력.
2.n이 홀수일때만 + 출력 15일 경우 +-를 7번 출력 후 맨 마지막에 + 출력
-> 이러면 반복할 때 마다 if문의 판단을 수행 할 필요가 없다. 그러므로 if문은 한번만 수행됨.
*/