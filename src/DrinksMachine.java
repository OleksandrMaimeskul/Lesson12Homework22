enum DrinksMachine {
    COFFEE(3.50),
    TEA(2.00),
    LEMONADE(4.00),
    MOJITO(5.50),
    SODA(2.50),
    COLA(1.50);

    private final double price;

    DrinksMachine(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}