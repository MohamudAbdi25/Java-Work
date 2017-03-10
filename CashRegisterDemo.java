import java.util.Scanner;

public class CashRegisterDemo {

    public static void main(String[] args) {

        Scanner scanner = null;
        try {
            String itemName;
            int unitsOnHand;
            double price;

            RetailItem item;
            int noOfUnitsBuying;

            scanner = new Scanner(System.in);

          // asks for the Item being purchased
            System.out.print("Item being purchased:");
            itemName = scanner.nextLine();
            // asks for the units being bought
            System.out.print("Units on hand: ");
            unitsOnHand = scanner.nextInt();
            // asks for the price
            System.out.print("Price: $");
            price = scanner.nextDouble();
            // asks for number of candy bars being bought 
            System.out.print("How many candy bars are you buying? ");
            noOfUnitsBuying = scanner.nextInt();

            
            //item will have the itemName, unitsOnHand, and the price.
             
            item = new RetailItem(itemName, unitsOnHand, price);


            /*
            if the units that the customer is buying is less or equal to what we have in hand the program will display
            the subtotal, sales tax, total, and the units on hand.
             */
            if (noOfUnitsBuying <= item.getUnitsOnHand()) {
                CashRegister cashRegister = new CashRegister(item, noOfUnitsBuying);

                System.out.println("Subtotal: $" + cashRegister.getSubtotal());
                System.out.println("Sales tax: $" + cashRegister.getTax());
                System.out.println("Total: $" + cashRegister.getTotal());
                item.setUnitsOnHand(unitsOnHand - noOfUnitsBuying);
                System.out.println("Units on hand: " + item.getUnitsOnHand());
            /*
            otherwise, if the user inputs more than what we have in hand the program will display a message saying:
            "Sorry, we only have (the amount we have on hand)" and the program will end
             */
            } else {

                System.out.println("Sorry, we only have "
                        + item.getUnitsOnHand() + " in stock.");

            }

        } catch (Exception e) {

        }
    }
}