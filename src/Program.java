import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean parametersAreValid = false;

        while (!parametersAreValid) {
            System.out.print("First parameter: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Second parameter: ");
            int secondNumber = scanner.nextInt();

            try {
                count(firstNumber, secondNumber);
                parametersAreValid = true;
            }
            catch (InvalidParameterException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }

    static void count(int firstNumber, int secondNumber) throws InvalidParameterException{
        if (secondNumber < firstNumber)
            throw new InvalidParameterException("Error: the second parameter must be greater than the first");

        int countResult = secondNumber - firstNumber;
        for (int i=1; i<=countResult; i++)
            System.out.println("Printing number " + i);
    }
}
