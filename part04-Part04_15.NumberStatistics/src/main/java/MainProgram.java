
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        System.out.println("Enter numbers:");
        
        while(true){
            int number = scanner.nextInt();
            if(number == -1){
                break;
            }
            statistics.addNumber(number);
        }

        System.out.println("Sum: " + statistics.sum());
    }
}