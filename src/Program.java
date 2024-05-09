import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        for (int i=1; i<=count(firstNumber,secondNumber); i++) {
            System.out.println("Printing number " + i);
        }
    }

    static Integer count(int firstNumber, int secondNumber) {
        return secondNumber - firstNumber;
    }
}
