public class DigitCounter {
    public static int countDigits(int number) {
        // Convert integer to string
        String numStr = Integer.toString(number);

        // Initialize counter variable
        int count = 0;

        // Iterate over each character in the string
        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                count++; // Increment counter if it's a digit
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Example usage
        int number = 1234;
        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + ": " + digitCount);
    }
}
