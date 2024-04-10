import java.util.Scanner;

public class StringNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


      String str;

      do {
          System.out.println("Enter words/statement to count number of A"); //Promt to input words or character
          str =  scanner.nextLine();

      } while (str.isEmpty());

   str = str.toLowerCase(); //as we take user input and requirement of lowercase

      char [] charArray = str.toCharArray();
      int countA = 0;

      for (char c : charArray) {
          if (c == 'a') {
          }
      }

        System.out.println("Total number of 'a: " +  countA );
    }
}
