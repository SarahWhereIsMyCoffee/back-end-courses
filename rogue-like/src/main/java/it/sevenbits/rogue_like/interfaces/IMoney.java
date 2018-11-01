package it.sevenbits.rogue_like.interfaces;

public interface IMoney {
    public void increaseMoneyValue(int deltaMoneyValue);
    public void dicreaseMoneyValue(int deltaMoneyValue);
    public int getMoneyValue();
    public void setMoneyValue(int moneyValue);
}
