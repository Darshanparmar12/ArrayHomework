import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {

        int[][] arr = {{3,2,1}, {6,2,7}, {4, 4, 5}}; //2d arrays


        for(int i=0;i<3;i++){ // printing 2d arrays
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }}