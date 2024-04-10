import java.util.HashSet;

public class CommonStringElements {
    public static void main(String[] args) {

        String[] value1 = {"London", "New York", "Mumbai"}; //string value is initialized
        String[] value2 = {"London", "Florida", "Mumbai"};

        HashSet<String> set = new HashSet<String>(); // to store common value we use SET

        int i = 0;
        do {
            int j = 0;
            do { //nested loop
                if (value1[i].equals(value2[j])) {
                    set.add(value1[i]);  //if equal we add element in set

                }
                j++;

            } while (j < value2.length);
            i++;

        } while (i < value1.length);

        System.out.println(set);


    }
}
