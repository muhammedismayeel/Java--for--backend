import java.util.*;
class day8{
    public static void main(String[]arge){
        // List to store book titles (duplicates allowed)
        List<String> books = new ArrayList<>();
        books.add("Java");
        books.add("HTML");
        books.add("CSS");
        books.add("Python");
        System.out.println("All books in library :"+books);
        // Set to store unique members (no duplicates)
        Set<String> members = new HashSet<>();
        members.add("ali");
        members.add("Ismayeel");
        members.add("jhon");
        members.add("klo");
        System.out.println("Unique Members are :" + members);
        //Map to store bookId → borrowerName
        Map<Integer, String> borrowedBooks = new HashMap<>();
        borrowedBooks.put(101, "ali");
        borrowedBooks.put(102, "Ismayeel");
        borrowedBooks.put(103, "jhon");
        borrowedBooks.put(104, "klo");
        System.out.println("📖 Borrowed Books (Map): " + borrowedBooks);
        //Display borrowed books in a nicer way
        System.out.println("\n===== Borrowed Books Details =====");
        for (Map.Entry<Integer, String> entry : borrowedBooks.entrySet()) {
            System.out.println("BookID: " + entry.getKey() + " → Borrower: " + entry.getValue());
        }
    }
}