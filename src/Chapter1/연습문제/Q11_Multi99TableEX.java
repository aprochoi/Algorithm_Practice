package Chapter1.연습문제;

//구구단을 구분선으로 표시하여 출력
public class Q11_Multi99TableEX {
    public static void main(String[] args) {

        System.out.print("    |");
        for (int i = 1; i<=9; i++) System.out.printf("%3d",i);
        System.out.println("\n---+---------------------------------");


        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++)
                System.out.printf("%3d", i * j);
            System.out.println();
        }
    }
}
