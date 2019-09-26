package edu.cnm.deepdive;

public class Square {

  /**
   * Test {@code input} and returns {@code true} if it is a perfect square, and returns {@code false}
   * otherwise.
   * @param value number to be tested.
   * @return flag indicating whether {@code value} is a perfect square
   * @throws IllegalArgumentException IllegalArgumentException if {@code value} is negative.
   */
  public static boolean isPerfectSquare(int value) throws IllegalArgumentException {
    if (value < 0) {
      throw new IllegalArgumentException();
    }
    int roundRoot = (int) (Math.sqrt(value));
    return roundRoot * roundRoot == value;
  }

}
