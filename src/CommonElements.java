import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {

        Integer[] i1 = {1, 2, 3, 4, 5, 4};

        Integer[] i2 = {3, 4, 5, 6, 7, 4};

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1)); //to store common value we use SET

        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));

        set1.retainAll(set2); //using retain method to find common element

        System.out.println(set1);



    }
}
