import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        //  Array of  primitive
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 9;
        arr[2] = 5;
        arr[3] = 10;
        arr[4] = 45;
        System.out.println(arr[0]);

//         filling Array
        for (int i = 0; i < arr.length; i++) {
            arr[i] =   input.nextInt();
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(Arrays.toString(arr));

        // Arrays of Object

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        // modify
        str[2] = "Shams";

        for (String st : str){
            System.out.println(st);
        }
        // another way to print
        System.out.println(Arrays.toString(str));
    }
}
