package it.sevenbits.rogue_like.instances;

import it.sevenbits.rogue_like.interfaces.IArmor;

public class Helm implements IArmor {
    private int durabilityValue;
    private int protectionValue;
    private String name;

    public Helm(String name, int durabilityValue, int protectionValue) {
        setDurabilityValue(durabilityValue);
        setProtectionValue(protectionValue);
        setName(name);
    }

    public Helm() {}

    @Override
    public void setDurabilityValue(int durabilityValue) {
        this.durabilityValue = durabilityValue;
    }

    @Override
    public void setProtectionValue(int protectionValue) {
        this.protectionValue = protectionValue;
    }

    @Override
    public void increaseDurabilityValue(int deltaDurabilityValue) {

    }

    @Override
    public void increaseProtectionValue(int protectionValue) {

    }

    @Override
    public void dicreaseDurabilityValue(int deltaDurabilityValue) {

    }

    @Override
    public void dicreaseProtectionValue(int protectionValue) {

    }

    @Override
    public int getDurabilityValue() {
        return durabilityValue;
    }

    @Override
    public int getProtectionValue() {
        return protectionValue;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
