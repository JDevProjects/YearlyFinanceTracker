
public class PersonalFinanceTracker
{
	private double totalIncome;
	private double totalExpenses;
	private double balance;

	public void setTotalIncome(double totalIncome)
	{
		this.totalIncome = totalIncome;
	}

	public void setTotalExpenses(double totalExpenses)
	{
		this.totalExpenses = totalExpenses;
	}

	public double calculateBalance()
	{
		return (totalIncome - totalExpenses);
	}


}