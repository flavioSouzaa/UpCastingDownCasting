package Entities;

public class SavingsAccount extends Account{

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void UpdateBalance(Double amount) {
		if(amount <= interestRate) {
			balance += balance * interestRate;
		}
	}

	@Override
	public void Withdraw(Double amount) {
		balance -= amount;
	}
}
