package Chapter3;

import java.util.Scanner;

public class chp3_4_BinSearch {

    //O 길이가 n개인 배열 a에서 key와 같은 요소를 이진 검색
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;     //O 검색 범위의 첫 인덱스
        int pr = n - 1; //O 검색 범위의 끝 인덱스

        do {
            int pc = (pl + pr) / 2; //O 중앙 요소의 인덱스
            //O a[pc]의 값과 key 의 값이 같으면 검색 성공
            if (a[pc] == key) return pc;
                //O a[pc]의 값이 key 의 값보다 작으면 검색 범위를 뒤쪽 절반으로 좁힌다.
            else if (a[pc] < key) pl = pc + 1;
                //O 그 외의 경우엔 검색 범위를 앞쪽 절반으로 좁힌다.
            else pr = pc - 1;
        } while (pl <= pr); //O 왼쪽 인덱스가 오른쪽 인덱스와 같거나 작을때 까지 반복

        return -1;  //O 검색 실패
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 길이를 입력하세요 : ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("각 요소들을 오름차순으로 입력하세요");

        System.out.print("a[0] : ");
        a[0] = sc.nextInt();

        for (int i = 1; i < n; i++) {
            do {
                System.out.print("a[" + i + "] : ");
                a[i] = sc.nextInt();
            } while (a[i] <= a[i - 1]);  //O 바로 앞 요소보다 작거나 같으면 다시 입력.
        }

        System.out.print("검색할 값을 입력하세요 : ");
        int key = sc.nextInt();

        int idx = binSearch(a, n, key); //O 배열 a에서 값이 key인 요소를 검색

        if (idx == -1) {
            System.out.println("그 값은 없습니다.");
        }
        else System.out.println("그 값은 a[" + idx +"]에 있습니다.");
    }

}
