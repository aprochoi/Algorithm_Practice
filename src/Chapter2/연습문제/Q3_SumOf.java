package Chapter2.연습문제;

import java.util.Scanner;

//배열 a의 모든 요쇼의 합계를 구하여 반환하는 메서드 구현
public class Q3_SumOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] 의 값 : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("배열 모든 요소의 합은 " + sumOf(arr) + "입니다.");
    }

    static int sumOf(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
}
