public class fibonacci {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < 12; i++) {
            System.out.print(a);
            if (i < 11) {
                System.out.print(", ");
            }
            int next = a + b;
            a = b;
            b = next;
        }
    }
}