package it.sevenbits.rogue_like.instances;

import it.sevenbits.rogue_like.interfaces.IChest;
import java.util.HashMap;

public class Chest implements IChest {
    private HashMap<String, Object> weaponList = new HashMap<>();
    private HashMap<String, Object> armorList = new HashMap<>();
    private Gold gold = new Gold();

    public Chest(Pair<String, Object> weapon, Pair<String, Object> armor, int moneyValue) {
        weaponList.put(weapon.getName(), weapon.getValue());
        armorList.put(armor.getName(), armor.getValue());
        gold.setValue(moneyValue);
    }

    public Chest() {}

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
    public void setMoneyValue(int goldAmount) {
        gold.setValue(goldAmount);
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
        weaponList.forEach((k,v) -> System.out.println(weaponList.keySet()));
    }

    @Override
    public void getArmorsNames() {
        armorList.forEach((k,v) -> System.out.println(armorList.keySet()));
    }

    @Override
    public HashMap<String, Object> getAllWeapons() {
        return weaponList;
    }

    @Override
    public HashMap<String, Object> getAllArmors() {
        return armorList;
    }
}
