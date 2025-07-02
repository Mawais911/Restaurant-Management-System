import java.util.Scanner;

// INTERFACE
interface Orderable {
    double getTotalPrice();
}

// ABSTRACT CLASS
abstract class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract double getDiscountedPrice();
}

// FOOD ITEM
class FoodItem extends MenuItem {
    public FoodItem(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscountedPrice() {
        return getPrice() * 0.9; // 10% discount
    }
}

// DRINK ITEM
class DrinkItem extends MenuItem {
    public DrinkItem(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscountedPrice() {
        return getPrice() * 0.85; // 15% discount
    }
}

// ORDER ITEM
class OrderItem implements Orderable {
    private MenuItem item;
    private int quantity;

    public OrderItem(MenuItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    @Override
    public double getTotalPrice() {
        return item.getDiscountedPrice() * quantity;
    }

    @Override
    public String toString() {
        return item.getName() + " x " + quantity + " = Rs." + getTotalPrice();
    }
}

// MAIN CLASS
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Welcome to the Restaurant!");

            System.out.print("Enter food name: ");
            String foodName = scanner.nextLine();

            System.out.print("Enter food price: ");
            double foodPrice = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter quantity: ");
            int foodQty = Integer.parseInt(scanner.nextLine());

            FoodItem burger = new FoodItem(foodName, foodPrice);
            OrderItem orderFood = new OrderItem(burger, foodQty);

            System.out.print("\nEnter drink name: ");
            String drinkName = scanner.nextLine();

            System.out.print("Enter drink price: ");
            double drinkPrice = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter quantity: ");
            int drinkQty = Integer.parseInt(scanner.nextLine());

            DrinkItem coke = new DrinkItem(drinkName, drinkPrice);
            OrderItem orderDrink = new OrderItem(coke, drinkQty);

            double totalBill = orderFood.getTotalPrice() + orderDrink.getTotalPrice();

            System.out.println("\n--- Your Order ---");
            System.out.println(orderFood);
            System.out.println(orderDrink);
            System.out.println("Total Bill: Rs." + totalBill);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
}