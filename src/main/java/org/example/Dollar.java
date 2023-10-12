package org.example;

public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        Dollar dollar = (Dollar) o;
        return dollar.amount == amount;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(amount);
//    }
}
