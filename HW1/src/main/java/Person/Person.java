package Person;

import java.math.BigDecimal;

/**
 * Person class to record information.
 */
public class Person {

  String name;
  private int birthyear = 0;
  private double height = 0;
  private double weight = 0;

  private int thisYear = 2023;

  /**
   * Constructor.
   *
   * @param name
   * @param birthyear
   */
  public Person(String name, int birthyear) throws Exception {

    if (name.isEmpty()) {
      throw new Exception("name can't be null.");

    }

    if (birthyear < (thisYear - 130) || birthyear > thisYear) {
      throw new Exception("invalid birthyear.");
    }
    this.name = name;
    this.birthyear = birthyear;

  }

  /**
   * Constructor.
   *
   * @param name
   * @param birthyear
   * @param height
   * @param weight
   */
  public Person(String name, int birthyear, double height, double weight) throws Exception {
    if (name.isEmpty()) {
      throw new Exception("name can't be null.");

    }

    if (birthyear < (thisYear - 130) || birthyear > thisYear) {
      throw new Exception("invalid birthyear.");
    }

    this.name = name;
    this.birthyear = birthyear;

    try {
      setHW(height, weight);
    } catch (Exception e) {
      setHW(height / 100, weight);
    }

  }

  /**
   * Method to setHeight.
   *
   * @param height
   */
  public void setHeight(double height) throws Exception {

    if (height > 2.2) {
      throw new Exception("invalid height, please use meter to calculate height.");

    } else if (height <= 0) {
      throw new Exception("invalid height, please enter correct height.");

    }

    this.height = height;
  }

  /**
   * Method to setWeight.
   *
   * @param weight
   */
  public void setWeight(double weight) throws Exception {

    if (weight > 300 || weight <= 0) {
      throw new Exception("invalid weight, please enter correct height.");
    }

    this.weight = weight;
  }

  /**
   * Method to setHW.
   *
   * @param height
   * @param weight
   */
  public void setHW(double height, double weight) throws Exception {

    if (height > 2.2) {
      throw new Exception("invalid height, please use meter to calculate height.");
    } else if (height <= 0) {
      throw new Exception("invalid height, please enter correct height.");
    }

    if (weight > 300 || weight <= 0) {
      throw new Exception("invalid weight, please enter correct height.");
    }

    this.height = height;
    this.weight = weight;
  }

  /**
   * Method getName.
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Method getBirthyear.
   * @return birthyeaer
   */
  public int getBirthyear() {
    return birthyear;
  }

  /**
   * Method getHeight.
   * @return height
   */
  public double getHeight() {
    return height;
  }

  /**
   * Method getWeight.
   * @return weight
   */
  public double getWeight() {
    return weight;
  }


  /**
   * Method to getBMI.
   *
   * @return BMI
   */
  public double getBMI() throws Exception {

    if (weight == 0 || height == 0) {
      throw new Exception("error,please set weight and height.");
    }

    double BMI = weight / (height * height);

    if (BMI > 90 || BMI < 10) {
      throw new Exception("invalid BMI, please set/reset height or weight.");
    }
    return BMI;
  }


  /**
   * Method to getAge.
   *
   * @return age
   */
  public int getAge() {


    int age = this.thisYear - this.birthyear;

    assert (age > 0 && age <= 130) : "invalid age, please enter correct birthday.";

    return age;
  }



}
