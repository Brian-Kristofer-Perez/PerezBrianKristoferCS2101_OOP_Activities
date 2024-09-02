import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] args) {
        float x,y;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Celsius value: ");
        x = scanner.nextFloat();

        y = ((9.0f/5)*x) + 32;

        System.out.println(x+" Celsius is "+ y +" Fahrenheit.");
    }
}