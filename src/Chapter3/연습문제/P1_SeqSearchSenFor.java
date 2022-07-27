package Chapter3.연습문제;

import java.util.Scanner;

public class P1_SeqSearchSenFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소수 : ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int idx = seqSearchSenFor(a, n, key);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        }
        else System.out.println("그 값은 a[" + idx + "] 에 있습니다.");

    }

    static int seqSearchSenFor(int[] a, int n, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }

        return -1;
    }
}
