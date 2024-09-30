import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    ClientList newClientList = new ClientList();
    ProductList newProductList = new ProductList();
    OrderList newOrderList = new OrderList();

    // Add a new client to the warehouse
    public boolean addClient(String name, String address) {
        Client newClient = new Client(name, address);
        return newClientList.addClient(newClient);
    }

    // Add a new product to the warehouse
    public boolean addProduct(String name, int quantity, double price) {
        Product newProduct = new Product(name, quantity, price);
        return newProductList.addProduct(newProduct);
    }

    // Add a new Order to the warehouse
    public boolean addOrder(String clientId, String productId, int quantity) {
        Order newOrder = new Order(clientId, productId, quantity);
        return newOrderList.addOrder(newOrder);
    }

    // Display all clients in the warehouse
    public void displayClients() {
        if (newClientList.isEmpty()) {
            System.out.println("No clients found.");
        } else {
            newClientList.displayAllClients();
        }
    }

    // Display all products in the warehouse
    public void displayProducts() {
        if (newProductList.isEmpty()) {
            System.out.println("No products found.");
        } else {
            newProductList.displayAllProducts();
        }
    }

    // Display orders by customer Id in the warehouse
    public void displayOrders(String clientId) {
        if (newOrderList.isEmpty()) {
            System.out.println("No orders found.");
        } else {
            //newOrderList.displayAllOrders();
            newOrderList.displayOrders(clientId);
        }
    }
}
