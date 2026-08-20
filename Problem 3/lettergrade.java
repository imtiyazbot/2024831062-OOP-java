import java.util.Scanner;

public class lettergrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter letter grade/GPA: ");
        double grade = sc.nextDouble();

        System.out.print("Did the student complete the semester? (true/false): ");
        boolean completed = sc.nextBoolean();

        if (completed) {
            if (grade >= 3.5) {
                System.out.println("Student gets a medal.");
            }
            else{
                System.out.println("Student doesnot get a medal.");
            }
        }
        else{
            System.out.println("Student didnot complete the semester.");
        }
    }

}

