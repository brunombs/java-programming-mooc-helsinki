
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String input = scanner.nextLine();
            String text[] = input.split(" ");
            System.out.println(text[0]);
            if (input.equals("")){
                break;
            }
        }
    }
}
