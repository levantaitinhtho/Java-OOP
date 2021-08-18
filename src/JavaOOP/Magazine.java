package JavaOOP;
import java.util.Scanner;
public class Magazine extends Document {
    private String releasemonth;
    private String releasenumber;
    public Magazine(){

    }

    public Magazine(String releasemonth, String releasenumber,String id, String producer,int export ) {
        super(id, producer, export);
        this.releasemonth = releasemonth;
        this.releasenumber = releasenumber;
    }

    public String getReleasemonth() {
        return releasemonth;
    }

    public void setReleasemonth(String releasemonth) {
        this.releasemonth = releasemonth;
    }

    public String getReleasenumber() {
        return releasenumber;
    }

    public void setReleasenumber(String releasenumber) {
        this.releasenumber = releasenumber;
    }
    public void getInfoMagazine(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Release Month: ");
        releasemonth = sc.nextLine();
        System.out.println("Enter Release Number: ");
        releasenumber = sc.nextLine();
        System.out.println("ID: ");
        id = sc.nextLine();
        System.out.println("Producer: ");
        producer = sc.nextLine();
        System.out.println("Export: ");
        export = sc.nextInt();
    }
    public void displayMagazine(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "id='" + id + '\'' +
                ", producer='" + producer + '\'' +
                ", export=" + export +
                ", releasemonth='" + releasemonth + '\'' +
                ", releasenumber='" + releasenumber + '\'' +
                '}';
    }
}
