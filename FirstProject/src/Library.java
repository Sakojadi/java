import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Library {
    Books[] books;
    int indAv;

    public Library(){
        this.books = new Books[10];
        indAv = 0;
    }

    public void addBooks(String author, String title){
        if (indAv>9) {
            System.out.println(replaceBook(author, title));
        }
        else{
            Books book = new Books(author, title);
            this.books[indAv] = book;
            indAv+=1;
        }
    }

    public String borrowBooks(String title){
        for(Books i: books){
            if(i!=null) {
                if (i.getTitle().equals(title) && i.getIsAvailable()) {
                    i.setIsAvailable(false);
                    return "Succesfully borrowed: " + title;
                } else if (!i.getIsAvailable()) {
                    return "The book is not available";
                }
            }
        }
        return "No book like that";
    }
    public String returnBook(String title){
        for(Books i: books){
            if(i!=null) {
                if (i.getTitle().equals(title) && !i.getIsAvailable()) {
                    i.setIsAvailable(true);
                    return "Succesfully returned: " + title;
                } else if (i.getIsAvailable()) {
                    return "The books is already available";
                }
            }
        }
        return "There was no book like that";
    }

    public void showBooks(){
        for(Books i: books){
            if(i==null) {
                continue;
            }
            else if (i.getIsAvailable()) {
                System.out.println(i);
            }
        }
    }

    public String replaceBook(String author, String title){
        for(int i =0 ; i <10; i++){
            if(books[i].getIsAvailable()){
                Books b = books[i];
                books[i] = new Books(author, title);
                return "Book " + b.getTitle() + " replaced with " + title;
            }
        }
        return "No book available to replace";
    }
    public String replaceBook(String oldAuth, String oldTitle, String newAuth, String newTitle){
        for(Books i: books){
            if(i!=null){
                if(i.equalss(oldAuth, oldTitle)){
                    if(!i.getIsAvailable()){
                        return "The book is not currently in the library";
                    }
                    i.setAuthor(newAuth);
                    i.setTitle(newTitle);
                    return "Replaced old book " + oldTitle + " with " + newTitle;
                }
            }
        }
        return "No old book like that";
    }

}

class Books{
    private String author;
    private String title;
    private boolean isAvailable;

    public Books(String author, String title) {
        this.author = author;
        this.title = title;
        this.isAvailable = true;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String toString(){
        return "Title: " + this.title + " Author: " + this.author;
    }

    public boolean equalss(String auth, String title){
        return Objects.equals(title, getTitle()) & Objects.equals(auth, getAuthor());
    }
}

class MainLibrary {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Library Menu:\n1. View Available Books\n2. Borrow a Book\n3. Return a Book\n4. Add a Book\n5. Replace Book\n6. Exit\n");
            int ind = scan.nextInt();
            String title;
            String author;
            scan.nextLine();
            switch (ind) {
                case 1:
                    lib.showBooks();
                    break;
                case 2:
                    System.out.println("Enter a book title: ");
                    title = scan.nextLine();
                    System.out.println(lib.borrowBooks(title));
                    break;
                case 3:
                    System.out.println("Enter a book title: ");
                    title = scan.nextLine();
                    System.out.println(lib.returnBook(title));
                    break;
                case 4:
                    System.out.println("Enter author: ");
                    author = scan.nextLine();
                    System.out.println("Enter a title: ");
                    title = scan.nextLine();
                    lib.addBooks(author, title);
                    break;
                case 5:
                    System.out.println("Enter the old book author: ");
                    String oldauthor = scan.nextLine();
                    System.out.println("Enter the old book title: ");
                    String oldtitle = scan.nextLine();
                    System.out.println("Enter a new book author: ");
                    author = scan.nextLine();
                    System.out.println("Enter a new book title: ");
                    title = scan.nextLine();
                    System.out.println(lib.replaceBook(oldauthor, oldtitle, author, title));
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No option like that! 💩💩💩");
                    break;
            }
        }
    }
}