import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter operation: ");
        String opr = sc.next();
        int Addition = a + b;
        int Subtraction = a - b;
        int Multiplication = a * b;
        int Division = a / b;
        if (opr.equals("+")) {
            System.out.println(Addition);
        } else if (opr.equals("-")) {
            System.out.println(Subtraction);
        } else if (opr.equals("*")) {
            System.out.println(Multiplication);
        } else if (opr.equals("/")) {
            System.out.println(Division);
        }
        sc.close();

    }

}
