public class Multiplication {
    public static void main(String[] args) {
        int size = 3; //since 3 column
        int row = 1;

        do {
            int column = 1;
            do {
                System.out.println(row * column + " "); // 1*1,1*2(after++),1*3. // row++ so 2*1.2*2,2*3 same for 3
                column++;
            }
            while (column <= size); // limitation of size which is 3 therefore on above just 3

            System.out.println();
            row++;
        }while (row <= size);

    }
}
