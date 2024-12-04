
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int factorial = 1;
        System.out.print("Give a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++){
            System.out.println(i);
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }
}
