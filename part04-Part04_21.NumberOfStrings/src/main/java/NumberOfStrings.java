
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantityOfStrings = 0;

        while(true){
            String string = scanner.nextLine();
            if(string.equals("end")){
                break;
            }

            quantityOfStrings++;
        }

        System.out.println(quantityOfStrings);
    }
}
