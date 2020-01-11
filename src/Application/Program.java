package Application;

import Entities.Account;
import Entities.BusinessAcount;
import Entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "alex", 0.0);
		BusinessAcount bcc = new BusinessAcount(1023, "maria", 0.0, 100.00);
	
		//UpCasting
		Account acc1 = bcc;
		Account acc2 = new BusinessAcount(102, "paulo", 50.00, 200.00);
		Account acc3 = new SavingsAccount(1209, "diogo", 100.00, 0.32);
	
	
		//DownCasting
		
		BusinessAcount acc4 = (BusinessAcount)acc2;
		acc4.loan(100.00);
		
		//forma errada 
		//BusinessAcount acc5 = (BusinessAcount) acc2;
		
		if(acc3 instanceof BusinessAcount) {
			BusinessAcount acc5 = (BusinessAcount)acc3;
			acc5.loan(100.00);
			System.out.println("loan");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.UpdateBalance(100.00);
			System.out.println("Update");
		}
	}

}
