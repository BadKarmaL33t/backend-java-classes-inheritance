public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Frodo", "Balings", new CreditCard(100));


        customer.getCreditCard().pay(10);
        customer.printName();
        System.out.println(customer.getCreditCard().getDebt());
    }
}
