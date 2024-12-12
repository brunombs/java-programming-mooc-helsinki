
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        PaymentCard paymentCard = new PaymentCard(10);
        System.out.println("Paul: " + paymentCard);
        paymentCard.addMoney(-15);
        System.out.println("Paul: " + paymentCard);

    }
}
