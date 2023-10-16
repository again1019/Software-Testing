package Triangle;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

  Triangle T;


  @Test
  void checkTriangleTest() throws Exception {

    T = new Triangle();
    float test0, test1, test2, test3, test4, test5,test6;

    int value = T.checkTriangle( 2, 3, 4);





    assert value == 0 : "test0 is not a triangle.";
    assertEquals(1, T.checkTriangle(2, 2, 2),"equilateral triangle");

    assertAll("checkTriangle",
        () -> assertTrue(T.checkTriangle(8, 8, 10) == 2),
        () -> assertEquals(0, T.checkTriangle(1, 1, 2)),
        () -> assertEquals(2, T.checkTriangle(8, 8, 10)),
        () -> assertEquals(0, T.checkTriangle(6, 1, -5))

        );



  }
}