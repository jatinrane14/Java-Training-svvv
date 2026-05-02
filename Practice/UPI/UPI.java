package UPI;
interface UPI {
    default void payment() {
        System.out.println("Payment done using UPI");
    }
}