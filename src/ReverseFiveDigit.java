import java.util.Scanner;

public class ReverseFiveDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers to reverse them ");
        int num = scanner.nextInt();

        int reverse = 0;
        while (num!=0){ //to make statement enter in block.
            reverse = reverse*10 + num%10;
            num=num/10;

        }
        System.out.println("Reverse number: " + reverse);


    }
}
