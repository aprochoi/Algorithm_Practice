package Chapter1;

public class Middle3_13 {
    public static void main(String[] args) {
        System.out.println("mid3(3,2,1) = " + mid3(3,2,1));      // a＞b＞c
        System.out.println("mid3(3,2,2) = " + mid3(3,2,2));      // a＞b＝c
        System.out.println("mid3(3,1,2) = " + mid3(3,1,2));      // a＞c＞b
        System.out.println("mid3(3,2,3) = " + mid3(3,2,3));      // a＝c＞b
        System.out.println("mid3(2,1,3) = " + mid3(2,1,3));      // c＞a＞b
        System.out.println("mid3(3,3,2) = " + mid3(3,3,2));      // a＝b＞c
        System.out.println("mid3(3,3,3) = " + mid3(3,3,3));      // a＝b＝c
        System.out.println("mid3(2,2,3) = " + mid3(2,2,3));      // c＞a＝b
        System.out.println("mid3(2,3,1) = " + mid3(2,3,1));      // b＞a＞c
        System.out.println("mid3(2,3,2) = " + mid3(2,3,2));      // b＞a＝c
        System.out.println("mid3(1,3,2) = " + mid3(1,3,2));      // b＞c＞a
        System.out.println("mid3(2,3,3) = " + mid3(2,3,3));      // b＝c＞a
        System.out.println("mid3(1,2,3) = " + mid3(1,2,3));      // c＞b＞a
    }

    static int mid3(int a, int b, int c) {
        if(a >= b) {
            if(b >= c) return b;
            else if(a <= c) return a;
            else return c;
        }
        else if(a > c) return a;
        else if(b > c) return c;
        else return b;
    }
}
