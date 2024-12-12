
public class Statistics {
    private int count;
    private int sum;

    public Statistics(){
        this.count = count;
        this.sum = sum;
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
