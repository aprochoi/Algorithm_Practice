package Chapter1;

//4개의 정수 중 최댓갑을 구하라.
public class MaxOrMin {
    public static void main(String[] args) {
        System.out.println("max4(1,2,3,4) : " + max4(1,2,3,4));
        System.out.println("max4(4,5,2,1) : " + max4(4,5,2,1));
        System.out.println("=====================");
        System.out.println("min(1,2,3) : " + min(1,2,3));
        System.out.println("min(4,5,2) : " + min(4,5,2));
        System.out.println("=====================");
        System.out.println("min4(4,3,0,2) : " + min4(4,3,0,2));
        System.out.println("min4(2,1,5,6) : " + min4(2,1,5,6));
    }


    //4개의 정수 중 최댓값을 구하라.
    private static int max4(int a, int b, int c, int d) {
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;
        return max;
    }

    //3개의 정수 중 최소값을 구하라.
    private static int min(int a, int b, int c) {
        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;
        return min;
    }

    //4개의 정수 중 최소값을 구하라.
    private static int min4(int a, int b, int c, int d) {
        int min4 = a;
        if(b < min4) min4 = b;
        if(c < min4) min4 = c;
        if(d < min4) min4 = d;
        return min4;
    }
}


