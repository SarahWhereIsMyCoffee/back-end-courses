package it.sevenbits.rogue_like.interfaces;

import it.sevenbits.rogue_like.instances.Pair;
import java.util.HashMap;

public interface IContainer {
    public Object getWeaponItem(String itemName);
    public Object getArmorItem(String itemName);
    public void putWeaponItem(Pair<String, Object> weapon);
    public void putArmorItem(Pair<String, Object> armor);
    public void removeWeaponItem(String itemName);
    public void removeArmorItem(String itemName);
    public void setMoneyValue(int moneyValue);
    public int getMoneyAmount();
    public void putMoney(int moneyValue);
    public void dicreaseMoneyValue(int deltaMoneyValue);
    public void increaseMoneyValue(int deltaMoneyValue);
    public void getWeaponsNames();
    public void getArmorsNames();
    public HashMap<String, Object> getAllWeapons();
    public HashMap<String, Object> getAllArmors();
}
