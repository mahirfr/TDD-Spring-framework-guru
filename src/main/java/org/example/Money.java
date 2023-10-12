package org.example;

public class Money {

    protected int amount;

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return money.amount == amount;
    }

}
