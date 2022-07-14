package Chapter1.For;

import java.util.Scanner;

//a,b를 포함하여 그 사이의 모든 정수의 합을 구한다.
//a와b 대소 상관없이 그 사이 모든 수의 합을 구해야 함. ex) a3 b5 12, a5 b3 이어도 12
public class SumOf {
    static int sumof(int a, int b) {
        int n = 0;
        if(a > b) {
            n = a;
            a = b;
            b = n;
        }
        int sum = 0;
        for(int i=a; i<=b; i++) {
            sum += i;
        }
        return sum;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a부터 b까지의 합을 구합니다.");
        System.out.print("a의 값 : "); int a = sc.nextInt();
        System.out.print("b의 값 : "); int b = sc.nextInt();

        System.out.println(a + "부터 " + b +"까지의 합은 " + sumof(a,b) + "입니다.");

    }
}
