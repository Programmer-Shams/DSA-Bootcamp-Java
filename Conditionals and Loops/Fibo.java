import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//
//        int a = 0;
//        int b = 1;
//        int count = 2;
//
//        while(count <= n){
//            int temp  = b;
//            b = b + a;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);



        // Checking  the occurance of a number
//        int numbers = 13543783;
//        int count = 0;
//
//        while (numbers > 0) {
//            int rem = numbers % 10;  //last digit
//            if (rem == 3) {
//                count ++;
//            }
//            numbers = numbers / 10;
//        }
//        System.out.println(count);
        int number = 528964;
        int newNumber = 0;

        while (number > 0) {
            int rem = number % 10;
            newNumber = newNumber * 10 + rem;
            number = number / 10;
        }
        System.out.println(newNumber);
    }
}

