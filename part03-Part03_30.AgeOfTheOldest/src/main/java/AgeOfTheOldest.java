
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int AgeOfTheOldest = 0;

        while(true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }

            String[] parts = input.split(",");
            System.out.println(parts[1]);
            if (Integer.valueOf(parts[1]) > AgeOfTheOldest){
                AgeOfTheOldest = Integer.valueOf(parts[1]);
            }
        }
        System.out.println("Age of the oldest: " + AgeOfTheOldest);
    }
}
