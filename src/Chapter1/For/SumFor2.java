package Chapter1.For;

import java.util.Scanner;

//양수만 입력받아 1부터 n까지의 합 구하기.
//n의 값이 0이하일경우 값을 계속 입력 받아야함.
public class SumFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다.");

        int n;
        //n이 0보다 클때까지 무한 반복.
        do {
            System.out.print("n값 : ");
            n = sc.nextInt();
        } while (n <= 0);

        int sum = 0;

        for(int i=1; i<=n; i++) {
            sum += i;
        }

        System.out.println("1부터 " + n + "까지의 값은 " + sum + "입니다.");
    }
}
