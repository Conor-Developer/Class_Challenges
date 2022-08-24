package Exercise_4;

public class Library {
    public static void main(String[] args) {

        Author author1 = new Author("J.K Rowling", "jkrowling@gmail.com", 'F');
        Book book1 = new Book("Harry Potter", author1 , 10, 1);
        System.out.println(book1);

        System.out.println("Name: " + book1.getName());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: " + book1.getPrice());

        book1.setPrice(15);
        System.out.println("Price: " + book1.getPrice());
        System.out.println("Quantity: " + book1.getQuantity());
        book1.setQuantity(100);
        System.out.println("Quantity: " + book1.getQuantity());

        System.out.println(book1);

    }
}
