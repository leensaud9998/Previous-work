
import java.nio.file.Paths;
import java.util.Scanner;

public class BookStore extends Store {

    
    private static Scanner input;
    
    

    public BookStore(String storeName) {
        this.storeName=storeName;
        try {
            readProduct("Books.txt");
        } catch (Exception ex) {
            System.out.println("Failed to read from the file.");
        }
    }

    @Override
    public void readProduct(String fileName) throws Exception {
        input = new Scanner(Paths.get(fileName));
        input.nextLine();
        while (input.hasNext()) {
            if (productCount < MAX_PRODUCTS)
                StoreProducts[productCount++] = new Book(input.next(), input.next(), input.next(), input.nextInt(),
                        input.nextDouble());
            else {
                System.out.println("Failed to add , Store max Products number is exceeded");
                break;
            }
        }
        input.close();
    }

    @Override
    public void viewProduct() {
        System.out.println("\nID \tTitle \tAuthor \tQuantity \tPrice\n");
        for (int i = 0; i < productCount; i++) {
            Book book = (Book) StoreProducts[i];
            System.out.printf("%s \t%s \t%s \t%d \t%.2f%n", book.getId(), book.getTitle(), book.getAuthor(),
                    book.getQuantity(), book.getPrice());
        }

    }

 
    public boolean searchByTitle(String title) {
        for (int i = 0; i < productCount; i++) {
            if (((Book) StoreProducts[i]).getTitle().equalsIgnoreCase(title))
                return true;
        }
        return false;
    }



    public static void main(String[] args) {

        int choice = 0;
        String id;
        BookStore Store1 = new BookStore("Jarrir");
        input = new Scanner(System.in);
        System.out.println("Welcome to the book online store");
        do {
            System.out.println("\nWould you like to:");
            System.out.println("1- View Products in the store.");
            System.out.println("2- Add product to your cart");
            System.out.println("3- View products in your cart");
            System.out.println("4- Remove product from your cart");
            System.out.println("5- Search book by title");
            System.out.println("6- Exit.");
            System.out.print("Enter the number of your selection:  ");
            choice = input.nextInt();

            switch (choice) {
                case 1:// View Products in the store
                    Store1.viewProduct();
                    break;

                case 2:// Add product to your cart
                    Store1.viewProduct();
                    System.out.println("Please Enter the ID of the book that you want to add:");
                    id = input.next();
                    Item book1 = Store1.searchByID(id);
                    if (book1 == null) {
                        System.out.println("Sorry , This book doesn't exist in the store.");
                    } else {
                        Store1.customerCart.addItem(book1);
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

                        System.out.println("Please Enter the ID of the book that you want to remove:");
                        id = input.next();
                        Store1.customerCart.removeItem(id);
                    }
                    break;

                case 5:// Search book by title
                    System.out.println("Please Enter book title that you are looking for:");
                    String title = input.next();
                    if (Store1.searchByTitle(title))
                        System.out.println("Yes, this book exists in the store.");
                    else
                        System.out.println("Sorry,this book doesn't exist in the store.");
                    break;

                case 6: // Exit
                    System.out.println("Thank you for shopping , See you soon.");
                    break;

            }
        } while (choice != 6);
    }
}
