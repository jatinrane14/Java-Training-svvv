package UPI;
interface DebitCard {
    default void payment() {
        System.out.println("Payment done using Debit Card");
    }
}