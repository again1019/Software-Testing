package Triangle;

import java.util.Scanner;


public class Main {
  public static void main(String[] args) throws Exception {

    Scanner keyboard = new Scanner(System.in);
    System.out.println("please enter 3 sides of triangle : (a b c)");
    int a = keyboard.nextInt();
    int b = keyboard.nextInt();
    int c = keyboard.nextInt();


    Triangle T = new Triangle();
    int result = -1;

    try {
      result = T.checkTriangle(a, b, c);
    } catch (TriangleException e) {
      System.err.println("Invalid triangle: " + e.getMessage());

      System.out.println("Please enter a new value for side a: ");
      int newA = keyboard.nextInt();
      System.out.println("Please enter a new value for side b: ");
      int newB = keyboard.nextInt();
      System.out.println("Please enter a new value for side c: ");
      int newC = keyboard.nextInt();

      e.setA(newA);
      e.setB(newB);
      e.setC(newC);

      result = T.checkTriangle(newA, newB, newC);
    }

    switch (result) {
      case 0:
        System.out.println("Normal triangle");
        break;
      case 1:
        System.out.println("Equilateral triangle");
        break;
      case 2:
        System.out.println("Isosceles triangle");
        break;
      case 3:
        System.out.println("Right triangle");
        break;
      case 4:
        System.out.println("Isosceles right triangle");
        break;
      default:
        System.out.println("not a triangle");
        break;

    }
  }
}
