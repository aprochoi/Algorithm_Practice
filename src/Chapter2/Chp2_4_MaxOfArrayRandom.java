package Chapter2;

import java.util.Random;
import java.util.Scanner;

//배열 요소의 최대값을 출력(값은 난수로)
public class Chp2_4_MaxOfArrayRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();             //난수로 설정
        System.out.println("키의 최대값을 구합니다.");
        System.out.print("사람 수 :");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("키는 다음과 같습니다.");
        for (int i = 0; i < height.length; i++) {
            height[i] = 100 + rand.nextInt(90);     //rand.nextInt(n)은 0~n-1 까지의 난수를 반환
            System.out.println("heigth [" + i + "] :" + height[i]);
        }

        System.out.println("최대값은 " + maxOf(height) + "입니다.");
    }

    //배열의 최대값을 구하는 메서드
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] > max) max = a[i];
        }

        return max;
    }
}
