
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();


        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try(Scanner scanner2 = new Scanner(Paths.get(file))) {
            while (scanner2.hasNextLine()) {
                lines.add(scanner2.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + ".txt failed.");
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        if (lines.contains(searchedFor)){
            System.out.println("Found!");
        } else if (!lines.contains((searchedFor))){
            System.out.println("Not found!");
        }
    }
}
