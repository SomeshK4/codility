package org.javatigers;

public class JumpFromPosition {
	public static void main(String[] args) {
      System.out.println(frogJumps(10, 85, 30));
	}

	public static int frogJumps(int X, int Y, int D) {
		int numberOfJumps = 0;

		if ((Y - X) < D) {
			numberOfJumps = 1;
		}
		if ((Y - X) % D == 0) {
			numberOfJumps = (Y - X) / D;
		} else {
			numberOfJumps = ((Y - X) / D) + 1;
		}

		return numberOfJumps;
	}
}
