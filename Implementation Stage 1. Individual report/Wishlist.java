import java.util.*;

public class Wishlist {
    private Map<String, Integer> wishlist;

    public Wishlist() {
        this.wishlist = new HashMap<>();
    }

    public Map<String, Integer> getWishlist() {
        return wishlist;
    }

    public void addToWishlist(String item, int quantity) {
        wishlist.put(item, wishlist.getOrDefault(item, 0) + quantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : wishlist.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}
