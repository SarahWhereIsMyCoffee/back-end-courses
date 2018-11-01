package it.sevenbits.rogue_like.instances;

import it.sevenbits.rogue_like.interfaces.IInventory;

import java.util.HashMap;

public class Inventory implements IInventory {
    private HashMap<String, Object> weaponList = new HashMap<>();
    private HashMap<String, Object> armorList = new HashMap<>();
    private Gold money = new Gold();
    /*
    public Inventory() {

    }
     */
    @Override
    public Object getWeaponItem(String itemName) {
        return weaponList.get(itemName);
    }

    @Override
    public Object getArmorItem(String itemName) {
          return armorList.get(itemName);
    }

    @Override
    public void putWeaponItem(String itemName, Object item) {
        weaponList.put(itemName, item);
    }

    @Override
    public void putArmorItem(String itemName, Object item) {
        armorList.put(itemName, item);
    }

    @Override
    public void removeWeaponItem(String itemName) {

    }

    @Override
    public void removeArmorItem(String itemName) {

    }

    @Override
    public void setMoneyValue(int moneyValue) {
        money.setMoneyValue(moneyValue);
    }

    @Override
    public int getMoneyValue() {
       return money.getMoneyValue();
    }

    @Override
    public void dicreaseMoneyValue(int deltaMoneyValue) {
    }

    @Override
    public void increaseMoneyValue(int deltaMoneyValue) {
    }
}
