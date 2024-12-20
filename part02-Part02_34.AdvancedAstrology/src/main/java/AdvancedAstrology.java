
public class AdvancedAstrology {

    public static void printStars(int number) {
        while(number > 0){
            System.out.print("*");
            number -= 1;
        }

        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++){
            printSpaces(size -i -1);
            printStars(i + 1);
        }
    }

    public static void christmasTree(int height) {
        for(int i = 0; i < height; i++){
            printSpaces(height -i -1);
            printStars(2 * i + 1);
        }

        for (int i= 0; i < 2; i++){
            printSpaces(height -2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
