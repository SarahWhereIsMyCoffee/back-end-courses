package it.sevenbits.rogue_like.money.instances;

import it.sevenbits.rogue_like.money.IMoney;

public class Gold implements IMoney {
    private int goldAmount;
    private String name = "Золото";
    public Gold() {
    }

    @Override
    public void increase(int deltaGoldAmount) {
        goldAmount += deltaGoldAmount;
    }

    @Override
    public void dicrease(int deltaGoldAmount) {
        goldAmount -= deltaGoldAmount;
    }

    @Override
    public int getValue() {
        return goldAmount;
    }

    @Override
    public void setValue(int goldAmount) {
        this.goldAmount = goldAmount;
    }

    @Override
    public String getName() {
        return name;
    }
}
