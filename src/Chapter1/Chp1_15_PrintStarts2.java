package Chapter1;

import java.util.Scanner;

public class Chp1_15_PrintStarts2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*을 n개 출력하되 w개 마다 줄을 바꿔서 출력하세요.");
        System.out.print("n 값 : ");
        int n = sc.nextInt();
        System.out.print("w 값 : ");
        int w = sc.nextInt();

        for (int i = 0; i < n / w; i++) {                       // (1)
            System.out.println("*".repeat(w));
        }
        int rest = n % w;                                       // (2)
        if (rest != 0) {
            System.out.println("*".repeat(rest));
        }
    }
}
/*
* 1. (1) *을 w개 출력하면서 n/w번 실행 -> *.repeat(w)는 *을 w번 반복한 문자열을 생성하여 반환한다.
*    이는 String 클래스에 있는 인스턴스 메서드 이다. ex) "ABC".repeat(3) -> "ABCABCABC" 반환.
* 2. (2) *을 n%w번 출력하고 줄바꿈. 즉 n값이 w값의 배수가 아니라면 남아있는 마지막 줄 바꿈 진행.
* */