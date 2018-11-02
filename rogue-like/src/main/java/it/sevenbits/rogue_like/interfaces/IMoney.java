package it.sevenbits.rogue_like.interfaces;

public interface IMoney {
    public void increase(int deltaMoneyAmount);
    public void dicrease(int deltaMoneyAmount);
    public int getValue();
    public void setValue(int moneyAmount);
}
