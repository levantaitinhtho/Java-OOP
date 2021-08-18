package javaoop;

public class Officer extends Employee {
    private int department;
    private int level;
    public Officer(String name,String gender,String birthday,String address,int department,int level) {
        super(name, gender, birthday, address);
        this.department = department;
        this.level = level;
    }
    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
