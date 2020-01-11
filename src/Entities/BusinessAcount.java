package Entities;

public class BusinessAcount extends Account {

	private Double loanLimit;
	
	public BusinessAcount() {
		super();
	}

	public BusinessAcount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if(amount <= loanLimit) {
		balance += amount - 10;
		}
	}
	
	@Override
	public final void Withdraw(Double amount) {
		super.Withdraw(amount);
		balance -= amount - 2.0;
	}
}
