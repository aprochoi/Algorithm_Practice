package Chapter2.연습문제;

import java.util.Arrays;

//배열 b의 모든 요소를 배열 a에 역순으로 복사하는 rcopy메서드 작성
public class Q5_Rcopy {
    public static void main(String[] args) {
        int[] b = {1, 2, 3, 4, 5, 6, 7};
        int[] a = new int[b.length];

        reverse(b);
        rcopy(a, b);

        System.out.println(Arrays.toString(a));
    }

    static void rcopy(int[] a, int[] b) {
        System.arraycopy(b, 0, a, 0, b.length);

    }

    static void swap(int[] arr, int a, int b) {
        int t = arr[a];     // t = 1
        arr[a] = arr[b];    // arr[0] = 7
        arr[b] = t;         // arr[6] = 1
    }

    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - i - 1);
        }
    }
}
