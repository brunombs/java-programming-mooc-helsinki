
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int total = 0;

        while(true){
            int number = scanner.nextInt();
            if (number == 0){
                break;
            } else if (number > 0){
                sum += number;
                total += 1;
            }
        }

        if (total == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sum/total);;
        }
    }
}
