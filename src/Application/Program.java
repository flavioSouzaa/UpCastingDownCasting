package Application;

import java.io.ObjectInputStream.GetField;

import Entities.Account;
import Entities.BusinessAcount;
import Entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		
		Account acc = new Account(1001, "alex", 1000.0);
		BusinessAcount bcc = new BusinessAcount(1023, "maria", 1000.0, 500.00);
	
		//UpCasting
		Account acc1 = bcc;
		Account acc2 = new BusinessAcount(102, "paulo", 50.00, 200.00);
		Account acc3 = new SavingsAccount(1209, "diogo", 1000.00, 0.01);
	
	
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
			//System.out.println("Update");
		}
		
	// teste de UpCasting e DownCastin
		System.out.println("------UpCasting e DownCastin---------------------------");
		acc.Withdraw(200.00);
		System.out.println(acc.getBalance());
		
		acc3.Withdraw(200.0);
		System.out.println(acc3.getBalance());
		
		bcc.Withdraw(200.0);
		System.out.print(bcc.getBalance());
		System.out.println("\n-------Polimorfismos--------------------------------\n");
	
		Account x = new Account(1024, "Douglas", 1500.0);
		Account y = new SavingsAccount(1045, "Pedro", 1500.0, 0.01);
		
		x.Withdraw(350.0);
		y.Withdraw(350.0);
		
		System.out.println(x.getHolder() + " " + x.getNumber() + " " + x.getBalance());
		System.out.println(y.getHolder() + "   " + y.getNumber() + " " + y.getBalance());
		System.out.println("\n-----------------------------------------------------\n");
	
	}

}
