package javaoop;

class Employee {
    protected String name;
    protected String gender;
    protected String birthday;
    protected String address;

    public Employee() {

    }

    public Employee(String name, String gender, String birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Birthday: "+ birthday);
        System.out.println("Address: "+ address);
        System.out.println("Gender: "+gender);
    }
}
