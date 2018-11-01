package it.sevenbits.rogue_like.instances;

import it.sevenbits.rogue_like.interfaces.IPlayer;

public class Player implements IPlayer {

    private Sword swordOfDarkMagic = new Sword();
    private Helm helmOfDominator = new Helm();
    private Inventory inventory = new Inventory();

    private int healthValue;
    private int coordX;
    private int coordY;

    public Player(int healthValue) {
        setHealthValue(healthValue);
        inventory.setMoneyValue(10);
    }

    @Override
    public void getAttacked(int attackValue) {
        int currentArmor = 0;
    }

    @Override
    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public Object getWeaponItem(String itemName) {
        return null;
    }

    @Override
    public Object getArmorItem(String itemName) {
        return null;
    }

    @Override
    public void putWeaponItem(String itemName, Object item) {

    }

    @Override
    public void putArmorItem(String itemName, Object item) {

    }

    @Override
    public void removeWeaponItem(String itemName) {

    }

    @Override
    public void removeArmorItem(String itemName) {

    }

    @Override
    public void setMoneyValue(int moneyValue) {

    }

    @Override
    public int getMoneyValue() {
        return 0;
    }

    @Override
    public void dicreaseMoneyValue(int deltaMoneyValue) {

    }

    @Override
    public void increaseMoneyValue(int deltaMoneyValue) {

    }

    @Override
    public void move(int deltaCoordX, int deltaCoordY) {

    }

    @Override
    public int getCoordX() {
        return 0;
    }

    @Override
    public int getCoordY() {
        return 0;
    }
}
