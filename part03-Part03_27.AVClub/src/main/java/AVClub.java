
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        while(true){
            String[] lines = text.split(" ");
            for (String line : lines){
                if (line.contains("av")){
                    System.out.println(line);
                }
            }

            if (text.equals("")){
                break;
            }

            text = scanner.nextLine();
        }

    }
}
