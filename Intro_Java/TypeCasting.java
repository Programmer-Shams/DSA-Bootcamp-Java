import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        int num2 = (int)num;   // it convert what ever i enter to an integer value e.g 69.54 ----------- 69
        System.out.println(num2);

        byte a = 20;
        byte b = 100;
        int c =  a * b;
        System.out.println(c);

        int number = 'A'; //  Will print the ascii  value which is 65   // Java has unicode values also;
        System.out.println(number);
    }
}
