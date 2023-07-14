
import java.nio.file.Paths;
import java.util.Scanner;

public class FurnitureStore extends Store {

    
    private static Scanner input;
    private int bedCount = 0;
    
    public FurnitureStore(String storeName) {
        this.storeName=storeName;
        try {
            readProduct("Beds.txt");
            readProduct("Desks.txt");
        } catch (Exception ex) {
            System.out.println("Failed to read from the file.");
        }
    }

    @Override
    public void readProduct(String fileName) throws Exception {
        input = new Scanner(Paths.get(fileName));
        input.nextLine();
        while (input.hasNext()) {
            if (productCount < MAX_PRODUCTS) {
                if (fileName.equals("Beds.txt")) {
                    StoreProducts[productCount++] = new Bed(input.next(), input.next(), input.nextInt(), input.next(),
                            input.next(), input.next(), input.nextDouble());
                    bedCount++;
                } else {
                    StoreProducts[productCount++] = new Desk(input.next(), input.next(), input.nextInt(), input.next(),
                            input.next(), input.nextDouble());
                }
            } else {
                System.out.println("Failed to add , Store max Products number is exceeded");
                break;
            }
        }
        input.close();
    }

    @Override
    public void viewProduct() {
        System.out.println("\n***********Beds***********");
        System.out.println("ID \tBrand \tQuantity \tColor \tType \tSize \tPrice\n");
        for (int i = 0; i < bedCount; i++) {
            Bed bed = (Bed) StoreProducts[i];
            System.out.printf("%s \t%s \t%d \t%s \t%s \t%s \t%.2f%n", bed.getId(), bed.getBrand(), bed.getQuantity(),
                    bed.getColor(), bed.getType(), bed.getSize(), bed.getPrice());
        }
        System.out.println("\n***********Desks***********");
        System.out.println("ID \tType \tQuantity \tColor \tMaterial \tPrice\n");
        for (int i = bedCount; i < productCount; i++) {
            Desk desk = (Desk) StoreProducts[i];
            System.out.printf("%s \t%s \t%d \t%s \t%s \t%.2f%n", desk.getId(), desk.getType(), desk.getQuantity(),
                    desk.getColor(), desk.getMaterial(), desk.getPrice());
        }
        System.out.println("");

    }



    public static void main(String[] args) {

        int choice = 0;
        String id;
        FurnitureStore Store1 = new FurnitureStore("IKEA");
        input = new Scanner(System.in);
        System.out.println("Welcome to the Furniture online store");
        do {
            System.out.println("\nWould you like to:");
            System.out.println("1- View Products in the store.");
            System.out.println("2- Add product to your cart");
            System.out.println("3- View products in your cart");
            System.out.println("4- Remove product from your cart");
            System.out.println("5- Exit.");
            System.out.print("Enter the number of your selection:  ");
            choice = input.nextInt();

            switch (choice) {
                case 1:// View Products in the store
                    Store1.viewProduct();
                    break;

                case 2:// Add product to your cart
                    Store1.viewProduct();
                    System.out.println("Please Enter the ID of the furniture that you want to add:");
                    id = input.next();
                    Item furniture1 = Store1.searchByID(id);
                    if (furniture1 == null) {
                        System.out.println("Sorry , This furniture doesn't exist in the store.");
                    } else {
                        Store1.customerCart.addItem(furniture1);
                    }
                    break;

                case 3:// View products in your cart
                    Store1.customerCart.viewItems();
                    break;

                case 4:// Remove product from your cart
                    if (Store1.customerCart.getItemCount() == 0) {
                        System.out.println("Your cart is empty");
                    } else {
                        Store1.customerCart.viewItems();

                        System.out.println(
                                "Please Enter the ID of the furniture that you want to remove: ");
                        id = input.next();
                        Store1.customerCart.removeItem(id);
                    }
                    break;

                case 5: // Exit
                    System.out.println("Thank you for shopping , See you soon.");
                    break;

            }
        } while (choice != 5);
    }
}
