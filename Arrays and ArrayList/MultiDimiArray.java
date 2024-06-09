import java.util.Arrays;
import java.util.Scanner;

public class MultiDimiArray {
    public static void main(String[] args) {
        int[][] arr  = new int[3][3];

        // input in the Array
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[col].length; col++) {
                arr[row][col] = input.nextInt();
            }

        // output
            for (int  ar[]: arr){
                System.out.println(Arrays.toString(ar));
            }
        }
    }
}
