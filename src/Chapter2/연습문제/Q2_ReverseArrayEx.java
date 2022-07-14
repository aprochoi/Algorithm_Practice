package Chapter2.연습문제;

import java.util.Arrays;
import java.util.Scanner;

//배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램
public class Q2_ReverseArrayEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소수 :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] :");
            arr[i] = sc.nextInt();
        }
        System.out.println();

        reverse(arr);

        System.out.println("역순 정렬을 마쳤습니다.");
        System.out.println("arr = " + Arrays.toString(arr));
    }

    // 배열 요소 arr[idx1]과 a[idx2]를 교환
    static void swap(int[] arr, int idx1, int idx2) {
        int t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
    }

    // 배열 arr의 요소를 역순으로 정렬
    static void reverse(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - i - 1);
            System.out.println("arr[" + i + "]와 " + "arr[" + (arr.length - i - 1) + "]을 교환합니다.");
            System.out.println(Arrays.toString(arr));
            System.out.println();
        }
    }
}
