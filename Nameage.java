import java.util.Scanner;
public class Nameage {
    Scanner scanner = new Scanner(System.in);
    String name;
    int age;
    
    public void readNameAndAge() {
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
    }
    public void displayNameAndAge() {
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age + " years old.");
    }
    public static void main(String[] args) {
        Nameage person = new Nameage();
        person.readNameAndAge();
        person.displayNameAndAge();
    }
}
