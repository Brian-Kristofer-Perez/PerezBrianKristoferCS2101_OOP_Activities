import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // initialize the scanner and variables
        Scanner scanner = new Scanner(System.in);
        int tableSize;

        // get the inputs, and make the corresponding 2d array
        System.out.print("Enter the size of the multiplication table: ");
        tableSize = scanner.nextInt();
        int[][] arr = fillTable(tableSize);

        printTable(arr, tableSize);

        scanner.close();
    }

    public static int[][] fillTable(int size){

        // create the table
        int[][] outputTable = new int[size][size];

        // fill the table
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                outputTable[i-1][j-1] = i * j;
            }
        }
        return outputTable;
    }

    public static void printTable(int[][] table, int size){

        // Print the table.
        // Bear in mind the println on the outer loop, so it actually prints a table and not a line
        System.out.println("Multiplication Table:");
        for(int a = 0; a < size; a++){
            for(int b = 0; b < size; b++){
                System.out.printf("%4d", table[a][b]);
            }
            System.out.println();
        }
    }
}