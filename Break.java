package BreakandContinue;

public class Break {
    public static void main(String[] args) {
        // Using a for loop to print numbers from 1 to 5
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");
            if (i == 3) {
                break; // Terminate the loop when i equals 12
            }
        }
        System.out.println("\nLoop ended.");
    }
}



