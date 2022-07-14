package Chapter2;

//구성 요소의 자료형이 int형인 배열(구성 요소수는 5 : new에 의해 본체 생성)
public class Chp2_1_IntArray {
    public static void main(String[] args) {
        int[] a = new int[5];

        a[1] = 37;
        a[2] = 41;
        a[4] = a[1] * 2;

        for (int i : a) {   //각 요소값 출력
            System.out.println(i);
        }
    }
}
