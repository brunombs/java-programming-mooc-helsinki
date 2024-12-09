
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int divisible = 0;
        Double averageOfBirth = 0.0;

        while(true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            divisible++;

            String[] details = input.split(",");

            averageOfBirth += Double.valueOf(details[1]);
            
            if(details[0].length() > longestName.length()){
                longestName = details[0];
            }
        }

        System.out.println("Longest name: " + longestName);
        averageOfBirth /= divisible;
        System.out.println("Average of the birth years: " + averageOfBirth);
    }
}
