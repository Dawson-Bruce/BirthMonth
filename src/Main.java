import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare variables
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;

        // Prompt user for birth month
        System.out.print("Please enter your birth month [1-12]: ");

        // Check if input is a number
        if (in.hasNextInt())
        {
            birthMonth = in.nextInt();

            // Check that birth month is within the range [1,12]
            if (birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                System.out.println("You have entered an incorrect month value: " + birthMonth);
            }
        } else {
            System.out.println("Invalid birth month: " + in.nextLine());
        }
    }
}