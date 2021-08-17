package JavaOOP;
import java.util.Scanner;
public class MainOfDog {
    public static void main(String[] args) {
        Dog[] D = new Dog[10];
        D[0] = display();
        System.out.println(D[0]);
        D[0].eatMeal("Pig");
    }
    public static Dog display(){
        Dog d = null;
        String sound,birthday,haircolor,species;
        Scanner sc= new Scanner(System.in);
        System.out.println("Sound is: ");
        sound = sc.nextLine();
        System.out.println("Birthday is: ");
        birthday = sc.nextLine();
        System.out.println("Hair Color is: ");
        haircolor = sc.nextLine();
        System.out.println("Species is: ");
        species = sc.nextLine();
        d = new Dog (sound,birthday,haircolor,species);
        return d;
    }
}
