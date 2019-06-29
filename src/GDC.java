import java.util.Scanner;

public class GDC { // Greatest common divisor

	public static void main(String[] args) throws gdcIsOne {
		Scanner scan = new Scanner(System.in);

		try {
			gdcIsOne exception = null;
			int dividend;
			int divisor;
			int gcd = 0;

			System.out.println("Please enter your dividend: ");
			dividend = scan.nextInt();

			System.out.println("Please enter your divisor: ");
			divisor = scan.nextInt();

			for (int i = 1; i <= dividend && i <= divisor; ++i) // checking that the gcd is not higher than the input
																// values
			{
				// is i factor of both integers?
				if (dividend % i == 0 && divisor % i == 0) { // the largest positive integer number that divides all the
																// numbers in the set
					// without remainder, reminder here being zero
					gcd = i;

				}

			}

			if (gcd == 1) {
				throw exception;
			}

			System.out.printf("The highest common factor of %d and %d is %d", dividend, divisor, gcd);
//adding the try catch statement to 'get' the generated exception, and thus the program does not terminate
		} catch (Exception e) {
			System.out.println("The Greatest Common divisor is 1");
		}

	}

}