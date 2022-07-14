package Chapter1;

import java.util.Scanner;

//지정한 개수의 기호를 줄바꿈 없이 연속에서 출력하는 프로그램 기호는 +,- 번갈아가면서
public class Chp1_12_Alternative1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+와 -를 번갈아 n개 출력합니다.");
        System.out.print("n의 값 : "); int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            if(i % 2 == 0) System.out.print("-");   //짝수번째에 - 출력
            else System.out.print("+");             //홀수번째에 + 출력
        }
    }
}
/* 이 코드의 문제점
*  1. for문을 반복 할 때마다 if문 실행 -> i값이 홀수인지 알기 위해 if문을 모두 n번 수행햐야함. ex) n이 1억이면 if문도 1억번 수행
*  2. 변경 시 유연하게 대응이 어려움 -> 카운트용 변수인 i값은 1부터 n까지 1씩 증가함. 만약 i를 0부터 시작하려면 for문과 if문을 변경해야함.
* */