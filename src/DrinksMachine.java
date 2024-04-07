enum DrinksMachine {
    COFFEE("Coffee", 3.50),
    TEA("Tea", 2.00),
    LEMONADE("Lemonade", 4.00),
    MOJITO("Mojito", 5.50),
    SODA("Soda", 2.50),
    COLA("Cola", 1.50);

    private final String name;
    private final double price;

    DrinksMachine(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}