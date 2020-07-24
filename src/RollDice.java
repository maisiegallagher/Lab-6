import java.util.Scanner;

public class RollDice {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		Boolean again = true;
		int count = 0;

		System.out.println("Enter the number of sides for a pair of dice:");
		int numSide = (scnr.nextInt());

		while (again == true) {
			int die1, die2;
			count += 1;

			System.out.println("Roll " + count + ":");
			die1 = generateRandomDieRoll(numSide);
			die2 = generateRandomDieRoll(numSide);
			System.out.println(die1);
			System.out.println(die2);
			specialMessageTest(die1, die2);

			System.out.println("Would you like to roll again? y/n");
			again = scnr.next().startsWith("y");

		}
		System.out.println("Goodbye!");

		scnr.close();
	}

	public static int generateRandomDieRoll(int numSide) {
		int dice1 = (int) ((Math.random() * numSide) + 1);
		return dice1;

	}

	public static int sumOfTwoDice(int die1, int die2) {
		return die1 + die2;
	}

	public static void specialMessageTest(int die1, int die2) {
		int x = sumOfTwoDice(die1, die2);
		if (x == 7 || x == 11) {
			System.out.println("You rolled craps!");
		}
		if (die1 == 1 && die2 == 1) {
			System.out.println("You rolled snake eyes!");
		}
		if (die1 == 6 && die2 == 6) {
			System.out.println("You rolled box cars!");
		}
	}
}
