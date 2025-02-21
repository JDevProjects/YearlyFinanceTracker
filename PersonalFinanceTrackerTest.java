
import java.util.Scanner;
import java.io.*;

/*
Purpose of the program:

The PersonalFinanceTrackerTest class asks the user for incomes and expenses for this year.
The total income and total expenses are send to the PersonalFinanceTracker class and the balance is calculated and returned.
The following information is written to the PersonalFinanceTracker.txt file: the list of incomes, total income, list of expenses, total expenses, and balance.
*/

public class PersonalFinanceTrackerTest
{
	public static void main(String [] args) throws IOException
	{
		double income, expense;

		Scanner keyboard = new Scanner(System.in);
		PersonalFinanceTracker user1 = new PersonalFinanceTracker();

		// Open file
		File file = new File("PersonalFinanceTracker.txt");
		PrintWriter outputFile = new PrintWriter(file);


		// Sources of Income From User
		outputFile.println("List Of Income Sources:");
		String moreIncomeEntries = "yes";
		double totalIncome = 0;
		while (moreIncomeEntries.equals("yes"))
		{
			System.out.println("Please enter a source of income from this year: ");
			income = keyboard.nextDouble();

			// Write to file
			outputFile.println(income);

			totalIncome += income;

			System.out.println("Would you like to enter another source of income?  Type 'yes' or 'no'");
			keyboard.nextLine();
			moreIncomeEntries = keyboard.nextLine();
		}
		outputFile.println("Total Income: " + totalIncome + "\n");
		user1.setTotalIncome(totalIncome);

		// Expenses From User
		outputFile.println("List Of Expenses:");
		String moreExpenseEntries = "yes";
		double totalExpenses = 0;
		while (moreExpenseEntries.equals("yes"))
		{
			System.out.println("Please enter an expense from this year: ");
			expense = keyboard.nextDouble();

			// Write to file
			outputFile.println(expense);

			totalExpenses += expense;

			System.out.println("Would you like to enter another expense?  Type 'yes' or 'no'");
			keyboard.nextLine();
			moreExpenseEntries = keyboard.nextLine();
		}
		outputFile.println("Total Expenses: " + totalExpenses + "\n");
		user1.setTotalExpenses(totalExpenses);

		// Balance
		outputFile.println( "The balance for 2025 is: " + user1.calculateBalance() );

		outputFile.close();

	}
}