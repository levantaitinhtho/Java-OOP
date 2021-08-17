package JavaOOP;

public class Dog {
    String sound;
    String birthday;
    String haircolor;
    String species;

    public Dog() {
    }

    public Dog(String sound, String birthday, String haircolor) {
        this.sound = sound;
        this.birthday = birthday;
        this.haircolor = haircolor;
    }

    public Dog(String sound, String birthday, String haircolor, String species) {
        this.sound = sound;
        this.birthday = birthday;
        this.haircolor = haircolor;
        this.species = species;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "sound='" + sound + '\'' +
                ", birthday='" + birthday + '\'' +
                ", haircolor='" + haircolor + '\'' +
                ", species='" + species + '\'' +
                '}';
    }

    void goBathroom(String Address){
        System.out.println("The dog goes to the bathroom in  "+ Address);
    }
    void eatMeal(String MeatType){
        System.out.println("Dog eat "+ MeatType);
    }

}
