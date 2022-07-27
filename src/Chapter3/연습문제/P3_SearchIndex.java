package Chapter3.연습문제;

import java.util.ArrayList;
import java.util.Scanner;

public class P3_SearchIndex {
    public static void main(String[] args) {
        ArrayList<Integer> idx = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 길이 입력 : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("배열 요소 입력");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] :");
            arr[i] = sc.nextInt();
        }

        System.out.print("검색할 키 값 입력 : ");
        int key = sc.nextInt();

        int result = (searchIdx(arr,n,key,idx));

        System.out.println(key + "는 " + result + "개 있습니다.");
    }

    static int searchIdx(int[] arr, int n, int key, ArrayList<Integer> idx) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                idx.add(i);
            }
        }

        System.out.println("key 값은 각 " + idx + "번째에 있습니다.");

        return idx.size();
    }
}
