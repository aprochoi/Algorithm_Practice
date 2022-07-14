package Chapter2;

// 1000이하의 소수들을 나열 ver.1
// 소수는 2부터 n-1까지의 어떤 정수로도 나누어지지 않는다.
public class Chp2_7_PrimeNumber1 {
    public static void main(String[] args) {
        int count = 0;      //나눗셈의 횟수

        for (int i = 2; i <= 1000; i++) {
            int j;
            for (j = 2; j < i; j++) {
                count++;
                if (i % j == 0) {       //나누어 떨어지면 소수가 아니다.
                    break;              // 더이상 반복할 필요 X
                }
                }
            if (i == j) {               // 마지막 까지 나누어 떨어지지 않을때 비교
                System.out.println(i);
            }
        }
        System.out.println("나눗셈을 수행한 횟수 : " + count);
    }
}
