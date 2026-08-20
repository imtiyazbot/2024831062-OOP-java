import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter reached target: ");
        int target = sc.nextInt();
        System.out.println("Enter attendance: ");
        int attendance = sc.nextInt();
        if (target >= 95) {
            if (attendance == 100) {
                System.out.println("60% bonus.");
            } else if (attendance >= 90) {
                System.out.println("40% bonus.");
            } else {
                System.out.println("5% bonus.");
            }
        } else if (target >= 80) {
            if (attendance == 100) {
                System.out.println("40% bonus.");
            } else if (attendance >= 90) {
                System.out.println("20% bonus.");
            } else {
                System.out.println("5% bonus.");
            }
        } else {
            System.out.println("5% bonus.");
        }

    }

}
