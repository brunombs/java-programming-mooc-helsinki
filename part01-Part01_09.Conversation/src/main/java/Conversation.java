
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Greetings! How are you doing?");
        String answerString = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        answerString = scanner.nextLine();
        System.out.println("Thanks for sharing!");
    }
}
