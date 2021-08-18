package JavaOOP;
import java.util.Scanner;
public class Document {
    protected String id;
    protected String producer;
    protected int export;

    public Document() {
    }

    public Document(String id, String producer, int export) {
        this.id = id;
        this.producer = producer;
        this.export = export;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getExport() {
        return export;
    }

    public void setExport(int export) {
        this.export = export;
    }
    public void getInforDocument(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        id = sc.nextLine();
        System.out.println("Enter Producer: ");
        producer = sc.nextLine();
        System.out.println("Enter Export: ");
        export = sc.nextInt();
    }
    public void displayDocument(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", producer='" + producer + '\'' +
                ", export=" + export +
                '}';
    }
}
