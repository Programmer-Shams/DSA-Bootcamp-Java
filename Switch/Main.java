import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit  = input.next();

//        if(fruit.equals("mango")){
//            System.out.println("Mango");
//        }
//        if(fruit.equals("apple")){
//            System.out.println("Apple");
//        }

        switch (fruit){
            case "Mango":
                System.out.println("Mango");
                break;
            case "Apple":
                System.out.println("Apple");
                break;
            case "Orange":
                System.out.println("Orange");
                break;
            case "Pineapple":
                System.out.println("Pineapple");
            default:
                System.out.println("Unknown fruit");
        }


        int day = input.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Unknown day");
        }

        // nested switch
        int ID = input.nextInt();
        String department  = input.next();

        switch (ID){
            case 1 -> System.out.println("Shamsudeen");
            case 2 -> System.out.println("Imran");
            case 3 -> {
                System.out.println("ID No 3");
                switch (department){
                    case "IT" -> System.out.println("IT department");
                    case "Engineering" -> System.out.println("Engineering department");
                    default -> System.out.println("Unknown department");
                }
            }
            default -> System.out.println("Unknown ID");
        }

    }
}
