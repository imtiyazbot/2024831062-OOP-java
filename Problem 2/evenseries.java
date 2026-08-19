import java.util.*;

public class evenseries {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println();
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
        System.out.println();
        int i = 1;
        while (i < n) {

            i += 2;
            System.out.println(i);
        }
        System.out.println();
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < n);

    }

}
