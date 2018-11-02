package it.sevenbits.rogue_like.instances;

import it.sevenbits.rogue_like.interfaces.IMoney;

public class Gold implements IMoney {
    private int goldAmount;

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
}
