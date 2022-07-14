package Chapter1;

import java.util.Scanner;

// 1부터 n까지의 합과 그 값을 구하는 과정을 출력
// ex) n값 5면 -> 1 + 2 + 3 + 4 + 5 = 15 나오게
public class Chp1_10_SumVerbose1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다.");
        int n;

        // n이 0보다 클때 까지 반복 입력
        do {
            System.out.print("n 값 : ");
            n = sc.nextInt();
        } while (n <= 0);

        int sum = 0;

        //방법 1 -> for문으로 n 전까지만 출력 후 마지막에 n과 같이 n을 더한 sum을 출력.
        for(int i = 1; i <n; i++) {
            sum += i;       //sum에 i를 더함
            System.out.print(i + " + ");
        }
        sum += n;           //sum에 n을 더함
        System.out.println(n + " = " + sum);

        //방법 2 -> 이건 만약 숫자가 클수록 if문을 계속 수행 하므로 성능에 좋지 않다.
//        for(int i=1; i<=n; i++) {
//            if (i < n) {
//                System.out.print(i + " + ");
//            }
//            else System.out.print(i + " = ");
//            sum += i;
//        }
//        System.out.println(sum);
    }
}
