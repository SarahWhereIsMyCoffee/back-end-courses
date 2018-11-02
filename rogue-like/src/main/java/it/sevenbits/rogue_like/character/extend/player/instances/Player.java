package it.sevenbits.rogue_like.character.extend.player.instances;

import it.sevenbits.rogue_like.armor.IArmor;
import it.sevenbits.rogue_like.character.extend.player.IPlayer;
import it.sevenbits.rogue_like.container.chest.instances.Chest;
import it.sevenbits.rogue_like.container.inventory.instances.Inventory;
import it.sevenbits.rogue_like.util.Pair;
import it.sevenbits.rogue_like.weapon.IWeapon;

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

    public void getAttacked(int attackValue) {
        // healthValue -= attackValue
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void getWeaponsFromChest(Chest chest) {
        inventory.getWeaponsFromChest(chest);
    }

    public void getArmorsFromChest(Chest chest) {
        inventory.getArmorsFromChest(chest);
    }

    public void getMoneyFromChest(Chest chest) {
        inventory.getMoneyFromChest(chest);
    }

    public int attack() {
        return 0;
    }

    public Object getWeaponItem(String itemName) {
       return inventory.getWeaponItem(itemName);
    }

    public Object getArmorItem(String itemName) {
        return inventory.getArmorItem(itemName);
    }

    public void putWeaponItem(Pair<String, IWeapon> weapon) {
        inventory.putWeaponItem(weapon);
    }

    public void putArmorItem(Pair<String, IArmor> armor) {
        inventory.putArmorItem(armor);
    }

    public void removeWeaponItem(String itemName) {
    }

    public void removeArmorItem(String itemName) {
    }

    public void setMoneyValue(int moneyValue) {
    }

    public int getMoneyAmount() {
        return inventory.getMoneyAmount();
    }

    public void putMoney(int moneyValue) {
    }

    public void dicreaseMoneyValue(int deltaMoneyValue) {
    }

    public void increaseMoneyValue(int deltaMoneyValue) {
    }

    public void getWeaponsNamesWithCharacteristics() {
        inventory.getWeaponsNamesWithCharacteristics();
    }

    public void getArmorsNamesWithCharacteristics() {
        inventory.getArmorsNamesWithCharacteristics();
    }

    public HashMap<String, IWeapon> getAllWeapons() {
        return inventory.getAllWeapons();
    }

    public HashMap<String, IArmor> getAllArmors() {
        return inventory.getAllArmors();
    }

    public void move(int deltaCoordX, int deltaCoordY) {
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }
}
