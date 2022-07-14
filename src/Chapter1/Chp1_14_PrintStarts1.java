package Chapter1;

import java.util.Scanner;

//*을 n개 출력하되 w개마다 줄을 바꿈하는 프로그램
public class Chp1_14_PrintStarts1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*을 n개 출력하되 w개 마다 줄을 바꿔서 출력하세요.");
        System.out.print("n 값 : "); int n = sc.nextInt();
        System.out.print("w 값 : "); int w = sc.nextInt();

        int count = 0;
        for(int i = 1; i<n; i++) {
            System.out.print("*");
            count ++;
            if(count == w) {
                System.out.println();
                count = 0;
            }
        }
    }
}
/* count 를 세서 count가 w만큼 되면 줄바꿈 진행 후 다시 count를 0으로 초기화
**/