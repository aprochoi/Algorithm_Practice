package Chapter2;

import java.util.Scanner;

//배열 요소의 최대값 출력 (값 입력받음)
public class Chp2_3_MaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("키의 최대값을 구합니다.");
        System.out.print("사람 수 : ");
        int n = sc.nextInt();   //배열의 요소수를 입력받음

        int[] heigth = new int[n];  //입력받은 n의 요소수만큼 배열 생성성
        for (int i = 0; i < heigth.length; i++) {
            System.out.print("height["+i+"] : ");
            heigth[i] = sc.nextInt();
        }

        System.out.println("최대값은 " + maxOf(heigth) + "입니다.");
    }

    // 배열 a의 최댓값을 구하여 반환
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] > max) max = a[i];
        }
        return  max;
    }
}
