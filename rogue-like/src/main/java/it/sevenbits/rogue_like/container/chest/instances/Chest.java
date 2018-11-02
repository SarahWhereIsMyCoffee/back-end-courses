package it.sevenbits.rogue_like.container.chest.instances;

import it.sevenbits.rogue_like.armor.IArmor;
import it.sevenbits.rogue_like.container.chest.IChest;
import it.sevenbits.rogue_like.money.instances.Gold;
import it.sevenbits.rogue_like.util.Pair;
import it.sevenbits.rogue_like.weapon.IWeapon;

import java.util.HashMap;

public class Chest implements IChest {
    private HashMap<String, IWeapon> weaponList = new HashMap<>();
    private HashMap<String, IArmor> armorList = new HashMap<>();
    private Gold gold = new Gold();

    public Chest(Pair<String, IWeapon> weapon, Pair<String, IArmor> armor, int moneyValue) {
        weaponList.put(weapon.getName(), weapon.getValue());
        armorList.put(armor.getName(), armor.getValue());
        gold.setValue(moneyValue);
    }

    public Chest() {}

    public Object getWeaponItem(String itemName) {
       return weaponList.get(itemName);
    }

    public Object getArmorItem(String itemName) {
        return armorList.get(itemName);
    }

    public void putWeaponItem(Pair<String, IWeapon> weapon) {
        weaponList.put(weapon.getName(), weapon.getValue());
    }

    public void putArmorItem(Pair<String, IArmor> armor) {
        armorList.put(armor.getName(), armor.getValue());
    }

    public void removeWeaponItem(String itemName) {

    }

    public void removeArmorItem(String itemName) {

    }

    public void setMoneyValue(int goldAmount) {
        gold.setValue(goldAmount);
    }

    public int getMoneyAmount() {
        return gold.getValue();
    }

    public void putMoney(int moneyValue) {

    }

    public void dicreaseMoneyValue(int deltaMoneyValue) {
    }

    public void increaseMoneyValue(int deltaMoneyValue) {
    }

    public void getWeaponsNamesWithCharacteristics() {
        weaponList.forEach((k,v) -> System.out.println(weaponList.keySet()));
    }

    public void getArmorsNamesWithCharacteristics() {
        armorList.forEach((k,v) -> System.out.println(armorList.keySet()));
    }

    public HashMap<String, IWeapon> getAllWeapons() {
        return weaponList;
    }

    public HashMap<String, IArmor> getAllArmors() {
        return armorList;
    }
}
