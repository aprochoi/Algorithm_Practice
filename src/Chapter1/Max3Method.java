package Chapter1;

public class Max3Method {

    static int max3(int a, int b, int c) {
        int max = a;
        if(max < b) max=b;
        if(max < c) max=c;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max3(3,2,1) = " + max3(3,2,1));
        System.out.println("max3(1,2,3) = " + max3(3,2,1));
        System.out.println("max3(3,2,2) = " + max3(3,2,1));
        System.out.println("max3(3,1,2) = " + max3(3,2,1));
        System.out.println("max3(3,2,3) = " + max3(3,2,1));
        System.out.println("max3(3,3,3) = " + max3(3,2,1));
        System.out.println("max3(2,1,3) = " + max3(3,2,1));
        System.out.println("max3(2,2,2) = " + max3(3,2,1));
        System.out.println("max3(2,3,1) = " + max3(3,2,1));
        System.out.println("max3(1,1,1) = " + max3(3,2,1));
        System.out.println("max3(2,3,3) = " + max3(3,2,1));
        System.out.println("max3(1,3,1) = " + max3(3,2,1));
    }

}
