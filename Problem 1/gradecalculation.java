import java.util.*;

public class gradecalculation {
    public static void main(String[] args)

    // {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter marks:");
    // int mark = sc.nextInt();
    // if (mark < 0 || mark > 100) {
    // System.out.println("Invalid marks.");
    // } else if (mark > 0 && mark < 40) {
    // System.out.println("F");
    // } else if (mark >= 40 && mark < 60) {
    // System.out.println("C+");
    // } else if (mark >= 60 && mark < 70) {
    // System.out.println("B");
    // } else if (mark >= 70 && mark < 80) {
    // System.out.println("A-");
    // } else if (mark >= 80 && mark < 90) {
    // System.out.println("A");
    // } else {
    // System.out.println("A+");
    // }
    // sc.close();

    // }
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        switch (number / 10) {
            case 10:
            case 9:
            case 8:
                System.out.println("A+");
                break;

            case 7:
                System.out.println("A");
                break;

            case 6:
                System.out.println("A-");
                break;

            case 5:
                System.out.println("B");
                break;

            case 4:
                System.out.println("C+");
                break;

            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid marks.");
        }

        sc.close();
    }

}
