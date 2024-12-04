
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        System.out.println("Give numbers:");
        while (number != -1){
            number = scanner.nextInt();
            if (number == -1){
                break;
            }
            sum += number;
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
    }
}
