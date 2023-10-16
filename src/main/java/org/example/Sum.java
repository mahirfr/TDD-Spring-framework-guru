package org.example;

public class Sum implements Expression {
    public Expression augmend;
    public Expression addend;

    public Sum(Expression augmend, Expression addend) {
        this.augmend = augmend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int amount =
                this.augmend.reduce(bank, to).amount + this.addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression addend) {
        return null;
    }
}
