package Chapter2.연습문제;

import java.util.Arrays;
import java.util.Scanner;

//배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하세요
public class Q4_Copy {
    public static void main(String[] args) {
//        int[] b = {1, 2, 3, 4, 5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력 하세요 : ");
        int n = sc.nextInt();

        int[] b = new int[n];
        int[] a = new int[b.length];

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        sc.close();

        copy(a,b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }

    //배열 b의 요소들을 배열 a로 copy
    static void copy(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }

        //System.arraycopy(b, 0, a, 0, b.length); -> 이 방법으로 위의 for문 처럼 사용 가능.
    }
}
