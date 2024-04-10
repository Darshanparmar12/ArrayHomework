import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers to arrange into ascending order"); //store value 5 so user can only input 5 value
        int[] num = new int [5];
        num[0] = scanner.nextInt();
        num [1] = scanner.nextInt();
        num [2] = scanner.nextInt();
        num [3] = scanner.nextInt();
        num [4] = scanner.nextInt();


        int temp = 0; // in order to make in sequence
        for (int i = 0; i<num.length; i++)
            for (int j= i+1; j < num.length; j++){
                if (num[j] < num[i]){ //using if condition to make value higher than last one
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
        }
        System.out.println("Below is an ascending order");
        for ( int i = 0; i<num.length; i++)
            System.out.println(num[i] + "");


        }


    }

