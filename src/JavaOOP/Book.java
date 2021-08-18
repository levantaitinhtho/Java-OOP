package JavaOOP;
import java.util.Scanner;
public class Book extends Document {
    private String author;
    private int numberpage;

    public Book() {
    }

    public Book(String author, int numberpage,String id , String producer,int export ) {
        super(id, producer, export);
        this.author = author;
        this.numberpage = numberpage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberpage() {
        return numberpage;
    }

    public void setNumberpage(int numberpage) {
        this.numberpage = numberpage;
    }
    public void getInforBook(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Author: ");
        author = sc.nextLine();
        System.out.println("Enter Page Number: ");
        numberpage = sc.nextInt();
        System.out.println("ID: ");
        id = sc.nextLine();
        System.out.println("Producer: ");
        producer = sc.nextLine();
        System.out.println("Export: ");
        export = sc.nextInt();
    }
    public void displayBook(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", numberpage=" + numberpage +
                ", id='" + id + '\'' +
                ", producer='" + producer + '\'' +
                ", export=" + export +
                '}';
    }
}
