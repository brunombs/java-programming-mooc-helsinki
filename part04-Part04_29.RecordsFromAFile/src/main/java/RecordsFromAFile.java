import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        ArrayList<String> lines = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if (!line.isEmpty()) {
                    lines.add(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        for (String line : lines) {
            String[] parts = line.split(",");
            String name = parts[0].trim();
            String agePart = parts[1].trim();
            
            String ageText = agePart.replace("age:", "").trim();
            String ageUnit = ageText.endsWith("year") ? "year" : "years";
            
            System.out.println(name + ", age: " + ageText + " " + ageUnit);
        }
    }
}