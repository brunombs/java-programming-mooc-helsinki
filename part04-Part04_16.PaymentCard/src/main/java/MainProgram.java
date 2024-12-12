
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        PaymentCard paymentCard = new PaymentCard(10);
        System.out.println(paymentCard);

        paymentCard.addMoney(15);
        System.out.println(paymentCard);

        paymentCard.addMoney(10);
        System.out.println(paymentCard);

        paymentCard.addMoney(200);
        System.out.println(paymentCard);

        

    }
}
