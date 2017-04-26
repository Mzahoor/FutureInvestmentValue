package futureinvestmentvalue;


import java.util.Scanner;
/**
 *
 * @author muhammadzahoor
 */
public class FutureInvestmentValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Create a Scanner
		final int NUMBER_OF_YEARS = 30; // Number of years to display

		// Enter the investment amount and interest rate in the following tag
		System.out.print("\nThe amount invested: ");
		double amount = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		//  Monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;

		// Table that displays future value for the years from 1 to 30
		System.out.println("Years     Future Value"); // Table header value
		for (int years = 1; years <= NUMBER_OF_YEARS; years++) {
			System.out.printf("%-10d", years);
			System.out.printf("%11.2f\n", 
				futureInvestmentValue(amount, monthlyInterestRate, years));
		}
	}

	/** futureInvestmentValue computes future investement value */
	public static double futureInvestmentValue(
		double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
}
    
    

