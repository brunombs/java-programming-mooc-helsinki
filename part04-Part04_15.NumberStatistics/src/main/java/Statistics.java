
public class Statistics {
    private int count = 0;
    private int sum = 0;

    public Statistics(){
        int count;
        int sum;
    }

    public int getCount(){
        return count;
    }

    public void addNumber(int number){
        this.count++;
        sum += number;
    }

    public int sum(){
        return sum;
    }

    public double average(){
        return (double) sum / count;
    }
}
