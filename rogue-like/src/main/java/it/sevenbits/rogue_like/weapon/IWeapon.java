package it.sevenbits.rogue_like.weapon;

public interface IWeapon {
    public void setAttackValue(int weaponAttackValue);
    public void setDurabilityValue(int weaponDurabilityValue);
    public void increaseAttackValue(int deltaWeaponAttackValue);
    public void increaseDurabilityValue(int deltaWeaponDurabilityWValue);
    public void dicreaseAttackValue(int deltaWeaponAttackValue);
    public void dicreaseDurabilityValue(int deltaWeaponDurabilityWValue);
    public int getAttackValue();
    public int getDurabilityValue();
    public void setName(String name);
    public String getName();
}
