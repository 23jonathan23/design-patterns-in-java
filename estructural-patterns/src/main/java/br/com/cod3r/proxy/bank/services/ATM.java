package br.com.cod3r.proxy.bank.services;

public class ATM implements BankOperations {
    private BankOperations _bank;

    public ATM(BankOperations bank) {
        _bank = bank;
    }

    public void deposit(Long account, double amount) {
        System.out.println("ATM proxy sending request to bank");
        _bank.deposit(account, amount);
    }

	public void withdraw(Long account, String passwd, double amount) {
        if(amount > 300) {
            System.out.println("You may not withdraw amounts over 300 here");
            return;
        }

        System.out.println("ATM proxy sending request to bank");
        _bank.withdraw(account, passwd, amount);
    }

	public void changePassword(Long account, String oldPassword, String newPassword) {
        System.out.println("You must go to the bank to perform this operation");
        return;
    }
}
