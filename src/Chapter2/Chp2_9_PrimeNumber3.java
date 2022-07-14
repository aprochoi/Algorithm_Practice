package Chapter2;

import java.util.ArrayList;

// 1000이하의 소수를 나열 Ver.3
public class Chp2_9_PrimeNumber3 {
    public static void main(String[] args) {
        int count = 0;              //곱셈과 나눗셈의 횟수
        int ptr = 0;                // 찾은 소수의 개수
        ArrayList<Integer> arrayList = new ArrayList<>();       // 소수를 리스트에 저장.

        arrayList.add(2);           //2는 소수임.
        arrayList.add(3);           //3은 소수

        for (int i = 5; i <= 1000; i += 2) {          //조사 대상을 홀수만
            boolean flag = false;
            for (int j = 1; arrayList.get(j) * arrayList.get(j) <= i; j++) {
                count +=2;
                if (i % arrayList.get(j) == 0) {            // 나누어 떨어지면 소수가 X
                    flag = true;
                    break;                                  // 더이상 반복 필요 X
                }
            }
            if (!flag) {                    // 마지막까지 나누어 떨어지지 않으면
                arrayList.add(i);           // 소수이므로 리스트에 저장
                count++;
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }


        System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + count);
    }
}
