import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = 0;

        System.out.print("tell me your mark: ");
        input = s.nextInt();
        System.out.println();
        switch (input) {
            case 1 -> System.out.println("Very good");
            case 2 -> System.out.println("Good");
            case 3 -> System.out.println("Satisfactory");
            case 4 -> System.out.println("Sufficient");
            case 5 -> System.out.println("Not sufficient");
            default -> System.out.println("That is not a Mark!");
        }
    }
}