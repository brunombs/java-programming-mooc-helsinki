import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()){
                break;
            }

            System.out.print("Duration: ");
            int duration = scanner.nextInt();
            scanner.nextLine();

            programs.add(new TelevisionProgram(name, duration));
        }

        System.out.print("Program's maximum duration? ");
        int maxDuration = scanner.nextInt();

        for (TelevisionProgram program : programs){
            if (maxDuration >= program.getDuration())
                System.out.println(program.getName() + ", " + program.getDuration());
        }

    }
}
