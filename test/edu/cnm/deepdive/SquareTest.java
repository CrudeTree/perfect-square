package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class SquareTest {

  @Test
  void isPerfectSquare() {
    assertTrue(Square.isPerfectSquare(0));
    assertTrue(Square.isPerfectSquare(4));
    assertTrue(Square.isPerfectSquare(9));
    assertTrue(Square.isPerfectSquare(16));
    assertFalse(Square.isPerfectSquare(5));

  }

  @Test
  void isPerfectSquareException() {
    assertThrows(IllegalArgumentException.class, new Executable() {

      @Override
      public void execute() throws Throwable {
        Square.isPerfectSquare(-1);
      }
    });
  }

}