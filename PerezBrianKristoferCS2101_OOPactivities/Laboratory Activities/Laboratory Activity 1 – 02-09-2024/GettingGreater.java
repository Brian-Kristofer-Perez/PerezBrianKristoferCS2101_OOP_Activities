import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {

        String first, second;
        char one, two, max_char;
        int int_max_char;
        System.out.println("Getting the Greater Value");

        Scanner scanner = new Scanner(System.in);

        // Inputs
        System.out.print("Enter the first character: ");
        first = scanner.nextLine();
        System.out.print("Enter the second character: ");
        second = scanner.nextLine();

        // Extract the two first characters
        one = first.charAt(0);
        two = second.charAt(0);

        // Typecast, and convert
        int_max_char = Math.max((int) one, (int) two);

        // Output
        System.out.println("--------------------------------------");
        System.out.println("The character with greater value is: " + (char) int_max_char);
        System.out.println("--------------------------------------");
        System.out.println("Showing the ASCII Codes");
        System.out.println(one + ": " + (int) one);
        System.out.println(two + ": " + (int) two);

        //Closing scanner
        scanner.close();
        




    }
}
