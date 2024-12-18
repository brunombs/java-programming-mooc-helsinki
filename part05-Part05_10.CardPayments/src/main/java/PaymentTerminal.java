
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if(payment >= 2.50){
            money += 2.50;
            affordableMeals++;
            return payment - 2.50;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        if(payment >= 4.30){
            money += 4.30;
            heartyMeals++;
            return payment - 4.30;
        }
        return payment;
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
