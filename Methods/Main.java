import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // take input of two numbers amd print the sum
        Scanner input = new Scanner(System.in);

        int firstNumber, secondNumber, sum;

        System.out.println("Enter First Number");
        firstNumber = input.nextInt();
        System.out.println("Enter Second Number");
        secondNumber = input.nextInt();
        sum = firstNumber + secondNumber;
        System.out.println("The sum is: " + sum);
    }
}
