import java.util.Scanner;

public class UserInterface {
    private Warehouse warehouse;
    private Scanner scanner;

    public UserInterface() {
        warehouse = new Warehouse();
        scanner = new Scanner(System.in);
    }

    public void run() {
        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    addClient();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    addwishlist();
                    break;
                case 4:
                    displayAllClients();
                    break;
                case 5:
                    displayAllProducts();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private void displayMenu() {
        System.out.println("\n--- Warehouse Management System ---");
        System.out.println("1. Add Client");
        System.out.println("2. Add Product");
        System.out.println("3. Add Product to Client's Wishlist");
        System.out.println("4. Display All Clients");
        System.out.println("5. Display All Products");
        System.out.println("6. Display Client's Wishlist");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    private int getUserChoice() {
        return Integer.parseInt(scanner.nextLine());
    }

    // Adding a new client to the warehouse
    private void addClient() {
        System.out.print("Enter client's name: ");
        String var1 = this.scanner.nextLine();
        System.out.print("Enter client's address: ");
        String var2 = this.scanner.nextLine();
        if (this.warehouse.addClient(var1, var2)) {
           System.out.println("Client added successfully.");
        } else {
           System.out.println("Error adding client.");
        }
  
     }

    // Adding a new product to the warehouse
    private void addProduct() {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter product sale price: ");
        double price = Double.parseDouble(scanner.nextLine());
        if (warehouse.addProduct(name, quantity, price)) {
            System.out.println("Product added successfully.");
        } else {
            System.out.println("Error adding product.");
        }
    }
    private void addwishlist(){
        System.out.print("Enter user ID: ");
        String User_id = scanner.nextLine();
        if(warehouse.search(User_id))
        {
            System.out.println("Hello");
            if(warehouse.searchproduct(User_id))
        }
        else
        {
            System.out.println("You are not in please add");

        }
        
    }

    // Display all clients in the warehouse
    private void displayAllClients() {
        warehouse.displayClients();
    }

    // Display all products in the warehouse
    private void displayAllProducts() {
        warehouse.displayProducts();
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.run();
    }
}