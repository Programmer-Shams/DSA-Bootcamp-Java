import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        System.out.print("Enter Your Name:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String message2 = newGreetings(name);
        System.out.println(message2);
    }

    private static String newGreetings(String name) {
        return "Hello" +  " " + name;
    }

    static String greet() {
        String greeting = "Hello Shams!";
        return greeting;
    }
}
