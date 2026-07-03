import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Prompt for array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // 2. Create the integer array
        int[] numbers = new int[size];

        // 3. Prompt user for each element
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // 4. Search for the maximum value and its index
        int maxVal = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxVal) {
                maxVal = numbers[i];
                maxIndex = i;
            }
        }

        // 5. Display the results clearly
        System.out.println("\n--- Results ---");
        System.out.println("Maximum Value: " + maxVal);
        System.out.println("Occurs at Index: " + maxIndex);

        scanner.close();
    }
}