package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

  @Test
  void isPerfectSquare() {
    assertTrue(Square.isPerfectSquare(0));
  }

  @Test
  void isPerfectSquareException() {
    try {
      Square.isPerfectSquare(-1);
      fail();
    } catch (IllegalArgumentException expected) {
      //Do nothing; this is expected.
    }
  }
}