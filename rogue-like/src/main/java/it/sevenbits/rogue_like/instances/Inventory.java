package it.sevenbits.rogue_like.instances;

import it.sevenbits.rogue_like.interfaces.IInventory;

import java.util.HashMap;

public class Inventory implements IInventory {
    private HashMap<String, Object> weaponList = new HashMap<>();
    private HashMap<String, Object> armorList = new HashMap<>();
    private Gold gold = new Gold();

    public Inventory() {

    }

    public void getWeaponsFromChest(Chest chest) {
        weaponList.putAll(chest.getAllWeapons());
    }

    public void getArmorsFromChest(Chest chest) {
        armorList.putAll(chest.getAllArmors());
    }

    public void getMoneyFromChest(Chest chest) {
        gold.setValue(chest.getMoneyAmount());
    }

    @Override
    public Object getWeaponItem(String itemName) {
        return weaponList.get(itemName);
    }

    @Override
    public Object getArmorItem(String itemName) {
          return armorList.get(itemName);
    }

    @Override
    public void putWeaponItem(Pair<String, Object> weapon) {
        weaponList.put(weapon.getName(), weapon.getValue());
    }

    @Override
    public void putArmorItem(Pair<String, Object> armor) {
        armorList.put(armor.getName(), armor.getValue());
    }

    @Override
    public void removeWeaponItem(String itemName) {
    }

    @Override
    public void removeArmorItem(String itemName) {
    }

    @Override
    public void setMoneyValue(int moneyValue) {
        gold.setValue(moneyValue);
    }

    @Override
    public int getMoneyAmount() {
       return gold.getValue();
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
        weaponList.forEach((k,v) -> System.out.println(k));
    }

    @Override
    public void getArmorsNames() {
        armorList.forEach((k,v) -> System.out.println(k));
    }

    @Override
    public HashMap<String, Object> getAllWeapons() {
        return null;
    }

    @Override
    public HashMap<String, Object> getAllArmors() {
        return null;
    }
}
