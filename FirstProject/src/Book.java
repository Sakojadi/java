public class Book {
    String title;
    String author;
    int yearPublished;

    public Book(){}

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.yearPublished = year;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String newTitle){
        title = newTitle;
    }

    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getBookInfo(){
        return "Title: " + title + "\nAuthor: " + author + "\nYear published: " + yearPublished;
    }

    public void printBookDetails(){
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nYear published: " + yearPublished);
    }


}

class PrintedBook extends Book{
    int numberOfPages;
    String publisher;
    int price;

    public PrintedBook(String title, String author, int year, int numberOfPages, String publisher) {
        super(title, author, year);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
        price = numberOfPages+400;
    }


    //you can also set the price in this constructor
    public PrintedBook(String title, String author, int year, int numberOfPages, String publisher, int price) {
        super(title, author, year);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
        this.price = price;
    }

    public String getBookInfo(){
        return "Printed Book info: \nTitle: " + title + "\nAuthor: " + author + "\nYear published: " + yearPublished + "\nNum of Pages: " + numberOfPages + "\nPublisher: " + publisher + "\nPrice: " + price + "\n";
    }

    public void printBookDetails(){
        System.out.println("Printed Book details: \nTitle: " + title + "\nAuthor: " + author + "\nYear published: " + yearPublished + "\nNum of Pages: " + numberOfPages + "\nPublisher: " + publisher + "\nPrice: " + price  + "\n");
    }

    public void bookType(){
        System.out.println("This is a printed book");
    }

    public void printBook(){
        System.out.println("Printing the book...");
    }
}


class EBook extends Book{
    double fileSizeMB;
    String fileFormat;
    int price;

    public EBook(String title, String author, int year, double fileSizeMB, String fileFormat) {
        super(title, author, year);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = fileFormat;
        if (fileSizeMB>300){
            price = 700;
        }
        else{
            price = 300;
        }
    }

    //you can also set the price in this constructor
    public EBook(String title, String author, int year, double fileSizeMB, String fileFormat, int price) {
        super(title, author, year);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = fileFormat;
        this.price = price;
    }

    public String getBookInfo(){
        return "EBook info: \nTitle: " + title + "\nAuthor: " + author + "\nYear published: " + yearPublished + "\nFile size: " + fileSizeMB + " MB" + "\nFile format: " + fileFormat + "\nPrice: " + price  + "\n";
    }

    public void printBookDetails(){
        System.out.println("EBook details: \nTitle: " + title + "\nAuthor: " + author + "\nYear published: " + yearPublished + "\nFile size: " + fileSizeMB+" MB" + "\nFile format: " + fileFormat + "\nPrice: " + price + "\n");
    }
    public void bookType(){
        System.out.println("This is an EBook");
    }
}

class MainBook{
    public static void main(String[] args) {
        PrintedBook printedBook = new PrintedBook("Harry Potter", "JK Rowling", 1990, 700, "Bloomsbury Publishing");
        EBook eBook = new EBook("To Kill a Mockingbird", "Harper Lee", 1960, 200, "EPUB");
        printedBook.bookType();
        System.out.println(printedBook.getBookInfo());
        printedBook.printBookDetails();
        eBook.bookType();
        System.out.println(eBook.getBookInfo());
        eBook.printBookDetails();
        PrintedBook printedBook2 = new PrintedBook("Harry Potter", "JK Rowling", 1990, 700, "Bloomsbury Publishing", 900);
        EBook eBook2 = new EBook("To Kill a Mockingbird", "Harper Lee", 1960, 200, "EPUB", 890);

        printedBook2.bookType();
        System.out.println(printedBook2.getBookInfo());
        printedBook2.printBookDetails();
        eBook2.bookType();
        System.out.println(eBook2.getBookInfo());
        eBook2.printBookDetails();
    }

}