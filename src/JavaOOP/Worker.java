package JavaOOP;

public class Worker extends Employee {
    private String factory;

    public Worker(String name, String gender, String birthday, String address, String factory){
        super(name,gender,birthday,address);
        this.factory = factory;

    }
    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }
}
