import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Find the largest of the 3 numbers here

//        if(a > b && a > c){
//            System.out.println(a + " " + "is the largest Number");
//        } else if(b > a && b > c) {
//            System.out.println(b + " " + "is the largest Number");
//        } else {
//            System.out.println(c + " " + "is the largest Number");
//        }


        // Another way
        int max = a;

        if( b > max){
            max = b;
        }
        if(c > max) {
            max = c;
        }
        System.out.println(max + " " + "is the largest Number");
    }
}
