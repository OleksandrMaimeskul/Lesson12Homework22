import java.util.ArrayList;
import java.util.Scanner;

public class DrinksOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList orders = new ArrayList();
        System.out.println("Welcome! Please choose your drinks: ");
        double totalAmount = 0.0;
        while (true) {
            System.out.println("1. Coffee");
            System.out.println("2. Tea");
            System.out.println("3. Lemonade");
            System.out.println("4. Mojito");
            System.out.println("5. Soda");
            System.out.println("6. Cola");
            String choice = scanner.nextLine().toLowerCase();

            DrinksMachine drink;
            switch (choice) {
                case "1":
                case "coffee":
                    drink = DrinksMachine.COFFEE;
                    break;
                case "2":
                case "tea":
                    drink = DrinksMachine.TEA;
                    break;
                case "3":
                case "lemonade":
                    drink = DrinksMachine.LEMONADE;
                    break;
                case "4":
                case "mojito":
                    drink = DrinksMachine.MOJITO;
                    break;
                case "5":
                case "soda":
                    drink = DrinksMachine.SODA;
                    break;
                case "6":
                case "cola":
                    drink = DrinksMachine.COLA;
                    break;
                case "exit":
                    System.out.println("Finishing ordering...");
                    scanner.close();
                    System.out.println("Total amount: $" + totalAmount);
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;

            }
            orders.add(new Order(1, drink.getPrice()));
            totalAmount += drink.getPrice();
            System.out.println("You ordered " + orders.size() + " drinks. Your total amount is: $" + totalAmount);
        }
    }
}