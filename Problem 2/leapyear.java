import java.util.*;
public class leapyear {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = obj.nextInt();
        if (year % 400 == 0 || year % 4 == 0) {
            System.out.println("Leap Year.");
        } else {
            System.out.println("Not Leap Year.");
        }

    }

}
