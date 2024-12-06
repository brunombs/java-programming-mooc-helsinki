
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int number = scanner.nextInt();
            if(number == -1){
                break;
            }
            list.add(number);
        }

        double average = 0;
        for (Integer number : list){
            average += number;
        }

        System.out.println("Average: " + average / list.size());
        
    }
}
