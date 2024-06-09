import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum3(5, 20);
        System.out.println(ans);
    }
    static void sum(){
        Scanner input = new Scanner(System.in);

        int firstNumber, secondNumber, sum;

        System.out.println("Enter First Number");
        firstNumber = input.nextInt();
        System.out.println("Enter Second Number");
        secondNumber = input.nextInt();
        sum = firstNumber + secondNumber;
        System.out.println("The sum is: " + sum);
    }
    static int sum2(){
        Scanner input = new Scanner(System.in);

        int firstNumber, secondNumber, sum;

        System.out.println("Enter First Number");
        firstNumber = input.nextInt();
        System.out.println("Enter Second Number");
        secondNumber = input.nextInt();
        sum = firstNumber + secondNumber;
        return sum;
    }
    static int sum3(int a, int b) {
        return a + b;
    }
}
