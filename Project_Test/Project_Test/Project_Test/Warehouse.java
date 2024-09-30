import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Client> clients;
    private List<Product> products;

    public Warehouse() {
        clients = new ArrayList<>();
        products = new ArrayList<>();
    }

    // Add a new client to the warehouse
    public boolean addClient(String name, String address) {
        Client newClient = new Client(name, address);
        return clients.add(newClient);
    }

    // Add a new product to the warehouse
    public boolean addProduct(String name, int quantity, double price) {
        Product newProduct = new Product(name, quantity, price);
        return products.add(newProduct);
    }

    public boolean addItemToWishlist(String clientID, String productID)
    {
        Client client = getClientById(clientID);
        if(client != null){
            for (Product product: products)
            {
                if(product.getId().equals(productID)){
                    String item = product.getName();
                    client.addtowishlist(item);
                    return true;
                }
            }
        }
        return false;
    }

    // Display all clients in the warehouse
    public void displayClients() {
        if (clients.isEmpty()) {
            System.out.println("No clients found.");
        } else {
            for (Client client : clients) {
                System.out.println(client);
            }
        }
    }

    public boolean search(String name){
        for (Client client : clients)
       {
            if (client.getId().equals(name))
            {
                System.out.println("You are in the system");
                return true;
            }
        }
        return false;
    } 

    public boolean searchproduct(String Pro_Id){
        for (Product Product : products)
       {
            if (Product.getId().equals(Pro_Id))
            {
                System.out.println("here");
                return true;
            }
        }
        return false;
    }

    // Display all products in the warehouse
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products found.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public Client getClientById(String clientId) {
        for (Client client : clients)
         {
            if (client.getId().equals(clientId)) 
            {
                return client;
            }
        }
        return null;
        }

        public void displayWishlist(String clientId) {
            Client client = getClientById(clientId);
            if (client != null) {
                System.out.println("Wishlist for client " + client.getName() + ": " + client.getWishlist().getWishlist());
            } else {
                System.out.println("Client not found.");
            }
    }
}
