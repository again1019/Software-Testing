package Triangle;


/**
 * Class TriangleException.
 */
public class TriangleException extends Exception {
  int a;
  int b;
  int c;

  public TriangleException(String message) {
    super(message);
  }

  /**
   *Method to TriangleException.
   *
   * @param message
   * @param a
   * @param b
   * @param c
   */
  public TriangleException(String message, int a, int b, int c) {
    super(message);

    this.a = a;
    this.b = b;
    this.c = c;


  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public int getC() {
    return c;
  }

  public void setC(int c) {
    this.c = c;
  }
}

