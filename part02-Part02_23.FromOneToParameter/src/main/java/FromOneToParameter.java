import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printUntilNumber(7);
    }

    public static void printUntilNumber(int number){
        for (int i = 1; i <= number; i++){
            System.out.println(i);
        }
    }
}
