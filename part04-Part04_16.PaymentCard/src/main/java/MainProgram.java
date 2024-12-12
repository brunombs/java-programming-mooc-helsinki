
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        PaymentCard paymentCard = new PaymentCard(5);
        System.out.println(paymentCard);

        paymentCard.eatHeartily();
        System.out.println(paymentCard);

        paymentCard.eatHeartily();
        System.out.println(paymentCard);

    }
}
