package br.com.cod3r.proxy.bank.services;

public interface BankOperations {
	void deposit(Long account, double amount);
	void withdraw(Long account, String passwd, double amount);
	void changePassword(Long account, String oldPassword, String newPassword);
}
