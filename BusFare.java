public class BusFare {
    public static int findFare(int kilometers) {
        int fare = 0;

        // checking for fare
        if(kilometers > 0 && kilometers < 5) {
            fare = 1;
        } else if(kilometers >=5 && kilometers < 10) {
            fare = 2;
        } else if(kilometers >= 10 && kilometers < 30) {
            fare = 5;
        } else if(kilometers >= 30 && kilometers < 50) {
            fare = 8;
        } else if(kilometers >= 50 && kilometers < 80) {
            fare = 15;
        } else {
            fare = 30;
        }

        return fare;
    }
}