import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DrinksOrder {
    private final Scanner scanner;
    private final List<Order> orders;
    private double totalAmount;

    public DrinksOrder() {
        this.scanner = new Scanner(System.in);
        this.orders = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public void start() {
        System.out.println("Welcome! Please choose your drinks: ");
        while (true) {
            displayMenu();
            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("exit")) {
                System.out.println("Finishing ordering...");
                break;
            }

            DrinksMachine selectedDrink = parseChoice(choice);
            if (selectedDrink == null) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            double price = selectedDrink.getPrice();
            orders.add(new Order(1, price));
            totalAmount += price;
            System.out.println("Preparing " + selectedDrink + "...");
            System.out.println("You ordered " + orders.size() + " drinks. Your total amount is: $" + totalAmount);
        }

        System.out.println("Total amount: $" + totalAmount);
        scanner.close();
    }

    private void displayMenu() {
        System.out.println("1. " + DrinksMachine.COFFEE + " " + DrinksMachine.COFFEE.getPrice() + "$");
        System.out.println("2. " + DrinksMachine.TEA+ " " + DrinksMachine.TEA.getPrice() + "$");
        System.out.println("3. " + DrinksMachine.LEMONADE+ " " + DrinksMachine.LEMONADE.getPrice() + "$");
        System.out.println("4. " + DrinksMachine.MOJITO+ " " + DrinksMachine.MOJITO.getPrice() + "$");
        System.out.println("5. " + DrinksMachine.SODA+ " " + DrinksMachine.SODA.getPrice() + "$");
        System.out.println("6. " + DrinksMachine.COLA+ " " + DrinksMachine.COLA.getPrice() + "$");
        System.out.println("Type 'exit' to finish ordering.");
    }

    private DrinksMachine parseChoice(String choice) {
        try {
            int choiceIndex = Integer.parseInt(choice);
            return DrinksMachine.values()[choiceIndex - 1];
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }
}
