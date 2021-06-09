package br.com.cod3r.chain.billsDispenser;

public class Bill {
    private int _value;
    private Bill _next;

    public Bill(int value) {
        _value = value;
    }

    public Bill(int value, Bill next) {
        _value = value;
        _next = next;
    }

    public void setNext(Bill next) {
        _next = next;
    }

    public void execute(int remaining) {
        if(remaining >= _value) {
            int bills = remaining / _value;
            remaining %= _value;
			System.out.println(String.format("- %d bill(s) of $%d, $%d remaining", bills, _value, remaining));
        }

        if(remaining == 0) return;
        if(_next != null) _next.execute(remaining);
    }
}
