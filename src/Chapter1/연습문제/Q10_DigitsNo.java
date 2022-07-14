package Chapter1.연습문제;

import java.util.Scanner;

//양의 정수를 입력하고 자릿수를 출력하는 프로그램
// 135를 입력 시 '그 수는 3자리입니다' 라고 출력
// 1314를 입력 시 '그 수는 4자리입니다' 라고 출력
public class Q10_DigitsNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        //n이 0보다 작을때 까지 10으로 나눈 후 count 증가.
        while (n > 0) {
            n /= 10;
            count++;
        }

        System.out.println("그 수는 " + count + "자리입니다.");
    }
}
