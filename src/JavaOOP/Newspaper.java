package JavaOOP;
import java.util.Scanner;
public class Newspaper extends Document {
    private String releaserdate;

    public Newspaper(){

    }

    public Newspaper(String releaserdate,String id, String producer,int export ) {
        super(id, producer, export);
        this.releaserdate = releaserdate;
    }

    public String getReleaserdate() {
        return releaserdate;
    }

    public void setReleaserdate(String releaserdate) {
        this.releaserdate = releaserdate;
    }
    public void getInforNewSpaper(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Release Date: ");
        releaserdate = sc.nextLine();
        System.out.println("ID: ");
        id = sc.nextLine();
        System.out.println("Producer: ");
        producer = sc.nextLine();
        System.out.println("Export: ");
        export = sc.nextInt();
    }
    public void displayNewspaper(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "id='" + id + '\'' +
                ", producer='" + producer + '\'' +
                ", export=" + export +
                ", releaserdate='" + releaserdate + '\'' +
                '}';
    }
}
