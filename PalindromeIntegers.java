import java.util.Scanner;

public class PalindromeIntegers {

    private static void palindromeInteger(Scanner scanner, String input) {
        int currentNumber = 0;

        while (!input.equals("END")) {
            int number = Integer.parseInt(input);
            int reversedNumber = 0;
            currentNumber = number;

            while (number > 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;

            }

            if (currentNumber == reversedNumber) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scanner.nextLine();

        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        palindromeInteger(scanner, input);
    }
}

