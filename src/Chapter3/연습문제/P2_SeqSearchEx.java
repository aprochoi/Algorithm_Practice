package Chapter3.연습문제;

import java.util.Scanner;

public class P2_SeqSearchEx {
    static int seqSearchEx(int[] arr, int n, int key) {
        System.out.print("arr |");
        for (int i = 0; i < n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.print("---+");
        for (int i = 0; i < 4 * n + 2; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("    |");
            System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
            System.out.printf("%3d |", i);
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", arr[j]);
            }
            System.out.println("\n    |");
            if(arr[i] == key) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int idx = seqSearchEx(arr, n, key);

        if (idx == -1) {
            System.out.println("그 값의 요소는 없습니다.");
        }
        else System.out.println("그 값의 요소는 arr[" + idx + "] 에 있습니다.");
    }
}
