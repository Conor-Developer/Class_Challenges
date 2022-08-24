package Exercise_4;

public class Book {

    private String name;
    private Author author;
    private double price;
    private int quantity;

    protected Book(String name, Author author, double price, int quantity ) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    protected String getName() {
        return name;
    }

    protected Author getAuthor() {
        return author;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected int getQuantity(){
        return quantity;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Book[name=" + name + "," + author.toString() + ", price=" + price + ", qty=" + quantity + "]";
    }






}
