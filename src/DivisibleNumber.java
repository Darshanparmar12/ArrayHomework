public class DivisibleNumber {
    public static void main(String[] args) {

        int num = 1;

        System.out.println("Number divisible by 3 ");
        do{
            if (num%3 == 0){
                System.out.println(num);
            }
            num++;
        }while (num<=100);

        num=1; //reseting one to make it divisble by 5

        System.out.println("Number divisible by 5");
        do {
            if (num%5==0){
                System.out.println(num);
            }
            num++;
        }while(num<=100);

        }
}
