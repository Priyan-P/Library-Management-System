import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
    books.add(book);
    System.out.println("Book added successfully!");
    }
    public void viewBooks(){
        if(books.isEmpty()){
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
                System.out.println("--------------------");
            }
        }
    }
    public void searchBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                System.out.println("Book found:");
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book not found.");
    }
    public void deleteBook(int id){
        for(int i=0;i<books.size();i++){
            if(books.get(i).getId()==id){
                books.remove(i);
                System.out.println("Book deleted successfully!");
                return;
            }
        }
        System.out.println("Book not found.");
    }
    public void issueBook(int id) {
    for (Book book : books) {
        if (book.getId() == id) {
            if (book.isIssued()) {
                System.out.println("Book is already issued.");
            } else {
                book.setIssued(true);
                System.out.println("Book issued successfully!");
            }
            return;
        }
    }
    System.out.println("Book not found.");
    }
    public void returnBook(int id) {
    for (Book book : books) {
        if (book.getId() == id) {

            if (!book.isIssued()) {
                System.out.println("Book was not issued.");
            } else {
                book.setIssued(false);
                System.out.println("Book returned successfully!");
            }

            return;
        }
    }

    System.out.println("Book not found.");
    }



}