
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(5);
        Counter counterTwo = new Counter();

        System.out.println(counter.value());
        counter.increase();
        System.out.println(counter.value());
        counter.decrease();
        System.out.println(counter.value());

        System.out.println("---------------");
        
        System.out.println(counterTwo.value());
        counterTwo.increase();
        System.out.println(counterTwo.value());
        counterTwo.decrease();
        System.out.println(counterTwo.value());
    }
}
