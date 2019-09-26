package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class SquareTest {

  @Test
  void isPerfectSquare() {
    assertTrue(Square.isPerfectSquare(0));
  }

  @Test
  void isPerfectSquareException() {
    assertThrows(IllegalArgumentException.class, new ExecuteIsPerfectSquare());
  }

  private static class ExecuteIsPerfectSquare implements Executable {

    @Override
    public void execute() throws Throwable {
      Square.isPerfectSquare(-1);
    }
  }
}