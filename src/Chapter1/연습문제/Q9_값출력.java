package Chapter1.연습문제;

import java.util.Scanner;

// 두 변수 a와 b에 정수를 입력하고 b-a를 출력하는 프로그램 작성
// * b에 입력한 값이 a값 이하이면 b를 다시 입력받아라 *
public class Q9_값출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.print("a값 : "); a = sc.nextInt();
        System.out.print("b값 : "); b = sc.nextInt();
        do {
            if(b <=a) {
                System.out.println("a보다 큰 값을 입력하세요!");
                System.out.print("b값 : ");
                b = sc.nextInt();
            }
        }while(b <= a);

        System.out.println("b-a는 " + (b-a) + "입니다.");
    }
}
