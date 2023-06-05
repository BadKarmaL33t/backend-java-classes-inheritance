class Customer {
    private String name;
    private String lastName;
    private int customerNumber;
    private CreditCard creditcard;

    public Customer(String name, String lastName, CreditCard creditcard) {
        this.name = name;
        this.lastName = name;
        this.creditcard = creditcard;
    }

    public Customer(String name, String lastName, int customerNumber, CreditCard creditcard) {
        this.name = name;
        this.lastName = name;
        this.customerNumber = customerNumber;
        this.creditcard = creditcard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public CreditCard getCreditCard() {
        return creditcard;
    }

    public void setCreditCard(CreditCard creditcard) {
        this.creditcard = creditcard;
    }

    public void printName() {
        System.out.println("Customer " + name);
    }
}