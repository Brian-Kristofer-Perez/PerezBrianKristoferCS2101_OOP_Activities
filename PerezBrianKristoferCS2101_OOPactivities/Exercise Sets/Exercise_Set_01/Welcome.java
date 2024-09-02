import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {

        System.out.println("Welcome to CS 211: Object-oriented Programming");

        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your name: ");
        name = scanner.nextLine();

        System.out.println("This course will be fun, " + name + "!");
    }
}