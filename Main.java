import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int kilometers = sc.nextInt();

        // finding fare base on given kilometers
        // using findFare() method of BusFare class
        System.out.println(BusFare.findFare(kilometers));

        // closing resource
        sc.close();
    }
}
