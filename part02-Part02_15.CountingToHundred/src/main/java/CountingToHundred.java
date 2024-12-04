
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = 100;

        int number = scanner.nextInt();
        for (int i = number; i <= end; i++){
            System.out.println(i);
        }
    }
}
