public class StaticBook {
    String title;
    String author;
    int numberOfPages;
    static String owner;

    public StaticBook(){}

    public StaticBook(String title, String author, int numberOfPages){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        StaticBook.owner = owner;
    }

    public String toString(){
        return this.title + " " + this.author + " " + this.numberOfPages + " " + this.getOwner();
    }

    public static void resetOwner(){
        owner = "";

    }

    public static void main(String[] args) {
        StaticBook b1 = new StaticBook();
        StaticBook b2 = new StaticBook("HP", "Rowling", 700);

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        b1.setOwner("AIT");
        StaticBook.owner = "TA";

        System.out.println(b1);
        System.out.println(b2);

        StaticBook.resetOwner();
        System.out.println(b1);
        System.out.println(b2);
    }

}
