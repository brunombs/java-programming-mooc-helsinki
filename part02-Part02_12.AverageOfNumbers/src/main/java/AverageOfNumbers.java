
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int total = 0;

        while(true){
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            if(number == 0){
                break;
            } else {
                sum += number;
                total += 1;
            }
        }

        System.out.println(sum);
        System.out.println(total);
        System.out.println("Average of the numbers: " + ((double) sum/total));
    }
}
