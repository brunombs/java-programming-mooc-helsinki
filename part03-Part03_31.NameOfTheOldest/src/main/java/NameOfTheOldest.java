
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfOldest = "";
        int older = 0;

        while(true){
            String nameAndAge = scanner.nextLine();


            if(nameAndAge.equals("")){
                break;
            }


            String[] list = nameAndAge.split(",");

            String name = list[0];

            if(Integer.valueOf(list[1]) > older){
                older = Integer.valueOf(list[1]);
                nameOfOldest = name;
            }
        }
        
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}
