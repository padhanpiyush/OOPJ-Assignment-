class Library {
    String[] books = new String[10];
    int count = 0;

    
    void addBook(String book) {
        books[count] = book;
        count++;
        System.out.println(book + " added to library.");
    }

    
    void removeBook(String book) {
        for (int i = 0; i < count; i++) {
            if (books[i].equals(book)) {

                
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }

                count--;
                System.out.println(book + " removed from library.");
                return;
            }
        }

        System.out.println(book + " not found in library.");
    }
}

public class Main2 {
    public static void main(String[] args) {

        Library l = new Library();

        l.addBook("Java");
        l.addBook("C++");
        l.addBook("Python");

        l.removeBook("C++");
    }
}