package Person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  Person person1, person2, person3, person4, person5;
  @Test
  void person1Test() throws Exception {
    //person1 -- don't set height and weight.
    person1 = new Person("Tom", 2002);
    assertEquals("Tom", person1.name);

    double person1BMI = person1.getBMI();
    double person1Age = person1.getAge();

    System.out.println("\nperson1: " + person1.name + "\nAge: " + person1Age + "\nBMI: " + person1BMI);

  }

  @Test
  void person2Test() throws Exception {
    //person2 -- wrong birthyear(can't be future).
    person2 = new Person("Anny", 2024);
    person2.setHW(1.6, 60);

    double person2BMI = person2.getBMI();
    int person2Age = person2.getAge();

    System.out.println("\nperson2: " + person2.name + "\nAge: " + person2Age + "\nBMI: " + person2BMI);
  }

  @Test
  void person3Test() throws Exception {
    //person3 -- name can't be null.
    person3 = new Person("", 5);
    person3.setHW(1.5f, 80);

    double person3BMI = person3.getBMI();
    int person3Age = person3.getAge();

    System.out.println("\nperson3: " + person3.name + "\nAge: " + person3Age + "\nBMI: " + person3BMI);
  }

  @Test
  void person4Test() throws Exception {
    //person4 -- wrong weight (BMI too low)
    person4 = new Person("Lily", 2003);
    person4.setHW(1.8, -5);

    double person4BMI = person4.getBMI();
    int person4Age = person4.getAge();

    System.out.println("\nperson4: " + person4.name + "\nAge: " + person4Age + "\nBMI:　" + person4BMI);
  }

  @Test
  void person5Test() throws Exception {
    //person5 -- correct
    person5 = new Person("Sandy", 2003);
    person5.setHW(1.7, 50);

    double person5BMI = person5.getBMI();
    int person5Age = person5.getAge();

    System.out.println("\nperson5: " + person5.name + "\nAge: " + person5Age + "\nBMI: " + person5BMI);
  }

  @Test
  void person6Test() throws Exception {
    //person6 -- correct. use try and catch to change height.(centimeter <-> meter)
    Person person6 = new Person("Vivi", 2020, 160, 50);

    double person6BMI = person6.getBMI();
    int person6Age = person6.getAge();

    System.out.println("\nperson6: " + person6.name + "\nAge: " + person6Age + "\nBMI: " + person6BMI);
  }


}