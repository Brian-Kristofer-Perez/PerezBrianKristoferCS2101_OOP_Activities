import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) {

        int Year;
        String Genre, Album, Title, Artist;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        Year = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter the Genre: ");
        Genre = scanner.nextLine();

        System.out.print("Enter the Album: ");
        Album = scanner.nextLine();

        System.out.print("Enter the Title: ");
        Title = scanner.nextLine();

        System.out.print("Enter the Artist: ");
        Artist = scanner.nextLine();

        System.out.println("--------------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("--------------------------------");
        System.out.println("Year released: " + Year);
        System.out.println("Genre: " + Genre);
        System.out.println("Album: " + Album);
        System.out.println("Title: " + Title);
        System.out.println("Artist: " + Artist);


    }
}