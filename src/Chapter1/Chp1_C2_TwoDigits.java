package Chapter1;

import java.util.Scanner;

//2자리 양수 입력(10~99)
public class Chp1_C2_TwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("2자리의 양수를 입력하세요");

        do {
            System.out.print("n의 값 : ");
            n = sc.nextInt();
        } while (n < 10 || n > 90);

        System.out.println("변수 n의 값은 " + n + "이 되었습니다.");
    }
}

/* do while 문에서 15행 n 값이 10보다 작거나 99보다 크면 루프 본문을 반복 */