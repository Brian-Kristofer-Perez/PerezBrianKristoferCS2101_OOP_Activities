import java.util.Scanner;

public class Escseq {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();

        for (int i=1; i<x+1; i++) {

            if (i % 2 == 0){
                System.out.println("\t"+ i*7);
            }

            else {
                System.out.println(i * 7);
            }
        }

    }
}