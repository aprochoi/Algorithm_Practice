package Chapter3;

import java.util.Scanner;

public class Chp3_2_SeqSearchFor {
    // 요소수가 n이 배열 a에서 key와 값이 같은 요소를 선형 검색
    // for문으로 while 대신 구현
    static int seqSearch(int[] a, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소수 : ");
        int n = sc.nextInt();
        int[] a = new int[n];           //요소수가 n인 배열

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int idx = seqSearch(a, n, key);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 a[" + idx + "]에 있습니다.");
        }
    }
}
