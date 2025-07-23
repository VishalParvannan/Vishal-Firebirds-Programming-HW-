import java.util.Scanner;

public class DecisionStatements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] fruitPrices = {0.99, 0.49, 1.25, 2.00, 8.00};
        String[] fruits = {"apple", "banana", "orange", "mango", "watermelon"};

        double[] drinkPrices = {0.49, 4.00, 1.25};
        String[] drinks = {"water", "milk", "soda"};

        double cost = 0;
        int items = 0;

        System.out.println("Welcome to the fruit stand!");

        while (true) {
            System.out.print("\nWould you like a [fruit], [drink], or type [done] to finish? ");
            String category = input.nextLine().toLowerCase();

            if (category.equals("done")) {
                break;
            }

            if (category.equals("fruit")) {
                System.out.print("Please enter a fruit (apple, banana, orange, mango, watermelon): ");
                String fruitChoice = input.nextLine().toLowerCase();

                boolean found = false;
                for (int i = 0; i < fruits.length; i++) {
                    if (fruitChoice.equals(fruits[i])) {
                        cost += fruitPrices[i];
                        items++;
                        System.out.println("Added " + fruitChoice + " for $" + fruitPrices[i]);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Sorry, we don't have that fruit.");
                }

            } else if (category.equals("drink")) {
                System.out.print("Please enter a drink (water, milk, soda): ");
                String drinkChoice = input.nextLine().toLowerCase();

                boolean found = false;
                for (int i = 0; i < drinks.length; i++) {
                    if (drinkChoice.equals(drinks[i])) {
                        cost += drinkPrices[i];
                        items++;
                        System.out.println("Added " + drinkChoice + " for $" + drinkPrices[i]);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Sorry, we don't have that drink.");
                }

            } else {
                System.out.println("Invalid category. Please type 'fruit', 'drink', or 'done'.");
            }
        }

        System.out.println("\nYou bought " + items + " item(s).");
        System.out.printf("Total cost: $%.2f\n", cost);
    }
}
