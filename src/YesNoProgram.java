import java.util.Scanner;

public class YesNoProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 'y' for yes or 'n' for no: ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("y")) {
            System.out.println("Congratulations! You picked yes!");
        } else if (input.equalsIgnoreCase("n")) {
            System.out.println("Sorry, you picked no.");
        } else {
            System.out.println("Invalid input. Please enter 'y' for yes or 'n' for no.");
        }
    }
}