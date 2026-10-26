package payment;
public class CreditCardPayment implements PaymentMethod {
    private final String cardNumber;
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment of $" + amount + " successfully processed via Credit Card (..." + cardNumber.substring(cardNumber.length() - 4) + ").");
        return true;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}