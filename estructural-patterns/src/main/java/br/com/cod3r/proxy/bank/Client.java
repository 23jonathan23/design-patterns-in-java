package br.com.cod3r.proxy.bank;

import br.com.cod3r.proxy.bank.services.ATM;
import br.com.cod3r.proxy.bank.services.Bank;
import br.com.cod3r.proxy.bank.services.BankOperations;

public class Client {

	public static void main(String[] args) {
		BankOperations bank = new Bank();
		bank.deposit(123L, 500);
		bank.withdraw(456L, "8888", 50);
		bank.withdraw(456L, "9999", 50);
		bank.withdraw(123L, "1234", 2000);
		bank.changePassword(123L, "1111", "4321");
		bank.changePassword(123L, "1234", "4321");
		bank.withdraw(123L, "4321", 700);
		
		System.out.println("------------- ATM -------------");
		BankOperations atm = new ATM(bank);
		atm.deposit(123L, 500);
		atm.withdraw(456L, "8888", 50);
		atm.withdraw(456L, "9999", 50);
		atm.withdraw(123L, "1234", 2000);
		atm.changePassword(123L, "1111", "4321");
		atm.changePassword(123L, "1234", "4321");
		atm.withdraw(123L, "4321", 700);
		
	}
}
