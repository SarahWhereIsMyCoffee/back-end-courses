package it.sevenbits.rogue_like.weapon.instances;

import it.sevenbits.rogue_like.weapon.IWeapon;

public class Sword implements IWeapon {
    private int attackValue;
    private int durabilityValue;
    private String name;

    public Sword(String name, int attackValue, int durabilityValue) {
        setAttackValue(attackValue);
        setDurabilityValue(durabilityValue);
        setName(name);
    }

    public Sword() {}

    @Override
    public void setAttackValue(int weaponAttackValue) {
        attackValue = weaponAttackValue;
    }

    @Override
    public void setDurabilityValue(int weaponDurabilityValue) {
        durabilityValue = weaponDurabilityValue;
    }

    @Override
    public void increaseAttackValue(int deltaWeaponAttackValue) {

    }

    @Override
    public void increaseDurabilityValue(int deltaWeaponDurabilityWValue) {

    }

    @Override
    public void dicreaseAttackValue(int deltaWeaponAttackValue) {

    }

    @Override
    public void dicreaseDurabilityValue(int deltaWeaponDurabilityWValue) {

    }

    @Override
    public int getAttackValue() {
        return attackValue;
    }

    @Override
    public int getDurabilityValue() {
        return durabilityValue;
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
