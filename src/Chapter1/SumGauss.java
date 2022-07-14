package Chapter1;

import java.util.Scanner;

//가우스덧셈? -> 1~10의 합은 (1+10) * 5 로도 구할 수 있음.
public class SumGauss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가우스 덧셈 방식을 사용하여 1부터 n까지의 합을 구합니다.");
        System.out.print("n값 : "); int n = sc.nextInt();

        int sum = 1 + n;
        double gauss = (double)n/2;
        double result = sum * gauss;

        System.out.println("1부터 " + n + "까지의 합은 " + (int)result + "입니다.");

    }
}
