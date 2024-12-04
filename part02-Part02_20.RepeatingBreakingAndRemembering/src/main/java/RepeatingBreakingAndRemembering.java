
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        System.out.println("Give numbers:");
        while (number != -1){
            number = scanner.nextInt();
        }

        System.out.println("Thx! Bye!");
    }
}
