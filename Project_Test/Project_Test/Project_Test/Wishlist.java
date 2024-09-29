import java.io.Serializable;

public class Wishlist{
    private String userID;
    private Vector<String> lists = new Vector<>();
    private String name;
    

    public Wishlist(String userID, String name)
    {
        this.userID = userID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalePrice(String userID) {
        this.userID = userID;
    }

    public void display()
    {
        for (int i : lists) {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return "Wishlists [ID: " + id + ", Name: " + name + "]";
    }

}