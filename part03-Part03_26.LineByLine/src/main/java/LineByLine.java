
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while (text != ""){
            String[] lines = text.split(" ");
            for (String line : lines){
                System.out.println(line);
            }
            text = scanner.nextLine();
        }
    }
}
