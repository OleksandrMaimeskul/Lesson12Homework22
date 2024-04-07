class Order {
    private final  int quantity;
    private final   double totalPrice;

    public Order(int quantity, double price) {
        this.quantity = quantity;
        this.totalPrice = quantity * price;
    }

}