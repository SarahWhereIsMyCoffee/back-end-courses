package it.sevenbits.rogue_like.instances;

import it.sevenbits.rogue_like.interfaces.IMoney;

public class Gold implements IMoney {
    private int moneyValue;


    @Override
    public void increaseMoneyValue(int deltaMoneyValue) {
        moneyValue += deltaMoneyValue;
    }

    @Override
    public void dicreaseMoneyValue(int deltaMoneyValue) {
        moneyValue -= deltaMoneyValue;
    }

    @Override
    public int getMoneyValue() {
        return moneyValue;
    }

    @Override
    public void setMoneyValue(int moneyValue) {
        this.moneyValue = moneyValue;
    }


}
