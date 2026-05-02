package UPI;
interface CreditCard {
    default void payment() {
        System.out.println("Payment done using Credit Card");
    }
}
