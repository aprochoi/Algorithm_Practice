package Chapter2.연습문제;

import java.util.Scanner;

//기수 변환 과정을 자세히 나타내는 프로그램으로 구성
public class Q6_CardConvEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;         // 변환하는 정수
        int cd;         // 기수
        int dno;        // 변환 후의 자리수
        int retry;      // 다시 한번?
        char[] cno = new char[32];  // 변환 후 각 자리의 숫자를 넣어두는 문자 배열

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = sc.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환 할까요? (2~36) : ");
                cd = sc.nextInt();
                System.out.println();
            } while (cd < 2 || cd > 36);

            dno = CardConvEx.cardConv(no, cd, cno);   //no를 cd진수로 변환

            System.out.print(cd + "진수로 ");
            for (int i = 0; i < dno; i++) {     //순서대로 출력
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            System.out.print("한번 더 할 까요? (1 -> 예 / 0 -> 아니요) : ");
            retry = sc.nextInt();
        }  while (retry == 1);
    }
}

class CardConvEx {

    //정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수 반환
    static int cardConv(int x, int r, char[] d) {
        int n = ((Integer)x).toString().length();   // 변환 전 자릿수

        int digits = 0;     //변환 후 자리수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUWXYZ";

        System.out.printf(String.format("%%2d | %%%dd\n",n) ,r ,x);
        do {
            System.out.printf("   +");
            for (int i = 0; i < n + 2; i++) {
                System.out.print('-');
            }
            System.out.println();

            if (x / r != 0) {
                System.out.printf(String.format("%%2d | %%%dd    ... %%d\n", n), r, x/r, x%r);
            }
            else System.out.printf(String.format("     %%%dd    ... %%d\n", n), x/r, x%r);

            x /= r;
        } while (x !=0);

        //배열을 역순으로 정렬.
        for (int i = 0; i < digits / 2; i++) {
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }


        return digits;
    }
}
