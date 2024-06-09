import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Output
        System.out.println("Hello World");
        System.out.println("How are you?");
        System.out.println("How Old are you?");

        //Input
        Scanner input = new Scanner(System.in);
        int  responseNumber = input.nextInt();
        String responseString  = input.nextLine();
        System.out.println(responseNumber);
        System.out.println(responseString);
    }

}

