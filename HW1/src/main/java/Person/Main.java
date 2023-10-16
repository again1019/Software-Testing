package Person;

import java.util.Scanner;

/**
 * Class Main.
 */
public class Main {



  public static void main(String[] args) throws Exception {


    Person exPerson = new Person("Tom", 2002);
    exPerson.setHW(1.6, 70);

    System.out.println("Example.\n       name: " + exPerson.getName() + ", birthyear: " + exPerson.getBirthyear() + ", height: "
        + exPerson.getHeight() + ", weight: " + exPerson.getWeight() + "\n       =>" + "Age: " + exPerson.getAge() + ", BMI: " + exPerson.getBMI());

    Scanner keyboard = new Scanner(System.in);

    System.out.println("\nPlease enter person name birthyear height weight:");
    String name = keyboard.next();
    int birthyear = keyboard.nextInt();
    double height = keyboard.nextDouble();
    double weight = keyboard.nextDouble();


    Person person1 = new Person(name, birthyear, height, weight);

    System.out.println("\n       name: " + person1.getName() + ", birthyear: " + person1.getBirthyear() + ", height: "
        + person1.getHeight() + ", weight: " + person1.getWeight() + "\n       =>" + "Age: " + person1.getAge() + ", BMI: " + person1.getBMI());






  }

}
