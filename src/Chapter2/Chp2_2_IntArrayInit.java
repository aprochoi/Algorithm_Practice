package Chapter2;

//구성 요소의 자료형이 int형인 배열(구성 요소수는 5 : 배열 초기화에 의해 생성)
public class Chp2_2_IntArrayInit {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        for (int i : a) {
            System.out.println(i);
        }
    }
}
