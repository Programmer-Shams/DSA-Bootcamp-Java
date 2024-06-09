import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double result = 0;
        while(true)  {
            System.out.print("Enter an Operator: ");
            char op = input.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter first  number: ");
                double num1 = input.nextDouble();
                System.out.print("Enter second  number: ");
                double num2 = input.nextDouble();

                if (op == '+') {
                    result = num1 += num2;
                };
                if (op == '-') {
                    result = num1 - num2;
                }
                if (op == '*') {
                    result = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        result = num1 / num2;
                    }
                }
                if (op == '%') {
                        result = num1 % num2;
                }
            }
             else if (op == 'x' || op == 'X'){
                break;
            }
            else {
                System.out.println("Invalid operation");
                break;
            }
            System.out.println(result);
        }
    }
}
