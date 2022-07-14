package Chapter3;


import java.util.Scanner;

//선형 검색(보초법)
public class Chp3_3_SeqSearchSen {
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;

        //무한루프 -> return 이나 break으로 빠져 나올 수 있다.
        while (true) {
            if (a[i] == key) {
                break;
            }
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소수 : ");
        int n = sc.nextInt();
        int[] a = new int[n+1];           //요소수가 n+1인 배열

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int idx = seqSearchSen(a, n, key);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 a[" + idx + "]에 있습니다.");
        }
    }
}
