import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Prompt for array size
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();

        // 2. Accept each array element
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // 3. Prompt for Target Sum
        System.out.print("Enter the Target Sum: ");
        int targetSum = scanner.nextInt();

        // 4. Brute Force (Nested Loop) Search
        boolean found = false;

        // Outer loop points to the first element of the pair
        for (int i = 0; i < numbers.length; i++) {
            // Inner loop points to the second element, starting just ahead of 'i' to prevent checking the same element twice
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    // 5. If a match is found, display results
                    System.out.println("\n--- Pair Found ---");
                    System.out.println("Indices: [" + i + ", " + j + "]");
                    System.out.println("Values: " + numbers[i] + " and " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + targetSum);
                    found = true;
                    break; // Break inner loop since a pair is found
                }
            }
            if (found) break; // Break outer loop
        }

        // 6. If no pair exists
        if (!found) {
            System.out.println("\nNo unique pair of numbers adds up to the target sum of " + targetSum + ".");
        }

        scanner.close();
    }
}