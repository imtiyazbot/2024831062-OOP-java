import java.util.*;

public class trianglearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");

        double a = sc.nextDouble();
        System.out.println("Enter the height:");

        double b = sc.nextDouble();
        double area = .5 * a * b;

        System.out.println("Area of the triangle=" + area);
        sc.close();

    }
    
}