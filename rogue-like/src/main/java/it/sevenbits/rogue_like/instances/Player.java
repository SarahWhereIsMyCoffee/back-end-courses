package it.sevenbits.rogue_like.instances;

import it.sevenbits.rogue_like.interfaces.IPlayer;

import java.util.HashMap;

public class Player implements IPlayer {
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
        // healthValue -= attackValue
    }

    @Override
    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    @Override
    public int getHealthValue() {
        return healthValue;
    }

    @Override
    public void getWeaponsFromChest(Chest chest) {
        inventory.getWeaponsFromChest(chest);
    }

    @Override
    public void getArmorsFromChest(Chest chest) {
        inventory.getArmorsFromChest(chest);
    }

    @Override
    public void getMoneyFromChest(Chest chest) {
        inventory.getMoneyFromChest(chest);
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public Object getWeaponItem(String itemName) {
       return inventory.getWeaponItem(itemName);
    }

    @Override
    public Object getArmorItem(String itemName) {
        return inventory.getArmorItem(itemName);
    }

    @Override
    public void putWeaponItem(Pair<String, Object> weapon) {
        inventory.putWeaponItem(weapon);
    }

    @Override
    public void putArmorItem(Pair<String, Object> armor) {
        inventory.putArmorItem(armor);
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
    public int getMoneyAmount() {
        return inventory.getMoneyAmount();
    }

    @Override
    public void putMoney(int moneyValue) {
    }

    @Override
    public void dicreaseMoneyValue(int deltaMoneyValue) {
    }

    @Override
    public void increaseMoneyValue(int deltaMoneyValue) {
    }

    @Override
    public void getWeaponsNames() {
        inventory.getWeaponsNames();
    }

    @Override
    public void getArmorsNames() {
        inventory.getArmorsNames();
    }

    @Override
    public HashMap<String, Object> getAllWeapons() {
        return inventory.getAllWeapons();
    }

    @Override
    public HashMap<String, Object> getAllArmors() {
        return inventory.getAllArmors();
    }

    @Override
    public void move(int deltaCoordX, int deltaCoordY) {
    }

    @Override
    public int getCoordX() {
        return coordX;
    }

    @Override
    public int getCoordY() {
        return coordY;
    }
}
