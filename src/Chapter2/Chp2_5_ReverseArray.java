package Chapter2;

import java.util.Arrays;
import java.util.Scanner;

//배열 요소의 값을 읽어 역순으로 정렬
public class Chp2_5_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소수 :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] :");
            arr[i] = sc.nextInt();
        }

        reverse(arr);

        System.out.println("요소를 역순으로 정렬했습니다.");
        System.out.println("arr = " + Arrays.toString(arr));
    }

    static void swap(int[] arr, int idx1, int idx2) {
        int t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
    }

    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr,i, arr.length-i-1);
        }
    }
}
