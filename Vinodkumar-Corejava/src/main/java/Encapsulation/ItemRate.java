package Encapsulation;

public class ItemRate {
	private String name;
	private double costPerDay;
	private double deposit;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public void display()
	{
		setName("Item");
		System.out.println("Enter item Name "+getName());
		setCostPerDay(25000.00);
		System.out.println("Enter Costperday "+getCostPerDay());
		setDeposit(10000.50);
		System.out.println("Enter the deposit "+getDeposit());
		System.out.println("ITEM DETAILS");
		System.out.println("Name : "+getName());
		System.out.println("CostPerday : "+getCostPerDay());
		System.out.println("Deposit : "+getDeposit());
	}
	

}
