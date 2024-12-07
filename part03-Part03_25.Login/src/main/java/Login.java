
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] users = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};
        System.out.print("Enter username: ");
        String name = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        boolean foundUser = false;
        for (int i = 0; i < users.length; i++){
            if (name.equals(users[i]) && password.equals(passwords[i])){
                System.out.println("You have successfully logged in!");
                foundUser = true;
            }   
        }
        if(!foundUser){
            System.out.println("Incorrect username or password!");
        }
    }
}
