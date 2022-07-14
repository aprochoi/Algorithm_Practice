package Chapter1;

public class Chp_1_16_Multi99table {
    public static void main(String[] args) {
        System.out.println("  ------ 구구단 곰셈표 ------");
        for(int i = 1; i<=9; i++) {
            for(int j = 1; j<=9; j++) {
                System.out.printf("%3d", i*j);
            }
            System.out.println();
        }
    }
}
