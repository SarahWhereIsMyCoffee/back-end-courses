package it.sevenbits.rogue_like.container.inventory.instances;

import it.sevenbits.rogue_like.armor.IArmor;
import it.sevenbits.rogue_like.container.chest.instances.Chest;
import it.sevenbits.rogue_like.container.inventory.IInventory;
import it.sevenbits.rogue_like.money.instances.Gold;
import it.sevenbits.rogue_like.util.Pair;
import it.sevenbits.rogue_like.weapon.IWeapon;

import java.util.HashMap;

public class Inventory implements IInventory {
    private HashMap<String, IWeapon> weaponList = new HashMap<>();
    private HashMap<String, IArmor> armorList = new HashMap<>();
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

    public void setMoneyValue(int moneyValue) {
        gold.setValue(moneyValue);
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
        weaponList.forEach((k,v) -> System.out.format("%20s%10d%16d\n", weaponList.get(k).getName(),
                weaponList.get(k).getAttackValue(), weaponList.get(k).getDurabilityValue()));
    }

    public void getArmorsNamesWithCharacteristics() {
        armorList.forEach((k,v) -> System.out.format("%20s%10d%16d\n", armorList.get(k).getName(),
                armorList.get(k).getProtectionValue(), armorList.get(k).getDurabilityValue()));
    }

    public HashMap<String, IWeapon> getAllWeapons() {
        return weaponList;
    }

    public HashMap<String, IArmor> getAllArmors() {
        return armorList;
    }
}
