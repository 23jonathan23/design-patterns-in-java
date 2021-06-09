package br.com.cod3r.chain.billsDispenser;

public class Client {

	public static void main(String[] args) {
		Dispenser dispenser = new Dispenser();
		System.out.println("Withdrawing $230...");
		dispenser.withDraw(230);
		System.out.println("Withdrawing $1589...");
		dispenser.withDraw(1589);
	}
}
