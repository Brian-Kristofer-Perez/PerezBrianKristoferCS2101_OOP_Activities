import java.util.Scanner;

public class GetArrayMean {
    public static void main(String[] args) {

        // initialize the variables, and other necessary items
        Scanner scanner = new Scanner(System.in);
        int n, inputNumber;
        double mean;

        // collect the inputs, and make the array
        System.out.print("Enter the number of elements: ");
        n = scanner.nextInt();
        int[] arr = new int[n];

        // fill the array
        for(int i = 0; i < n; i++){
            System.out.print("Enter number: ");
            inputNumber = scanner.nextInt();
            arr[i] = inputNumber;
        }

        // get the result, and print
        mean = getArrayMean(arr);
        System.out.println("Mean of array is: " + mean);

        scanner.close();
    }

    public static double getArrayMean(int[] input_array){

        // initialize the variables
        int sum = 0;
        int  numElements = 0;
        double output = 0.0;

        // get the sum of all elements, and the amount of elements in that array, and then divide
        for(int i: input_array){
            sum += i;
            numElements++;
        }
        output = (double) sum / (double) numElements;

        return output;
    }
}