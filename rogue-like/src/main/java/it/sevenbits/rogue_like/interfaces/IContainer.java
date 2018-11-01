package it.sevenbits.rogue_like.interfaces;

public interface IContainer {
    public Object getWeaponItem(String itemName);
    public Object getArmorItem(String itemName);
    public void putWeaponItem(String itemName, Object item);
    public void putArmorItem(String itemName, Object item);
    public void removeWeaponItem(String itemName);
    public void removeArmorItem(String itemName);
    public void setMoneyValue(int moneyValue);
    public int getMoneyValue();
    public void dicreaseMoneyValue(int deltaMoneyValue);
    public void increaseMoneyValue(int deltaMoneyValue);
}
