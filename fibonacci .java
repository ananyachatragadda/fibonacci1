public class Fibonacci {

    public static void main(String[] args) {
        // Set the number of terms directly in the code
        int n = 10;  // You can change this value to any number of terms you want

        // Display the Fibonacci sequence
        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Initialize the first two Fibonacci numbers
        int first = 0, second = 1;

        // Print the Fibonacci sequence
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next Fibonacci number
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
