import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printFromNumberToOne(5);

    }

    public static void printFromNumberToOne(int number){
        for (int i = number; i > 0; i--){
            System.out.println(i);
        }
    }

}
