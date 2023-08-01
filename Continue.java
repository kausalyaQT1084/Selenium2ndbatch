package BreakandContinue;

public class Continue {
	public static void main(String[] args) {
        // Using a for loop to print odd numbers from 1 to 10
        for (int i = 1; i <= 30; i++) {
            if (i % 2 != 0) {
                continue; // Skip even numbers and go to the next iteration
            }
            System.out.print(i + " ");
        }
        System.out.println("\nLoop ended.");
    }
}





