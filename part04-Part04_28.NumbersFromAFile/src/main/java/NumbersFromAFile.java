
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lines = new ArrayList<>();
        int sum = 0;

        System.out.print("File? ");
        String file = scanner.nextLine();

        try (Scanner scanner2 = new Scanner(Paths.get(file))){
            while (scanner2.hasNextLine()){
                lines.add(scanner2.nextInt());
                scanner2.nextLine();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        for (int number : lines){
            if (number >= lowerBound && number <= upperBound) {
                sum++;
            }
        }

        System.out.println("Numbers: " + sum);
    }
}
