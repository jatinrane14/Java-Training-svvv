package UPI;
class Payment implements UPI, CreditCard, DebitCard {

    // Must override because of multiple default methods conflict
    @Override
    public void payment() {
        System.out.println("Choose a specific payment method");
    }

    // Specific methods to resolve ambiguity
    public void upiPayment() {
        UPI.super.payment();
    }

    public void creditCardPayment() {
        CreditCard.super.payment();
    }

    public void debitCardPayment() {
        DebitCard.super.payment();
    }
}