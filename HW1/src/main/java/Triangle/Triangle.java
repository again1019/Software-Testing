package Triangle;

/**
 * Class Triangle to distinguish the kind of triangles.
 */
public class Triangle {

  /**
   *Method to checkTriangle.
   *
   * @param a
   * @param b
   * @param c
   * @return type
   * @throws Exception
   */
  public int checkTriangle(int a, int b, int c) throws Exception {
    //invalid:-1, Normal triangle:0, equilateral triangle:1, isosceles triangle:2, right triangle:3, equilateral right triangle:4

    if (a > 0 && b > 0 && c > 0) {


      if ((a + b) > c && (b + c) > a && (a + c) > b) { //normal triangle

        if (a == b && b == c) { //equilateral triangle
          return 1;

        } else if (Math.pow((a * a + b * b), 0.5) == c || Math.pow((b * b + c * c), 0.5) == a || Math.pow((a * a + c * c), 0.5) == b) {

          if (a == b || b == c || a == c) { //isosceles right triangle
            return 4;
          } else { //right triangle
            return 3;

          }


        } else if (a == b || b == c || a == c) { //isosceles triangle

          assert a + b == c * 2;

          return 2;

        }


        return 0;

      } else { //invalid

        throw new TriangleException("Invalid triangle.");
      }



    }

    assert a > 0 || b > 0 || c > 0;
    //invalid
    throw new TriangleException("Invalid triangle, the side length needs to be more than 0.",a ,b ,c);

  }

}







